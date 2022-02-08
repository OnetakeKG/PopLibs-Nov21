package ru.fylmr.poplibs_nov21.rxjava

import android.util.Log
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers

//fun multiThreadingSingle() = Single.fromCallable {
//    Log.d("Thread", "Thread: ${Thread.currentThread().name}")
//    randomResultOperation()
//}
//
//fun subscribeToMultiThreadingSingle() {
//    multiThreadingSingle()
//        .subscribeOn(Schedulers.io())
//        .observeOn(Schedulers.computation())
//        .map {
//            Log.d("Thread", "Thread: ${Thread.currentThread().name}")
//            it
//        }
//        .observeOn(AndroidSchedulers.mainThread())
//        .subscribe(
//            {
//                Log.d("Thread", "Thread: ${Thread.currentThread().name}")
//                Log.d("Single", "Successful single: $it")
//            }, {
//                Log.e("Single", "Error running single", it)
//            }
//        )
//}
