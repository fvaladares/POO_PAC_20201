package br.com.pitagoras.aula06;

import java.util.Scanner;

public class CalcDemo {
    public static void main(String[] args) {
        Calc objCalc; // Declaração da variável, a classe ainda não foi instanciada. (Não existe o objeto).
        int numA;
        int numB;
        Scanner input = new Scanner(System.in);

        System.out.println("Vamos calcular a divisão de dois números");
        System.out.print("\nPor favor, informe o valor do dividendo: ");
        numA = input.nextInt();

        System.out.println("\n");
        System.out.print("Por favor, informe o valor do divisor: ");
        numB = input.nextInt();

        objCalc = new Calc(numA, numB); // Criação da instância da classe, a partir deste ponto existe o objeto objCalc.

        System.out.println("\n");
        System.out.printf("\n%d / %d = %d\n",
                objCalc.numA,
                objCalc.numB,
                objCalc.division());

    }
}
