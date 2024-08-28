CREATE TABLE resource (
                          resource_id INT PRIMARY KEY AUTO_INCREMENT,
                          resource_name VARCHAR(255) NOT NULL,
                          provider_information TEXT,
                          quantity DOUBLE

);