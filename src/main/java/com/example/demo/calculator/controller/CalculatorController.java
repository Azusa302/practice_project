package com.example.demo.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.calculator.service.CalculatorService;

@Controller
public class CalculatorController {
	
    private final CalculatorService calculatorService;
    
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    
    @GetMapping("/calculator")
    public String calculatorForm(Model model) {
    	model.addAttribute("result", null);
    	model.addAttribute("errorMessage", null);
        return "calculator";
    }
    @PostMapping("/calculator")
    public String calculate(@RequestParam("num1") int num1,
                            @RequestParam("num2") int num2,
                            @RequestParam(value = "operator", defaultValue = "-") String operator,
                            Model model) {
    	try {
            int result = calculatorService.calculate(num1, num2, operator);
            model.addAttribute("result", result);
            model.addAttribute("errorMessage", null); // エラーメッセージをクリア
        } catch (IllegalArgumentException e) {
            model.addAttribute("result", null); 
            model.addAttribute("errorMessage", e.getMessage()); 
        }
        return "calculator";
    }
}
 
 