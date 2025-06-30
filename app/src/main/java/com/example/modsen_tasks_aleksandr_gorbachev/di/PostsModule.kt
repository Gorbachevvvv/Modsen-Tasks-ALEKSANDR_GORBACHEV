package com.example.modsen_tasks_aleksandr_gorbachev.di

import com.example.modsen_tasks_aleksandr_gorbachev.data.Posts.Api.PostsApi
import com.example.modsen_tasks_aleksandr_gorbachev.data.Posts.Repository.PostsRepositoryImpl
import com.example.modsen_tasks_aleksandr_gorbachev.domain.Posts.Repository.IPostsRepository
import com.example.modsen_tasks_aleksandr_gorbachev.domain.Posts.Usecase.GetPostsUseCase
import com.example.modsen_tasks_aleksandr_gorbachev.ui.Posts.PostsViewModel
import com.example.modsen_tasks_aleksandr_gorbachev.ui.Tasks.TasksListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val postsModule = module {
    single<PostsApi> {
        Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PostsApi::class.java)
    }

    single<IPostsRepository> { PostsRepositoryImpl(get()) }
    single { GetPostsUseCase(get()) }
    viewModel { PostsViewModel(get()) }
}
