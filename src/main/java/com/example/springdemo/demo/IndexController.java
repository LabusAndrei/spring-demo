package com.example.springdemo.demo;

import com.example.springdemo.model.Tabel;
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

        List<Tabel> employeeList = List.of(
                new Tabel("Max", 6500, "IT Support"),
                new Tabel("George", 8650, "Management"),
                new Tabel("Andreea", 7345, "Logistics")
        );
        model.addAttribute("employeeList", employeeList);

        return "index";
    }
}
