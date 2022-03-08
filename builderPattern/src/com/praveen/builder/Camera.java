package com.praveen.builder;

public class Camera {

    private String ultraWideLens;
    private String telephotoLens;
    private String macroLens;

    public Camera(Builder builder) {
        this.ultraWideLens = builder.ultraWideLens;
        this.telephotoLens = builder.telephotoLens;
        this.macroLens = builder.macroLens;
    }

    static class Builder {
        private String ultraWideLens;
        private String telephotoLens;
        private String macroLens;

        public Camera build() {
            return new Camera(this);
        }

        public Builder(String ultraWideLens) {
            this.ultraWideLens=ultraWideLens;
        }

        public Builder telephotoLens(String telephotoLens) {
            this.telephotoLens = telephotoLens;
            return this;
        }

        public Builder macroLens(String macroLens) {
            this.macroLens = macroLens;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Camera{" +
                "ultraWideLens='" + ultraWideLens + '\'' +
                ", telephotoLens='" + telephotoLens + '\'' +
                ", macroLens='" + macroLens + '\'' +
                '}';
    }
}
