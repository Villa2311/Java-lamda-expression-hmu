package com.java.lamda.bifunction;

import java.util.function.BiFunction;

public class BiFunctionDemo implements BiFunction<Integer, Integer, Integer> {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = new BiFunctionDemo();
        System.out.println(biFunction.apply(20, 30));
        System.out.println(biFunction.apply(105,95));

    }

    @Override
    public Integer apply(Integer t, Integer u) {
        return (t + u);
    }
}
