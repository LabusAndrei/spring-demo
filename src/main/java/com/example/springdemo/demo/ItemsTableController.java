package com.example.springdemo.demo;

import com.example.springdemo.model.ItemsTable;
import com.example.springdemo.repository.ItemsRepository;
import com.example.springdemo.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ItemsTableController {

    @Autowired
    ItemsRepository itemsRepository;

    @GetMapping(value = "/createItems")
    @ResponseBody
    public String createItems(){
        ItemsTable item = ItemsTable.builder()   //Acest segment de text a fost folosit pentru verificarea salvarii in tabel
                .id(1)                             //pana sa se automatizeze tot.
                .name("Jacheta")
                .price(29.95)
                .company("Nike")
                .gender("M")
                .color("Black")
                .material("Jeans")
                //.storecode(2)
                .build();
        itemsRepository.save(item);
        return "OK!";
    }

    @GetMapping(value = "/showItems")
    @ResponseBody
    public String showItems(){
        List<ItemsTable> itemsList = itemsRepository.findAll();
        for (ItemsTable e : itemsList){
            System.out.println(e.toString());
        }
        return "OK!";
    }
}
