package com.example.springdemo.demo;

import com.example.springdemo.model.StoresTable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StoreAdd {

    @GetMapping(value = "/StoreAdd")
    public String StoreAdd(Model model){
        StoresTable myStore = new StoresTable();
        model.addAttribute("store",myStore);
        return "StoreAdd";
    }

    @PostMapping(value = "/submitStore")
    public String submitStore(@ModelAttribute StoresTable store){
        System.out.println("hello from submitstore");
        System.out.println("Code " + store.getCod());
        System.out.println("Name " + store.getName());
        System.out.println("Address " + store.getAddress());
        saveToDatabase(store);

        return "Stores";
    }

    private void saveToDatabase(StoresTable store) {

    }
}