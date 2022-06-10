package com.gocycle.controller;

import com.gocycle.entity.Node;
import com.gocycle.repository.NodeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NodeController {
    private final NodeRepository repository;

    NodeController(NodeRepository repository) {
        this.repository = repository;
    }
    @PostMapping("/nodes")
    public List<Node> postNode(@RequestBody List<Node> nodes) {
        return repository.saveAll(nodes);
    }
}
