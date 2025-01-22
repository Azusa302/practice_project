package com.example.demo.minus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.minus.service.MinusService;

@Controller
public class MinusController {

    private final MinusService minusService;

    public MinusController(MinusService minusService) {
        this.minusService = minusService;
    }

    @GetMapping("/minus")
    public String minusForm(Model model) {
        return "minus";
    }

    @PostMapping("/minus")
    public String minusResult(@RequestParam("number") int number, Model model) {
        int number1 = 0;
		int number2 = 0;
		int result = minusService.minus(number1, number2);
        model.addAttribute("result", result);
        return "minus";
    }
}