package com.example.SpringBoot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    // ENDPOINT1
    @RequestMapping("/message/{message}")
    public String message(@PathVariable String message ) {

        return "Welcome to spring boot...."+ message;
    }

    @RequestMapping("/add/{a}/{b}")
    public int add(@PathVariable int a, @PathVariable int b){
        int sum = a+b;
        return sum;
    }

    @RequestMapping("/sub/{c}/{d}")
    public int sub(@PathVariable int c, @PathVariable int d){
        int sub = c-d;
        return sub;
    }

    @RequestMapping("/devide/{x}/{y}")
    public int devide(@PathVariable int x, @PathVariable int y){
        int devide = x/y;
        return devide;
    }

    @RequestMapping("/mul/{p}/{q}")
    public int mul(@PathVariable int p, @PathVariable int q){
        int mul = p*q;
        return mul;
    }



    @RequestMapping("/add")
    public int addition(@RequestParam int a, @RequestParam int b){
        int sum = a+b;
        return sum;
    }

    @RequestMapping("/sub")
    public int subtraction(@RequestParam int c, @RequestParam int d){
        int sub = c-d;
        return sub;
    }

    @RequestMapping("/devide")
    public int division(@RequestParam int x, @RequestParam int y){
        int devide = x/y;
        return devide;
    }

    @RequestMapping("/mul")
    public int multiplication(@RequestParam int p, @RequestParam int q){
        int mul = p*q;
        return mul;
    }








}
