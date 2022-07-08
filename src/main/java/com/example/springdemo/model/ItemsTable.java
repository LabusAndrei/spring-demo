package com.example.springdemo.model;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="t_items")
public class ItemsTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private double price;
    @Column(name = "company")
    private String company;
    @Column(name = "gender")
    private String gender;
    @Column(name = "color")
    private String color;
    @Column(name = "material")
    private String material;
    @Column(name = "storecode")
    private int storecode;
}