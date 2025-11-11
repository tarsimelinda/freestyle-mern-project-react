package com.codecool.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class BackendApplication {
    public static void main(String[] args) {
        var ctx = SpringApplication.run(BackendApplication.class, args);
        log.info("Mario Backend started on port {}",
                ctx.getEnvironment().getProperty("server.port"));

    }
}

