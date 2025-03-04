package com.company;

public class Product implements Comparable<Product> {

    private String name;
    private String type;
    private double price;

    public Product() {
    }

    public Product(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String print(){
        return name + " " + type + " " + price;
    }

    @Override
    public int compareTo(Product o) {
        return (int) (this.getPrice()-o.getPrice());
    }
}
