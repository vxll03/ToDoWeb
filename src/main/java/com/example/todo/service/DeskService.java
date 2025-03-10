package com.example.todo.service;

import com.example.todo.model.Desk;
import com.example.todo.repository.DeskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeskService {

    @Autowired
    private DeskRepository deskRepository;

    public List<Desk> getAllDesks() {
        return deskRepository.findAll();
    }

    public Optional<Desk> getDeskById(Long id) {
        return deskRepository.findById(id);
    }

    public Desk saveDesk (Desk desk) {
        return deskRepository.save(desk);
    }

    public void deleteDesk(Long id) {
        deskRepository.deleteById(id);
    }
}
