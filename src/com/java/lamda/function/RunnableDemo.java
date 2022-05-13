package com.java.lamda.function;

class ThreadDemo implements Runnable{

    @Override
    public void run() {

        System.out.println("run method called.......");
    }
}
public class RunnableDemo {
    public static void main(String[] args) {

        Thread thread = new Thread(new ThreadDemo());
        thread.start();
    }
}
