package com.springbuiltdocker.springbuiltdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbuiltdockerApplication {

    @GetMapping("/image")
    public String runImage() {
        return "docker image created and running successfully";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbuiltdockerApplication.class, args);
    }

}
