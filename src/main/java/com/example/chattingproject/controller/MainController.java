package com.example.chattingproject.controller;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String main(){
        return "chat/room";
    }
    @GetMapping("/test")
    public String test(){
        return "chat/newChat";
    }
}
