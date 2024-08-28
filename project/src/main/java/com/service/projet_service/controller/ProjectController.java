package com.service.projet_service.controller;

import com.service.projet_service.model.Project;
import com.service.projet_service.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;



    @PostMapping("/add_project")
    public String addProject(@RequestBody Project project) {
        projectService.addProject(project);

        return "Project added";
    }

    @DeleteMapping("/delete_project")
    public String deleteProject(@RequestBody Project project) {
        projectService.deleteProject(project);
        return "Project deleted";
    }
    @GetMapping("get_all_project")
    public List<Project> getAllProject() {
        return projectService.getAllProjects();
    }
    @GetMapping("get_by_id/{id}")
    public Project getProjectById(@PathVariable int id) {
        return projectService.getProjectById(id);
    }

    @PutMapping("/update_project/{id}")
    public String updateProject(@RequestBody Project project, @PathVariable int id) {
        projectService.updateProject(project,id);
        return "Project updated";
    }




    @GetMapping("/project")
    public String string() {
        return "Hello World";
    }
}
