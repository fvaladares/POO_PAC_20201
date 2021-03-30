package br.com.pitagoras.aula5;

public class ClassB extends ClassA {
    public ClassB(String name) {
        super(name);
    }

    public ClassB() {
        super("ClassB");
    }

    public String specialClassBMethod() {
        return name + " only method";
    }
}
