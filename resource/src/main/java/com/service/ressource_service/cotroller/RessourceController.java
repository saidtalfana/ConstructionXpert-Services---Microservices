package com.service.ressource_service.cotroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RessourceController {





    @GetMapping("/resource")
    public String string() {
        return "Hello ressource";
    }
}
