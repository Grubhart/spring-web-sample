package com.example.springwebsample.controller;

import com.example.springwebsample.domain.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MessageController {
    @GetMapping("/message")
    public Message greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Message(1, "Hello "+name);
    }
}
