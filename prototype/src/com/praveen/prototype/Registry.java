package com.praveen.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<ShapeType,Shape> shapes = new HashMap<>();

    public Registry() {
        this.initialize();
    }

    public Shape getShape(ShapeType shapeType) {
        Shape shape=null;
        try {
            shape = (Shape) shapes.get(shapeType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return shape;
    }

    private void initialize() {
        Circle circle = new Circle();
        circle.setType("circle");
        circle.setRadius(7);
        circle.setArea(154);

        Square square = new Square();
        square.setType("square");
        square.setLength(5);
        square.setArea(25);

        shapes.put(ShapeType.CIRCLE,circle);
        shapes.put(ShapeType.SQUARE,square);
    }
}
