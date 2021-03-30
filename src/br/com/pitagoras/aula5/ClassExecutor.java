package br.com.pitagoras.aula5;

public class ClassExecutor {
    public String printClassObject(ClassA objectToPrint) {
        String textToReturn = objectToPrint.whoAmI();
        if (objectToPrint instanceof ClassB) {
            textToReturn += " " + ((ClassB) objectToPrint).specialClassBMethod();
        }
        return textToReturn;
    }
}
