package ru.fylmr.poplibs_nov21.screens

import com.github.terrakok.cicerone.androidx.FragmentScreen
import ru.fylmr.poplibs_nov21.ui.users.UsersFragment

object AppScreens {

    fun usersScreen() = FragmentScreen {
        UsersFragment()
    }
}