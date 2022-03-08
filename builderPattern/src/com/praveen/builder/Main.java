package com.praveen.builder;

public class Main {
    public static void main(String[] args) {
        CameraTeslescopic1 camera1 = new CameraTeslescopic1("12MP");
        System.out.println(camera1);

        CameraTelescopic2 camera2 =  new CameraTelescopic2("25MP");
        System.out.println(camera2);

        Camera.Builder builder = new Camera.Builder("50MP");
        Camera camera3 = builder.telephotoLens("12MP").macroLens("5MP").build();
        System.out.println(camera3);
    }
}
