package br.com.pitagoras.aula08.classesAbstratas;

public class ExemploMetodoStaticDemo {
    public static void main(String[] args) {
        ExemploMetodoStatic exemploMetodoStatic = new ExemploMetodoStatic();
        ExemploMetodoStatic exemploMetodoStatic2 = new ExemploMetodoStatic();

        System.out.println("Testando atributos estáticos e não estáticos.");
        System.out.println("Exemplo 1:");
        exemploMetodoStatic.verContadores();
        System.out.println("Exemplo 2:");
        exemploMetodoStatic2.verContadores();
        System.out.println();
        System.out.println("Incrementando os contadores");
        exemploMetodoStatic.incrementarContadores();
//        exemploMetodoStatic2.incrementarContadores();
        System.out.println();
        System.out.println("Resultado SURPRESA!");
        System.out.println("Exemplo 1:");
        exemploMetodoStatic.verContadores();
        System.out.println("Exemplo 2:");
        exemploMetodoStatic2.verContadores();

        // Exemplo da utilização de método estático.
        ExemploMetodoStatic.print();
    }
}
