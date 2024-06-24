package org.example.hhjavacapstone;

import org.springframework.boot.SpringApplication;

public class TestHhJavaCapstoneApplication {

    public static void main(String[] args) {
        SpringApplication.from(HhJavaCapstoneApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
