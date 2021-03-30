package br.com.pitagoras.aula5;

public class ClassTest {

    public static void main(String[] args) {
//        ClassB obj1 = new ClassB("ClassB");
//        ClassA obj2 = new ClassB("ClassA");
//        ClassA obj3 = new ClassA("ClassA");
        ClassB obj1 = new ClassB();
        ClassA obj2 = new ClassB();
        ClassA obj3 = new ClassA();

        System.out.println();
        System.out.println("obj1: " + obj1.whoAmI());
        System.out.println("obj2: " + obj2.whoAmI());
        System.out.println("obj3: " + obj3.whoAmI());

        System.out.println();
        System.out.println("obj1: " + obj1.specialClassBMethod());

        // Coerção, ou transformação de tipo -> Transformamos o obj2 em um objeto do tipo ClassB
        System.out.println("obj2: " + ((ClassB) obj2).specialClassBMethod());
        // Coerção, ou transformação de tipo -> Transformamos o obj2 em um objeto do tipo ClassB
        System.out.println(((ClassB) obj3).specialClassBMethod());
    }
}
