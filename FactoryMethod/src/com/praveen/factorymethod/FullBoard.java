package com.praveen.factorymethod;

public class FullBoard extends Board{
    @Override
    protected void createBoard() {
        services.add(new Room());
        services.add(new Breakfast());
        services.add(new Lunch());
        services.add(new EveningMeals());
    }
}
