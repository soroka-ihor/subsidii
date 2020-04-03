package gov.ua.olevsk.upszn.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("greeting")
    public String greeting(
            @RequestParam(name="name", required=false, defaultValue="World")
            String name, Map<String, Object> model) {

        model.put("name", name);
        model.put("lets", "let's code!");
        return "greeting";
    }

    @GetMapping
    public String main(Map<String, Object> model) {
        model.put("some", "Hello, let's code!");

        return "letscode";
    }

}