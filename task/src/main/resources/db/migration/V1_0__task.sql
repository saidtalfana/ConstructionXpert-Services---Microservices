CREATE TABLE task (
                      task_id INT PRIMARY KEY AUTO_INCREMENT,
                      task_name VARCHAR(255) NOT NULL,
                      task_description TEXT,
                      task_start_date DATE,
                      task_end_date DATE,
                      task_status ENUM('Pending', 'In Progress', 'Completed') NOT NULL,
                      project_id BIGINT NOT NULL
)



