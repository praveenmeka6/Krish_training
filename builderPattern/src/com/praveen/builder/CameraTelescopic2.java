package com.praveen.builder;

public class CameraTelescopic2 {

    private String ultraWideLens;
    private String telephotoLens;
    private String macroLens;

    public CameraTelescopic2(String ultraWideLens, String telephotoLens, String macroLens) {
        this.ultraWideLens = ultraWideLens;
        this.telephotoLens = telephotoLens;
        this.macroLens = macroLens;
    }

    public CameraTelescopic2(String ultraWideLens, String telephotoLens) {
        this(ultraWideLens,telephotoLens,null);
    }

    public CameraTelescopic2(String ultraWideLens) {
        this(ultraWideLens,null,null);
    }

    @Override
    public String toString() {
        return "CameraTelescopic2{" +
                "ultraWideLens='" + ultraWideLens + '\'' +
                ", telephotoLens='" + telephotoLens + '\'' +
                ", macroLens='" + macroLens + '\'' +
                '}';
    }
}
