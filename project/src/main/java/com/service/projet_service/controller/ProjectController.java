package com.service.projet_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {




    @GetMapping("/project")
    public String string() {
        return "Hello World";
    }
}
