package com.userupdate.project1.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/") public String home() { return "index"; }
    @GetMapping("/index") public String index() { return "index"; }


}
