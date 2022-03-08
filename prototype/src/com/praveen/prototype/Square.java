package com.praveen.prototype;

public class Square extends Shape{

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                '}';
    }
}
