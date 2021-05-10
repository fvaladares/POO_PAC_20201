package br.com.pitagoras.aula08.classesAbstratas;

public class ExemploHerdandoClasseAbstrataDemo {
    public static void main(String[] args) {
        ExemploClasseAbstrata ex1 = new ExemploHerdandoClasseAbstrata();
        ExemploClasseAbstrata ex2 = new ExemploHerdandoClasseAbstrata2();

        System.out.println("Ligando dispositivo 1");
        if (ex1.ligar()) {
            System.out.println("Dispositivo 1 ligado.");
        } else {
            System.out.println("Falha ao ligar dispositivo 1");
        }
        System.out.println("Ligando dispositivo 2");
        if (ex2.ligar()) {
            System.out.println("Dispositivo 2 ligado.");
        } else {
            System.out.println("Falha ao ligar dispositivo 2");
        }
    }
}
