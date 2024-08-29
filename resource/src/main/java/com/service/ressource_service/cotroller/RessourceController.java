package com.service.ressource_service.cotroller;

import com.service.ressource_service.model.Resource;
import com.service.ressource_service.service.ResourceService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RessourceController {

    @Autowired
    private ResourceService resourceService;

    @PostMapping("add_ressource")
    public String addressource(@RequestBody Resource resource) {
        resourceService.addResource(resource);
        return "success";
    }
    @GetMapping("get_all_resources")
    public List<Resource> getAllResources(@PathVariable Integer task_id) {
        return resourceService.getAllResourcesByTaskId(task_id);
    }
    @DeleteMapping("/delete_resource/{id}")
    public String deleteResource(@PathVariable Integer id) {
        resourceService.deleteResource(id);
        return "resource was deleted";
    }

    @PutMapping("/update_resource")
    public Resource updateResource(@PathVariable Integer id, @RequestBody Resource resource) {
       Resource resource1= resourceService.updateResource(resource,id);
        return resource1;
    }





    @GetMapping("/resource")
    public String string() {
        return "Hello ressource";
    }
}
