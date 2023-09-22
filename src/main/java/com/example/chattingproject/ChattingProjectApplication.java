package com.example.chattingproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ChattingProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChattingProjectApplication.class, args);
    }

}
