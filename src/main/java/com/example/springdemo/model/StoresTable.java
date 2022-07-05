package com.example.springdemo.model;

public class StoresTable {
    private int cod;
    private String name;
    private String address;

    public StoresTable(){

    }

    public StoresTable(int cod, String name, String address) {
        this.cod = cod;
        this.name = name;
        this.address = address;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
