package com.example.demo.endPoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestEndPoint {

    @GetMapping("/ping")
    public String ping() {
        return "pinged";
    }
}
