package com.service.ressource_service.feignClient;

import lombok.Data;

import java.sql.Date;

@Data
public class Task {

    private Integer taskId;
    private String taskName;
    private String taskDescription;
    private Date taskStart;
    private Date taskEnd;

    private Taskstatus taskStatus;

    private Integer project_id;
}
