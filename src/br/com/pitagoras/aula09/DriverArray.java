package br.com.pitagoras.aula09;

import java.util.Random;
import java.util.Scanner;

public class DriverArray {
    public static void main(String[] args) {
//      Declaração de um array
        int[] meuArray = new int[5]; // array/arranjo/vetor de inteiros
        String[] listaDeNomes = new String[5]; // array de Strings
        Scanner leitor = new Scanner(System.in);
        Random random = new Random();

//        Estrutura de repetição para percorrer o arranjo (vetor)
        for (int i = 0; i < meuArray.length; i++) {
            meuArray[i] = random.nextInt(100);//i * (i + 1);
        }

//        Estrutura de repetição para exibir o conteúdo do array...
        System.out.println();
        System.out.println("-------------------");
        System.out.println();
        for (int item : meuArray) {
            System.out.print(item + ", ");
        }
        System.out.println();
        System.out.println("-------------------");
        System.out.println();

        for (int i = 0; i < listaDeNomes.length; i++) {
            System.out.println("Por favor, informe o " + (i + 1) + "° nome:");
            listaDeNomes[i] = leitor.nextLine();
        }

        System.out.println();
        System.out.println("-------------------");
        System.out.println();

        System.out.println("Nomes na lista: ");
        for (String nome : listaDeNomes) {
            System.out.println(nome);
        }
    }
}