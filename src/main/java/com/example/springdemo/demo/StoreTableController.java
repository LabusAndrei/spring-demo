package com.example.springdemo.demo;

import com.example.springdemo.repository.StoreRepository;
import org.apache.catalina.Store;
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
    public String createEmployee(){
        Store employee = Store.builder()
                .firstname("George")
                .lastname("Popescu")
                .department("Accounting")
                .monthlySalary(2400)
                .build();
        storeRepository.save(employee);
        return "OK!";
    }

    @GetMapping(value = "/showEmployees")
    @ResponseBody
    public String showEmployees(){
        List<Store> employeeList = storeRepository.findAll();
        for (Store e : employeeList){
            System.out.println(e.toString());
        }
        return "OK!";
    }

}

