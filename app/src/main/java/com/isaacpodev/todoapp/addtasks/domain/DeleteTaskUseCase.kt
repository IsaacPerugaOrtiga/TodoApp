package com.isaacpodev.todoapp.addtasks.domain

import com.isaacpodev.todoapp.addtasks.data.TaskRepository
import com.isaacpodev.todoapp.addtasks.ui.model.TaskModel
import javax.inject.Inject

class DeleteTaskUseCase @Inject constructor(private val taskRepository: TaskRepository){
    suspend operator fun invoke(taskModel: TaskModel) = taskRepository.delete(taskModel)
}