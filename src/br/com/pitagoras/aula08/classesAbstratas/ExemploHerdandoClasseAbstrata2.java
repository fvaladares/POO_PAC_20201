package br.com.pitagoras.aula08.classesAbstratas;

public class ExemploHerdandoClasseAbstrata2 extends ExemploClasseAbstrata {
    @Override
    public Boolean ligar() {
        System.out.println("Emitir som confirmando que o dispositivo está ligado.");
        System.out.println("Dispositivo ligado");
        return false;
    }
}
