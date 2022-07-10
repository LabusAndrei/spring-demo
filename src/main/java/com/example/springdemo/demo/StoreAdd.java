package com.example.springdemo.demo;

import com.example.springdemo.model.StoresTable;
import com.example.springdemo.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StoreAdd {

    @Autowired
    StoreRepository storeRepository;

    @GetMapping(value = "/StoreAdd")
    public String StoreAdd(Model model) {
        StoresTable myStore = new StoresTable();
        model.addAttribute("store", myStore);
        return "StoreAdd";
    }

    @PostMapping(value = "/submitStore")
    public String submitStore(@ModelAttribute StoresTable store) {
        storeRepository.save(store);
        return "redirect:/Stores";
    }

    private void saveToDatabase(StoresTable store) {
        storeRepository.save(store);
    }
}