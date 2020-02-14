package com.imooc.luckymoney.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String say(){

        return "springboot！";
    }
}
