package com.example.itdept.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class HrConsumer {
    @Autowired
    private DiscoveryClient  discoveryClient;

    public String getLeave() {
        List<ServiceInstance> instances = discoveryClient.getInstances("HRDept");
        if (instances == null || instances.isEmpty()) {
            return "HR-SERVICE not available right now";
        }
        ServiceInstance instance = instances.get(0);
        String url = instance.getUri() + "/Hr/leave";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, String.class);
    }
}
