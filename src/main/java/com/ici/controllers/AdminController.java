package com.ici.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@EnableAutoConfiguration
@RequestMapping(value = "/admin", method = RequestMethod.GET)
public class AdminController {
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("greeting", "Hello spring boot MVC");
        return "helloworld";
    }
}
