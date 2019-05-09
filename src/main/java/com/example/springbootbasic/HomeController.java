package com.example.springbootbasic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homepage(){
        return "index";
    }
    @RequestMapping("/pancakes")
    public String pancakes(){
        return "pancakes";
    }
    @RequestMapping("/crabcake")
    public String crabcake(){
        return "crabcake";
    }
    @RequestMapping("/applepie")
    public String applepie(){
        return "applepie";
    }
    @RequestMapping("/bananabread")
    public String bananabread(){
        return "bananabread";
    }
    @RequestMapping("/chocolatechipcookie")
    public String chocolatechipcookie(){
        return "chocolatechipcookie";
    }
    @RequestMapping("/form")
    public String form(){
        return "form";
    }
    @RequestMapping("/table")
    public String table(){
        return "table";
    }
}
