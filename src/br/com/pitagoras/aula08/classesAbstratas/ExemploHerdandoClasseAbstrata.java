package br.com.pitagoras.aula08.classesAbstratas;

public class ExemploHerdandoClasseAbstrata extends ExemploClasseAbstrata {

    @Override
    public Boolean ligar() {
        System.out.println("Em processo de aquecimento...");
        System.out.println("Dispositivo ligado...");
        return true;
    }
}
