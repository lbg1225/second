package com.daniel.second.controller;

import com.daniel.second.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam(value = "name", defaultValue = "이병관") String name,
                                     @RequestParam(value = "amount", defaultValue = "100") int amount) {
        return new HelloResponseDto(name, amount);
    }

}
