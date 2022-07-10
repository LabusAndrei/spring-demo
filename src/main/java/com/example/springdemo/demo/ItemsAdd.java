package com.example.springdemo.demo;


import com.example.springdemo.model.ItemsTable;
import com.example.springdemo.repository.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ItemsAdd {

    @Autowired
    ItemsRepository itemsRepository;

    @GetMapping(value = "/ItemsAdd")
    public String ItemsAdd(Model model){
        ItemsTable myItems = new ItemsTable();
        model.addAttribute("items",myItems);
        return "ItemsAdd";
    }

    @PostMapping(value = "/submitItem")
    public String submitItems(@ModelAttribute ItemsTable items){
        itemsRepository.save(items);
        return "redirect:/Items";
    }

    private void saveToDatabase(ItemsTable items) {

    }
}