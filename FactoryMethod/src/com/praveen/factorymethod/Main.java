package com.praveen.factorymethod;

public class Main {
    public static void main(String[] args) {
        Board basic = BoardFactory.selectBoard(BoardCode.BASIC);
        Board half = BoardFactory.selectBoard(BoardCode.HALF);
        Board full = BoardFactory.selectBoard(BoardCode.FULL);

        System.out.println(basic);
        System.out.println(half);
        System.out.println(full);
    }
}
