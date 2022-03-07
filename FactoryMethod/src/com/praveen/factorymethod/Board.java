package com.praveen.factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Board {
    protected List<HotelService> services = new ArrayList<>();

    public Board() {
        createBoard();
    }

    protected abstract void createBoard();

    @Override
    public String toString() {
        return "Board{" +
                "services=" + services +
                '}';
    }
}
