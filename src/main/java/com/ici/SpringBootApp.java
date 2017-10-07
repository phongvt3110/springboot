package com.ici;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello world!
 *
 */
@Controller
@EnableAutoConfiguration
@RequestMapping(value = "/", method = RequestMethod.GET)
public class SpringBootApp {

    @RequestMapping("/hello")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String index() {
        return "Hello world from Spring boot";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootApp.class, args);
    }
}