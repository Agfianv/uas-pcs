package com.example.github.api

import com.example.github.data.model.DetailUserResponse
import com.example.github.data.model.User
import com.example.github.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token f13c82909fdafa8ecead44ae381e34ff31518556")
    fun getSearchUser(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token f13c82909fdafa8ecead44ae381e34ff31518556")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token f13c82909fdafa8ecead44ae381e34ff31518556")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token f13c82909fdafa8ecead44ae381e34ff31518556")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}