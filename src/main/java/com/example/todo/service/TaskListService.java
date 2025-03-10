package com.example.todo.service;

import com.example.todo.model.TaskList;
import com.example.todo.repository.TaskListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskListService {

    @Autowired
    private TaskListRepository taskListRepository;

    public TaskList saveTaskList(TaskList taskList) {
        return taskListRepository.save(taskList);
    }

    public void deleteTaskList(Long id) {
        taskListRepository.deleteById(id);
    }
}
