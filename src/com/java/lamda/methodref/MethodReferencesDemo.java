package com.java.lamda.methodref;

import java.time.LocalDateTime;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
@FunctionalInterface
interface Printable{
    void print(String msg);
}

public class MethodReferencesDemo {
    public void display(String msg){
        msg = msg.toUpperCase();
        System.out.println(msg);
    }
    public static int addition(int a, int b){
        return (a + b);
    }

    public static void main(String[] args) {

//        1. Method reference to a static method
//
        Function<Integer, Double> function = (input) -> Math.sqrt(input);
        System.out.println(function.apply(49));

        Function<Integer, Double> functionMethodRef =  Math::sqrt;
        System.out.println(functionMethodRef.apply(64));

        BiFunction<Integer, Integer, Integer> biFunctionLamda = (a, b) -> MethodReferencesDemo.addition(a,b);
        System.out.println(biFunctionLamda.apply(40,30));

        BiFunction<Integer, Integer, Integer> biFunction = MethodReferencesDemo::addition;
        System.out.println(biFunction.apply(20,20));

        MethodReferencesDemo methodReferencesDemo = new MethodReferencesDemo();
//
        Printable printable = methodReferencesDemo::display;
        String output ="Hey the time is" + " " + LocalDateTime.now();
        printable.print(output);
//
        Printable printableLam = (msg) -> methodReferencesDemo.display(msg);
        printableLam.print(output);
//        lamda
        Function<String, String> stringFunction = (input) -> input.toUpperCase();
        System.out.println(stringFunction.apply("Hello blacky"));

//        method reference

        Function<String, String> stringFunctionRef = String::toUpperCase;
        System.out.println(stringFunctionRef.apply("Hello blacky methodRef"));

        String[] strArray = {"A", "E", "I", "O", "U", "a", "e", "i", "o", "u"};

        Arrays.sort(strArray, (s1, s2) -> s1.compareToIgnoreCase(s2));

        Arrays.sort(strArray, String::compareToIgnoreCase);
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("mango");
        fruits.add("cucumber");
        fruits.add("watermelon");

        Function<List<String>, Set<String>> setFunction = (fruitsList) -> new HashSet<>(fruitsList);
        System.out.println(setFunction.apply(fruits));

        Function<List<String>, Set<String>> setFunctionRef =  HashSet::new;
        System.out.println(setFunctionRef.apply(fruits));

    }
}

