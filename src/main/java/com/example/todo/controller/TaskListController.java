package com.example.todo.controller;

import com.example.todo.model.TaskList;
import com.example.todo.service.TaskListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task_lists")
public class TaskListController {
    private final TaskListService listService;

    public TaskListController(TaskListService listService) {
        this.listService = listService;
    }


    @PostMapping
    public TaskList createTaskList(@RequestBody TaskList taskList) {
        return listService.saveTaskList(taskList);
    }

    @PutMapping("/{id}")
    public TaskList changeTaskList(@PathVariable Long id, @RequestBody TaskList taskList) {
        taskList.setId(id);
        return listService.saveTaskList(taskList);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTaskList(@PathVariable Long id) {
        listService.deleteTaskList(id);
        return ResponseEntity.noContent().build();
    }
}
