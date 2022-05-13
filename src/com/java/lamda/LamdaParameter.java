package com.java.lamda;
interface Addable{
    int addition(int a, int b);
}

class AddableImpl implements Addable{

    @Override
    public int addition(int a, int b) {
        return (a + b);
    }
}
public class LamdaParameter {
    public static void main(String[] args) {
        Addable addition = ( a,  b) -> (a + b);
        int result = addition.addition(10, 20);
        System.out.println(result);

    }
}
