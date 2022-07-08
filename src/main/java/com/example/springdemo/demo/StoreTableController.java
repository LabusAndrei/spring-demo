package com.example.springdemo.demo;

import com.example.springdemo.model.StoresTable;
import com.example.springdemo.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StoreTableController {

    @Autowired
    StoreRepository storeRepository;

    @GetMapping(value = "/createStore")
    @ResponseBody
    public String createStore(){
        StoresTable store = StoresTable.builder()
                .id(1)
                .name("Popescu")
                .address("Galati")
                .build();
        storeRepository.save(store);
        return "OK!";
    }

    @GetMapping(value = "/showStore")
    @ResponseBody
    public String showStore(){
        List<StoresTable> storeList = storeRepository.findAll();
        for (StoresTable e : storeList){
            System.out.println(e.toString());
        }
        return "OK!";
    }
}
