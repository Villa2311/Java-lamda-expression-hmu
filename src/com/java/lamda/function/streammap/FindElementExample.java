package com.java.lamda.function.streammap;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindElementExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,3,2,1);

        Optional<Integer> element = list.stream().findFirst();
        if (element.isPresent()){
            System.out.println(element);
        }else {
            System.out.println("stream is empty");
        }
    }
}
