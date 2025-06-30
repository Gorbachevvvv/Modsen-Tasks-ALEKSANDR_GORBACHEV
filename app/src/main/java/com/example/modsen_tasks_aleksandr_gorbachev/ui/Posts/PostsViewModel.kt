package com.example.modsen_tasks_aleksandr_gorbachev.ui.Posts

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.modsen_tasks_aleksandr_gorbachev.domain.Posts.Usecase.GetPostsUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class PostsViewModel(
    private val getPostsUseCase: GetPostsUseCase
) : ViewModel() {

    private val _state = MutableStateFlow(PostsListState())
    val state: StateFlow<PostsListState> = _state

    init {
        sendIntent(PostsIntent.Load)
    }

    fun sendIntent(intent: PostsIntent) {
        when (intent) {
            PostsIntent.Load -> loadPosts()
        }
    }

    private fun loadPosts() {
        viewModelScope.launch {
            _state.update { it.copy(isLoading = true, error = "") }
            try {
                val posts = getPostsUseCase()
                _state.update { it.copy(posts = posts, isLoading = false) }
            } catch (e: Exception) {
                _state.update { it.copy(error = e.message ?: "Unknown error", isLoading = false) }
            }
        }
    }
}
