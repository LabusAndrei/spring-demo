package com.example.springdemo.demo;

import com.example.springdemo.model.TabelCurs2Exemplu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    @GetMapping(value = "/index")
    public String index(Model model){

        String text = "Hello from Spring Controller";

        model.addAttribute("greetings", text);
        model.addAttribute("myText", "some random text");

        List<String> fruits =List.of("mere", "banane", "pepeni", "pere", "cirese", "capsuni", "persici");
        model.addAttribute("fruits", fruits);

        List<TabelCurs2Exemplu> employeeList = List.of(
                new TabelCurs2Exemplu("Max", 6500, "IT Support"),
                new TabelCurs2Exemplu("George", 8650, "Management"),
                new TabelCurs2Exemplu("Andreea", 7345, "Logistics")
        );
        model.addAttribute("employeeList", employeeList);

        return "index";
    }
}
