package org.sarthakz25.eurekaclient1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ctrl {
    @GetMapping("/ms1")
    public String ms1Response() {
        return "output from microservice 1";
    }
}
