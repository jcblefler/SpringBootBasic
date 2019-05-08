package com.example.springbootbasic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homepage(){
        return "index";
    }
    @RequestMapping("/recipe")
    public String recipe(){
        return "recipe.html";
    }
}
