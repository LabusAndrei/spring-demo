package com.example.springdemo.repository;

import com.example.springdemo.model.StoresTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends JpaRepository<StoresTable, Integer> {

}
