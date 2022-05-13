package com.java.lamda.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
//        Optional<Object> emptyOptional = Optional.empty();
//        System.out.println(emptyOptional);

        String email = null;

//        Optional<String> emailOptional = Optional.of(email);
//        System.out.println(emailOptional);

        Optional<String> emailOptionalOf = Optional.ofNullable(email);
        String defaultOptional = emailOptionalOf.orElse("default@gmail.com");
        System.out.println(defaultOptional);

        String defaultOptional2 = emailOptionalOf.orElseGet(() -> "default@gmail.com");
        System.out.println(defaultOptional2);

        Optional<String> gender = Optional.of("MALE");
        Optional<Object> emailOptionalS = Optional.empty();;

//        Optional<String> emptyOptionalS =

//        gender.ifPresent((s) -> System.out.println("Value is present"));
//        emailOptionalS.ifPresent((s) -> System.out.println("Value is present"));
//
//        String optionalObj = emailOptionalOf.orElseThrow(()-> new IllegalArgumentException("Email doesn't exist"));
//        System.out.println(optionalObj);

         String result = "  abc  ";
         if (result != null && result.contains("abc")){
             System.out.println(result);
         }

         Optional<String> optionalS = Optional.of(result);
         optionalS.filter((res) -> res.contains("abc"))
                 .map((String res) -> res.trim())
                 .ifPresent((res) -> System.out.println(res)) ;

//        if(emailOptionalOf.isPresent()){
//            System.out.println(emailOptionalOf.get( ) );
//        }else {
//            System.out.println("No value present");
//        }
    }
}
