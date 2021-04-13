package br.com.pitagoras.aula06;


class Test {
    private String name;
    private String surname;
    private int age;

    Test(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Test {" +
                "name='" + getName() + ' ' +
                getSurname() + '\'' +
                ", age=" + age +
                '}';
    }
}


public class ResolucaoProva {
    public static void main(String[] args) {
        Test test = new Test("Fabricio", "Valadares", 38);
        System.out.println(test.getAge());
        System.out.println("\n=======================\n");
        System.out.println(test);
        System.out.println("\n=======================");
        System.out.println(test.getClass());
    }

}
