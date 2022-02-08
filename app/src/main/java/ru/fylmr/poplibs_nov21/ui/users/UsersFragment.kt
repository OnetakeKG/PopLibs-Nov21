package ru.fylmr.poplibs_nov21.ui.users


import android.graphics.Bitmap
import android.graphics.BitmapFactory

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter
import ru.fylmr.poplibs_nov21.App

import ru.fylmr.poplibs_nov21.databinding.FragmentUsersBinding
import ru.fylmr.poplibs_nov21.domain.GithubUsersRepository
import ru.fylmr.poplibs_nov21.model.GithubUserModel
import ru.fylmr.poplibs_nov21.ui.base.BackButtonListener
import ru.fylmr.poplibs_nov21.ui.users.adapter.UsersAdapter
import java.io.ByteArrayOutputStream
import java.io.IOException


import android.content.res.AssetManager
import java.io.InputStream
import java.nio.channels.AsynchronousFileChannel.open
import java.util.stream.Stream
import android.R.string





class UsersFragment : MvpAppCompatFragment(), UsersView, BackButtonListener {

    private val presenter by moxyPresenter {
        UsersPresenter(
            App.instance.router,
            GithubUsersRepository()
        )
    }

    private var _binding: FragmentUsersBinding? = null
    private val binding
        get() = _binding!!

    private val adapter by lazy {
        UsersAdapter { presenter.onUserClicked() }
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUsersBinding.inflate(inflater, container, false)


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        fun assetsToBitmap(fileName: String): Bitmap? {
            return try {

                val stream: InputStream = resources.assets.open(fileName) as InputStream //ошбика в этой строчке
                BitmapFactory.decodeStream(stream)
            } catch (e: IOException) {
                e.printStackTrace()
                Log.d("@@@","Бэд эвэй")
                null
            }
        }

        fun Bitmap.compress(
            format: Bitmap.CompressFormat = Bitmap.CompressFormat.JPEG,
            quality: Int = 100
        ): Bitmap {

            val stream = ByteArrayOutputStream()

            this.compress(
                format,
                quality,
                stream
            )

            val byteArray = stream.toByteArray()

            return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.size)
        }

        val bitmap = assetsToBitmap("tiger1.jpg")

        binding.imageViewBitmap.setImageBitmap(bitmap)
        binding.button.setOnClickListener {
            if(bitmap!=null){
                // Compress bitmap and convert image format from one to another
                val compressedBitmap = bitmap.compress(Bitmap.CompressFormat.PNG)
                //val compressedBitmap = bitmap.compress(Bitmap.CompressFormat.WEBP)

                //val compressedBitmap = bitmap.compress(Bitmap.CompressFormat.JPEG)
                //val compressedBitmap = bitmap.compress(Bitmap.CompressFormat.JPEG, 10)
                //val compressedBitmap = bitmap.compress(quality = 10) // Compress only


                // Display the compressed bitmap into image view
                binding.imageViewCompressed.setImageBitmap(compressedBitmap)

                // Notify user

            }else{
                Log.d("@@@e", "error1700")
            }
        }








        binding.usersRecycler.layoutManager = LinearLayoutManager(requireContext())
        binding.usersRecycler.adapter = adapter
    }

    override fun updateList(users: List<GithubUserModel>) {
        adapter.submitList(users)
    }

    override fun backPressed(): Boolean {
        presenter.backPressed()
        return true
    }
}