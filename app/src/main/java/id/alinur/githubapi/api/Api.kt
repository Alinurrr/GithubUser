package id.alinur.githubapi.api

import id.alinur.githubapi.data.model.DetailUserResponse
import id.alinur.githubapi.data.model.User
import id.alinur.githubapi.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token cfd13ed2048dd28c8f05502914524fa57905208b")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token cfd13ed2048dd28c8f05502914524fa57905208b")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token cfd13ed2048dd28c8f05502914524fa57905208b")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token cfd13ed2048dd28c8f05502914524fa57905208b")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}