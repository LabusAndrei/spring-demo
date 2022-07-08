package com.example.springdemo.demo;

import com.example.springdemo.model.StoresTable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StoreController {

    @GetMapping(value = "/Stores")
    public String stores(Model model) {

        StoresTable myStore = StoresTable.builder()
                .id(24)
                .name("Max")
                .address("Galati")
                .build();

        String text = "Welcome to the store";

        model.addAttribute("greetings", text);

        List<StoresTable> storeList = List.of(
                new StoresTable(1, "Bounce", "Obor, București"),
                new StoresTable(2, "Chic", "Micro 19, Galati"),
                new StoresTable(3, "Express", "Tractorul, Brașov")
        );
        model.addAttribute("storeList", storeList);

        return "Stores";
    }
}
