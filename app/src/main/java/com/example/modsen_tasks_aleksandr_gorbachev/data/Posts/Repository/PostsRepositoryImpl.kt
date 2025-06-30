package com.example.modsen_tasks_aleksandr_gorbachev.data.Posts.Repository

import com.example.modsen_tasks_aleksandr_gorbachev.data.Posts.Api.PostsApi
import com.example.modsen_tasks_aleksandr_gorbachev.domain.Posts.PostDomainModel
import com.example.modsen_tasks_aleksandr_gorbachev.domain.Posts.Repository.IPostsRepository

class PostsRepositoryImpl(private val api: PostsApi) : IPostsRepository {
    override suspend fun getPosts(): List<PostDomainModel> {
        return api.getPosts().map {
            PostDomainModel(it.id, it.title, it.body)
        }
    }
}