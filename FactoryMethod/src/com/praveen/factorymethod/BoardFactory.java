package com.praveen.factorymethod;

public class BoardFactory {

    public static Board selectBoard(BoardCode boardCode) {
        switch (boardCode) {
            case BASIC:
                return new BasicBoard();
            case HALF:
                return new HalfBoard();
            case FULL:
                return new FullBoard();
            default:
                return null;
        }
    }
}
