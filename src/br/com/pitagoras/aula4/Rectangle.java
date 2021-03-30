package br.com.pitagoras.aula4;

public class Rectangle extends TwoDShape {
    public Rectangle(double width, double height) {
        super(width, height);
    }

    @Override
    public double area() {
        return (getHeight() * getWidth() / 2);
    }
}
