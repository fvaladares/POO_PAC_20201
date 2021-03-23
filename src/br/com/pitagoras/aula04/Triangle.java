package br.com.pitagoras.aula04;

public class Triangle extends TwoDShape {
    public String style;

    public Triangle() {
//        super.setHeight(0.0);
//        super.setWidth(0.0);
        super(0.0, 0.0);
    }

    public Triangle(double width, double height, String style) {
//        super.setWidth(width);
//        super.setHeight(height);

        // Using the super class constructor ;)
        super(width, height);
        this.style = style;
    }


    public double area() {
        return (getWidth() * getHeight()) / 2;
    }

    public String showStyle() {
        return "Triangle is " + style;
    }
}
