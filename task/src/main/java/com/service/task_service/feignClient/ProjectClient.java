package com.service.task_service.feignClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "project")
public interface ProjectClient {
    @GetMapping("/api/project/get_project_by_id/{projectId}")
    Project getProjectById(@PathVariable Long projectId);

}

