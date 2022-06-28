package com.example.springdemo.demo;

import com.example.springdemo.model.TabelCurs2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TemaCurs2 {

    @GetMapping(value = "/SiteCurs2")
    public String SiteCurs2( Model model) {

        String text = "Welcome to the store";

        model.addAttribute("greetings", text);

        List<TabelCurs2> itemList = List.of(
                new TabelCurs2("Sneakers",60,"Adidas","M","Black","Synthetic"),
                new TabelCurs2("Boots",80.4,"Kilimanjaro","F","Brown","Lether"),
                new TabelCurs2("Boots",40,"Timberland","M","Cream","Lether"),
                new TabelCurs2("Boots",55.25,"Puma","M/F","White","Synthetic"),
                new TabelCurs2("Jacket",100,"Adidas","M","Green","Cotton"),
                new TabelCurs2("Jacket",99.99,"Nike","F","Green","Cotton"),
                new TabelCurs2("Shirt",20,"Under Aromur","M/F","Yellow","Synthetic"),
                new TabelCurs2("Skirt",62.76,"Zara","F","Pink","Synthetic")
        );

        model.addAttribute("itemList", itemList);

        return "SiteCurs2";
    }
}
