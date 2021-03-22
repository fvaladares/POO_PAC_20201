package br.com.pitagoras.aula04;

public class ShapeDemo {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.width = 4.0;
        t1.height = 4.0;
        t1.style = "filled";

        t2.width = 8.0;
        t2.height = 12.0;
        t2.style = "outlined";

        System.out.println("Info about t1: ");
        System.out.println("\t" + t1.showStyle());
        System.out.println("\t" + t1.showDimen());
        System.out.printf("\tArea: %f\n", t1.area());

        System.out.println("----------------------\n");

        System.out.println("Info about t2: ");
        System.out.println("\t" + t2.showStyle());
        System.out.println("\t" + t2.showDimen());
        System.out.printf("\tArea: %f\n", t2.area());
    }
}
