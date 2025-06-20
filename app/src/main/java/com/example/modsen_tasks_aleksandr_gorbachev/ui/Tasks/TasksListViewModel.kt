package com.example.modsen_tasks_aleksandr_gorbachev.ui.Tasks

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.modsen_tasks_aleksandr_gorbachev.domain.Tasks.Usecase.GetTasksUseCase
import com.example.modsen_tasks_aleksandr_gorbachev.ui.Common.SingleFlowEvent
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class TasksListViewModel(
    private val getTasksUseCase: GetTasksUseCase
) : ViewModel() {

    private val _state = MutableStateFlow(TasksListState())
    val state: StateFlow<TasksListState> = _state

    private val _event = SingleFlowEvent<TasksListEvent>(viewModelScope)
    val event = _event.flow

    init {
        loadTasks()
    }

    fun onIntent(intent: TasksListIntent) {
        when (intent) {
            is TasksListIntent.ClickTask -> _event.emit(TasksListEvent.NavigateToTask(intent.task))
        }
    }

    private fun loadTasks() {
        viewModelScope.launch {
            _state.update { it.copy(isLoading = true) }
            val tasks = getTasksUseCase()
            _state.update { it.copy(tasks = tasks, isLoading = false) }
        }
    }
}
