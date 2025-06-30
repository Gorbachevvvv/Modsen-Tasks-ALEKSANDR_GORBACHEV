package com.example.modsen_tasks_aleksandr_gorbachev.domain.Posts.Usecase

import com.example.modsen_tasks_aleksandr_gorbachev.domain.Posts.PostDomainModel
import com.example.modsen_tasks_aleksandr_gorbachev.domain.Posts.Repository.IPostsRepository

class GetPostsUseCase(private val repository: IPostsRepository) {
    suspend operator fun invoke(): List<PostDomainModel> = repository.getPosts()
}
