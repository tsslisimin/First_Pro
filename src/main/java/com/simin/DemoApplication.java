package com.simin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(value = "/user")
public class DemoApplication {

    public static void main(String[] args) {
//        @RequestMapping(value = "/findAll")

        SpringApplication.run(DemoApplication.class, args);
    }
}
