package oop.ex;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int calcPeri() {
        int periMeter = (width + height) * 2;
        System.out.println("periMeter = " + periMeter);
        return periMeter;
    }
}
