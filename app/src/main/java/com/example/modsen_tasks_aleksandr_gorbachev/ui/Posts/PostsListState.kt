package com.example.modsen_tasks_aleksandr_gorbachev.ui.Posts

import com.example.modsen_tasks_aleksandr_gorbachev.domain.Posts.PostDomainModel

data class PostsListState(
    val posts: List<PostDomainModel> = emptyList(),
    val isLoading: Boolean = false,
    val error: String = ""
)

