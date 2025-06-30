package com.example.modsen_tasks_aleksandr_gorbachev.ui.Posts

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.modsen_tasks_aleksandr_gorbachev.ui.Common.CustomLoader
import com.example.modsen_tasks_aleksandr_gorbachev.ui.Common.PostItem
import com.example.modsen_tasks_aleksandr_gorbachev.domain.Posts.PostDomainModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun PostsScreen() {
    val vm: PostsViewModel = koinViewModel()
    val state by vm.state.collectAsStateWithLifecycle()
    val intent: (PostsIntent) -> Unit by remember { mutableStateOf(vm::sendIntent) }

    Content(
        state = state,
        intent = intent
    )
}

@Composable
private fun Content(
    state: PostsListState,
    intent: (PostsIntent) -> Unit
) {
    when {
        state.isLoading -> CustomLoader(modifier = Modifier.fillMaxSize())
        state.error.isNotEmpty() -> Text(text = "Error: ${state.error}")
        else -> LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(
                count = state.posts.size,
                key = { index -> state.posts[index].id }
            ) { index ->
                val post = state.posts[index]
                PostItem(post = post)
            }
        }
    }
}
