package br.com.pitagoras.aula5;

public class ClassA {
    String name;

    public ClassA(String name) {
        this.name = name;
    }

    public ClassA() {
        this.name = "ClassA";
    }

    public String whoAmI() {
        return name;
    }
}
