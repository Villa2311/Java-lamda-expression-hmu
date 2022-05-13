package com.java.lamda.streemapi;

import java.util.*;
import java.util.stream.Stream;

public class CreateStreamObjects {
    public static void main(String[] args) {
//        create a stream
        Stream<String> stream = Stream.of("a", "b", "c");
        stream.forEach(System.out::println);

//        create a stream from sources
        Collection<String> collection = Arrays.asList("JAVA", "J2EE", "spring", "Hibernate");
        Stream<String> stream1 = collection.stream();
        System.out.println();
        stream1.forEach(System.out::println);

        List<String> list = Arrays.asList("JAVA", "J2EE", "spring", "Hibernate");
        Stream<String> stream2 = list.stream();
        System.out.println();
        stream2.forEach(System.out::println);

        Set<String> set = new HashSet<>(list);
        Stream<String> stream3 = set.stream();
        System.out.println();
        stream3.forEach(System.out::println);
        String[] strArray = {"a", "b", "c"};
        Stream<String> stream4 = Arrays.stream(strArray);
        stream4.forEach(System.out::println);


    }
}
