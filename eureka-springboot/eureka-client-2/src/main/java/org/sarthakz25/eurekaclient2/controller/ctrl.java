package org.sarthakz25.eurekaclient2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ctrl {
//    rest template is used for normal synchronous communication

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/ms2")
    public String display() {
        String ms1Response = restTemplate.getForObject("http://eureka-client-1:8081/ms1", String.class);
        return "this is an output from microservice 2 and " + ms1Response;
    }
}
