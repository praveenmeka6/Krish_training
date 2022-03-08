package com.praveen.builder;

public class CameraTeslescopic1 {

    private String ultraWideLens;
    private String telephotoLens;
    private String macroLens;

    public CameraTeslescopic1(String ultraWideLens) {
        this.ultraWideLens = ultraWideLens;
    }

    public CameraTeslescopic1(String ultraWideLens, String telephotoLens) {
        this(ultraWideLens);
        this.telephotoLens = telephotoLens;
    }

    public CameraTeslescopic1(String ultraWideLens, String telephotoLens, String macroLens) {
        this(ultraWideLens, telephotoLens);
        this.macroLens = macroLens;
    }

    @Override
    public String toString() {
        return "CameraTeslescopic1{" +
                "ultraWideLens=" + ultraWideLens +
                ", telephotoLens=" + telephotoLens +
                ", macroLens=" + macroLens +
                '}';
    }
}
