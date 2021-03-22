package br.com.pitagoras.aula04;

public class Triangle extends TwoDShape {
    public String style;

    public double area() {
        return (width * height) / 2;
    }

    public String showStyle() {
        return "Triangle is " + style;
    }
}
