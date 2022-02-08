package ru.fylmr.poplibs_nov21.domain

import ru.fylmr.poplibs_nov21.model.GithubUserModel

class GithubUsersRepository {

    private val users = listOf(
        GithubUserModel("user1"),
        GithubUserModel("user2"),
        GithubUserModel("user3"),
        GithubUserModel("user4"),
        GithubUserModel("user5"),
        GithubUserModel("user6"),
    )

    fun getUsers(): List<GithubUserModel> {
        return users
    }
}