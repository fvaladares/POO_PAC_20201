package br.com.pitagoras.aula4;

// 15 minutos: 20:27
public abstract class TwoDShape {
    private double width;
    private double height;

    public TwoDShape(double width,
                     double height) {
        this.width = width;
        this.height = height;
    }

    // Accessors methods
    public double getWidth() {
        return this.width;
    }

    /**
     * @param width - Triangle width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String showDimen() {
        return "Width and height are " +
                width +
                " and " +
                height;

        // return "Width and height are " + width + " and " + height;
    }

    public abstract double area();
}
