package com.java.lamda.streemapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();

        for (Product product : getProduct()){
            if (product.getPrice() > 25000f){
                list.add(product);
            }
        }

        for (Product product: list){
            System.out.println(product);
        }
//        using api stream
        List<Product> list1 = getProduct()
                .stream().filter((product) -> product.getPrice() > 25000f)
                .collect(Collectors.toList());
        System.out.println();
        list1.forEach(System.out::println);

    }
    private static List<Product> getProduct(){
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(0, "HP Laptop", 25000f));
        productList.add(new Product(1, "Dell Laptop", 35000f));
        productList.add(new Product(2, "Lenovo Laptop", 45000f));
        productList.add(new Product(3, "Sony Laptop", 55000f));
        productList.add(new Product(4, "Apple Laptop", 65000f));
        return productList;
    }
}

class Product{
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    private int id;
    private String name;
    private float price;
}
