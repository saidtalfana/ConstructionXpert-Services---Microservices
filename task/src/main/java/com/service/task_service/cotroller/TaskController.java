package com.service.task_service.cotroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {


    @GetMapping("/task")
    public String string() {
        return "Hello task service";
    }
}
