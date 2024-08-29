package com.service.task_service.service;

import com.service.task_service.Reposirory.TaskRepository;
import com.service.task_service.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;
//    @Autowired
//    private ProjectRepository projectRepository;

    public Task addTask(Task task) {
//        Project project = projectRepository.findById(id);

        return taskRepository.save(task);
    }
    public void deleteTask(Integer id) {
        taskRepository.deleteById(id);
    }
    public List<Task> getTaskByProjectId(Integer project_id) {
        return taskRepository.findByProjectId(project_id);
    }

    public Task getTaskById(Integer id) {
        return taskRepository.findById(id).get();
    }

    public Task updateTask(Task task,Integer id) {
        Task existingTask = taskRepository.findById(id).get();
        task.setTaskName(existingTask.getTaskName());
        task.setTaskDescription(existingTask.getTaskDescription());
        task.setTaskStart(existingTask.getTaskStart());
        task.setTaskEnd(existingTask.getTaskEnd());
        task.setTaskStatus(existingTask.getTaskStatus());
        return taskRepository.save(task);
    }
}
