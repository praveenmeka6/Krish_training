package com.praveen.factorymethod;

public class HalfBoard extends Board{
    @Override
    protected void createBoard() {
        services.add(new Room());
        services.add(new Breakfast());
    }
}
