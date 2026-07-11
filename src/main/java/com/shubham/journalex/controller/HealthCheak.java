package com.shubham.journalex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class HealthCheak {
    @RestController
    public class HealtCheak {

        @GetMapping (value = "/health-cheak")
        public String healthCheak(){
            return "Ok";
        }
    }

}
