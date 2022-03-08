package com.praveen.prototype;

public class Main {

    public static void main(String[] args) {
        Registry reg = new Registry();

        Square square = (Square) reg.getShape(ShapeType.SQUARE);
        System.out.println(square);
        square.setLength(10);
        System.out.println(square);

        Square square1 = (Square) reg.getShape(ShapeType.SQUARE);
        System.out.println(square1);

        Circle circle = (Circle) reg.getShape(ShapeType.CIRCLE);
        System.out.println(circle);
    }
}
