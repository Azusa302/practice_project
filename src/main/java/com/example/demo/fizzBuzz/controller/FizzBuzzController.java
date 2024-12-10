package com.example.demo.fizzBuzz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.fizzBuzz.service.FizzBuzzService;

@Controller
public class FizzBuzzController {

    private final FizzBuzzService fizzBuzzService;

    @Autowired
    public FizzBuzzController(FizzBuzzService fizzBuzzService) {
        this.fizzBuzzService = fizzBuzzService;
    }

    @GetMapping("/fizzbuzz")
    public String fizzBuzz(Model model) {
        List<String> result = fizzBuzzService.getFizzBuzz();
        model.addAttribute("result", result);
        return "fizzbuzz"; 
    }
}