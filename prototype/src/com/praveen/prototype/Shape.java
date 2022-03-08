package com.praveen.prototype;

public abstract class Shape implements Cloneable{
    private String type;
    private int area;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
