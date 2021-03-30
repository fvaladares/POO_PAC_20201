package br.com.pitagoras.aula4;


public class ShapeDemo {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2;

        t1.setWidth(4.0);
        t1.setHeight(4.0);
        t1.style = "filled";

        // Using the constructor to initialize the object fields;
        t2 = new Triangle(8.0,
                12.0,
                "outlined");

//        t2.setWidth(8.0);
//        t2.setHeight(12.0);
//        t2.style = "outlined";

        System.out.println("Info about t1: ");
        System.out.println("\t" + t1.showStyle());
        System.out.println("\t" + t1.showDimen());
        System.out.printf("\tArea: %.2f\n", t1.area());

        System.out.println("----------------------\n");

        System.out.println("Info about t2: ");
        System.out.println("\t" + t2.showStyle());
        System.out.println("\t" + t2.showDimen());
        System.out.printf("\tArea: %.2f\n", t2.area());
        System.out.printf("\tArea: %f\n", t2.area());


    }
}
