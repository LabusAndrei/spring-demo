package com.example.springdemo.model;

public class TabelCurs2 {

    private String name;
    private double price;
    private String company;
    private String gender;
    private String color;
    private String material;

    public TabelCurs2(String name, double price, String company, String gender, String color, String material) {
        this.name = name;
        this.price = price;
        this.company = company;
        this.gender = gender;
        this.color = color;
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
