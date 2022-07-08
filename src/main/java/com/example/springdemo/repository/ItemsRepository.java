package com.example.springdemo.repository;

import com.example.springdemo.model.ItemsTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsRepository extends JpaRepository<ItemsTable, Integer> {

}
