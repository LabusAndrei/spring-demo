package com.example.springdemo.demo;

import com.example.springdemo.model.ItemsTable;
import com.example.springdemo.model.StoresTable;
import com.example.springdemo.repository.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ItemController {

    @Autowired
    ItemsRepository itemsRepository;

    @GetMapping(value = "/Items")
    public String SiteCurs2(Model model) {


        String text = "Welcome to the store";

        model.addAttribute("greetings", text);

        /*List<ItemsTable> itemList = List.of(
                new ItemsTable(1,"Sneakers", 60, "Adidas", "M", "Black", "Synthetic", 1),
                new ItemsTable(2,"Boots", 80.4, "Kilimanjaro", "F", "Brown", "Lether", 2),
                new ItemsTable(3,"Boots", 40, "Timberland", "M", "Cream", "Lether", 1),
                new ItemsTable(4,"Boots", 55.25, "Puma", "M/F", "White", "Synthetic", 3),
                new ItemsTable(5,"Jacket", 100, "Adidas", "M", "Green", "Cotton", 1),
                new ItemsTable(6,"Jacket", 99.99, "Nike", "F", "Green", "Cotton", 2),
                new ItemsTable(7,"Shirt", 20, "Under Aromur", "M/F", "Yellow", "Synthetic", 3),
                new ItemsTable(8,"Skirt", 62.76, "Zara", "F", "Pink", "Synthetic", 3)
        );

        model.addAttribute("itemList", itemList);*/

        List<ItemsTable> itemList = itemsRepository.findAll();
        model.addAttribute("itemList", itemList);
        return "Items";
    }
}
