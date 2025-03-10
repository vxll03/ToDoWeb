package com.example.todo.controller;

import com.example.todo.model.Desk;
import com.example.todo.service.DeskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/desks")
public class DeskController {
    private final DeskService deskService;

    public DeskController(DeskService deskService) {
        this.deskService = deskService;
    }

    @GetMapping
    public List<Desk> getAllDesks() {
        return deskService.getAllDesks();
    }

    @GetMapping("/{id}")
    public Desk getDeskById(@PathVariable Long id) {
        return deskService.getDeskById(id)
                .orElseThrow(() -> new RuntimeException("Desk not found with id = " + id));
    }

    @PostMapping
    public Desk createDesk(@RequestBody Desk desk) {
        return deskService.saveDesk(desk);
    }

    @PutMapping("/{id}")
    public Desk updateDesk(@PathVariable Long id, @RequestBody Desk desk) {
        desk.setId(id);
        return deskService.saveDesk(desk);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDesk(@PathVariable Long id) {
        deskService.deleteDesk(id);
        return ResponseEntity.noContent().build();
    }
}
