package br.com.pitagoras.aula5;

public class ClassTest2 {

    public static void main(String[] args) {
        ClassB obj1 = new ClassB();
        ClassA obj2 = new ClassB();
        ClassA obj3 = new ClassA();
        ClassC obj4 = new ClassC();

        ClassExecutor classExecutor = new ClassExecutor();

        System.out.println(classExecutor.printClassObject(obj1));
        System.out.println(classExecutor.printClassObject(obj2));
        System.out.println(classExecutor.printClassObject(obj3));
        System.out.println(classExecutor.printClassObject(obj4));
    }
}
