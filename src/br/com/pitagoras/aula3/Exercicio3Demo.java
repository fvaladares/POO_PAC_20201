package br.com.pitagoras.aula3;

import java.util.Scanner;

public class Exercicio3Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Variável do tipo Exercício 3
        Exercicio3 exercicio3;
        int[] numbers;

        int arraySize;
        int number;

        System.out.print("Por favor, informe o tamanho do array: ");
        arraySize = input.nextInt();

        numbers = new int[arraySize];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println();
            System.out.printf("Informe o %d° valor: ", (i + 1));
            number = input.nextInt();
            numbers[i] = number;
        }

        exercicio3 = new Exercicio3(numbers);

        System.out.println("\nArray preenchido!");
        System.out.println(exercicio3);

        System.out.println("---------------------------------------");
        System.out.println("Menor valor do array");
        System.out.println("\t" + exercicio3.getSmallestValue());

        System.out.println("---------------------------------------");
        System.out.println("Maior valor do array");
        System.out.println("\t" + exercicio3.getBiggerValue());

    }
}
