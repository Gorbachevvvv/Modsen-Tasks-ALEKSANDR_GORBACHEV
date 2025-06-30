package com.example.modsen_tasks_aleksandr_gorbachev.domain.Posts.Repository

import com.example.modsen_tasks_aleksandr_gorbachev.domain.Posts.PostDomainModel

interface IPostsRepository {
    suspend fun getPosts(): List<PostDomainModel>
}