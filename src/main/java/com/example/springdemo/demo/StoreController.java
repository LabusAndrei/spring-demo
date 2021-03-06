package com.example.springdemo.demo;

import com.example.springdemo.model.StoresTable;
import com.example.springdemo.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class StoreController {

    @Autowired
    StoreRepository storeRepository;

    @GetMapping(value = "/Stores")
    public String stores(Model model) {

        String text = "Welcome to the store";

        model.addAttribute("greetings", text);

        /*List<StoresTable> storeList = List.of(
                new StoresTable(1, "Bounce", "Obor, București"),
                new StoresTable(2, "Chic", "Micro 19, Galati"),
                new StoresTable(3, "Express", "Tractorul, Brașov")
        );
        model.addAttribute("storeList", storeList);*/

        List<StoresTable> storeList = storeRepository.findAll();
        model.addAttribute("storeList", storeList);
        return "Stores";
    }

    @PostMapping(value = "/editStore")
    public String editStore(@RequestParam("storeId") int id, Model model){
        StoresTable storesTable = storeRepository.findById(id).get();
        model.addAttribute("store", storesTable);
        return "StoreAdd";
    }

    @PostMapping(value = "/deleteStore")
    public String deleteStore(@RequestParam("storeId") int id){
        storeRepository.deleteById(id);
        return "redirect:/Stores";
    }
}
