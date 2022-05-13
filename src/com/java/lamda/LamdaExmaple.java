package com.java.lamda;

interface Shape{
    void draw();
}

class  Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Rectangle class : draw()");
    }
}
class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Square class : draw()");
    }
}
class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Circle class : draw()");
    }
}
public class LamdaExmaple {
    public static void main(String[] args) {
        String str = "Hello";

        Shape rectangle = () -> System.out.println("Rectangle class : draw() method 1");
//        rectangle.draw();

        Shape square = () -> System.out.println("square class : draw() method ");
//        square.draw();

        lagbaja(rectangle);
        lagbaja(square);
    }

    private static void lagbaja(Shape shape){
        shape.draw();
    }


}
