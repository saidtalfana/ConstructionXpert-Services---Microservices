package com.service.ressource_service.service;

import com.service.ressource_service.Repository.ResourceRepository;
import com.service.ressource_service.model.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceService {

    @Autowired
    private ResourceRepository resourceRepository;

    public Resource addResource(Resource resource) {
        return resourceRepository.save(resource);
    }

    public List<Resource> getAllResourcesByTaskId(Integer taskId) {
        return resourceRepository.getAllResourceByTaskId(taskId);
    }

    public void deleteResource(Integer id) {
        resourceRepository.deleteById(id);
    }

    public Resource updateResource(Resource resource,Integer id) {

        Resource existingResource = resourceRepository.findById(id).get();
        resource.setResourceName(existingResource.getResourceName());
        resource.setResourceType(existingResource.getResourceType());
        resource.setQuantity(existingResource.getQuantity());
        resource.setProviderInformation(existingResource.getProviderInformation());
        return resourceRepository.save(resource);
    }
}
