package br.com.pitagoras.aula08.classesAbstratas;

public class ExemploMetodoStatic {
    // Declaração de um atributo estático
    static int count = 0;
    int count2 = 0;

    // Declaração de um método estático.
    static void print() {
        System.out.println();
        System.out.println("Estamos invocando um método estático.");
        System.out.println();
    }

    public void verContadores() {
        System.out.println();
        System.out.println("Count: " + count);
        System.out.println();
        System.out.println("Count2: " + count2);
    }

    public void incrementarContadores() {
        count++;
        count2++;
    }
}
