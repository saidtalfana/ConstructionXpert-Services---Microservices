package com.service.ressource_service.feignClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "project")
public interface TaskClient {
    @GetMapping("/api/task/get_task_by_id/{task_id}")
    Task getProjectById(@PathVariable Long task_id);

}

