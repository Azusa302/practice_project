package com.example.demo.multi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.multi.service.MultiService;

@Controller
public class MultiController {
    private final MultiService multiService;

    @Autowired
    public MultiController(MultiService multiService) {
        this.multiService = multiService;
    }

    @GetMapping("multi")
    public String multi(Model model) {
        int result = multiService.multi(5, 6);
        model.addAttribute("result", result);
        return "multi.html";
    }
}