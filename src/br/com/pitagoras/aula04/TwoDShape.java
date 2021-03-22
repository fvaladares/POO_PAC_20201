package br.com.pitagoras.aula04;

// 15 minutos: 20:27
public class TwoDShape {
    public double width;
    public double height;

    public String showDimen() {
        return new StringBuilder()
                .append("Width and height are ")
                .append(width)
                .append(" and ")
                .append(height)
                .toString();

        // return "Width and height are " + width + " and " + height;
    }
}
