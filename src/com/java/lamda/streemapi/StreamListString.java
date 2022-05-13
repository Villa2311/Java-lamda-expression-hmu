package com.java.lamda.streemapi;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamListString {
    public static <Employee> void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("mango");
        fruits.add("cucumber");
        fruits.add("watermelon");

        List<String> sortedList = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sortedList);

//        descending order
        List<String> sortedList1 = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList1);

//        List<Employee> employees = new ArrayList<Employee>();
//        employees.add((Employee) new Product(0, "HP Laptop", 25000f));
//        employees.add((Employee) new Product(1, "Dell Laptop", 35000f));
//        employees.add((Employee) new Product(2, "Lenovo Laptop", 45000f));
//        employees.add((Employee) new Product(3, "Sony Laptop", 55000f));
//        employees.add((Employee) new Product(4, "Apple Laptop", 65000f));
//
//        List<Employee> employeeSortedList = employees.stream().sorted(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return 0;
//            }
//        })
    }

}





