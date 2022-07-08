package com.example.springdemo.demo;


import com.example.springdemo.model.ItemsTable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ItemsAdd {

    @GetMapping(value = "/ItemsAdd")
    public String ItemsAdd(Model model){
        ItemsTable myItems = new ItemsTable();
        model.addAttribute("items",myItems);
        return "ItemsAdd";
    }

    @PostMapping(value = "/submitItem")
    public String submitItems(@ModelAttribute ItemsTable items){
        System.out.println(items.toString());
        return "Items";
    }

    private void saveToDatabase(ItemsTable items) {

    }
}