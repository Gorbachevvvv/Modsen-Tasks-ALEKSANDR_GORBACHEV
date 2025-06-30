package com.example.modsen_tasks_aleksandr_gorbachev.data.Posts.Api

import com.example.modsen_tasks_aleksandr_gorbachev.data.Posts.Model.PostDataModel
import retrofit2.http.GET

interface PostsApi {
    @GET("posts")
    suspend fun getPosts(): List<PostDataModel>
}