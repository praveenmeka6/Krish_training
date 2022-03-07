package com.praveen.factorymethod;

public class BasicBoard extends Board{

    @Override
    protected void createBoard() {
        services.add(new Room());
    }
}
