package br.com.pitagoras.aula0;

// Importação de bibliotecas necessárias

import java.util.Scanner;

/**
 * Nome da classe [Aula0.java]
 */
public class Aula0 {
    //  Método MAIN é o Ponto de partida da aplicação.
    public static void main(String[] args) {
        /*
          Criamos um identificador para uma variável do tipo [SomaDoisInteiros.java]
          Em seguida associamos um objeto do mesmo tipo usando palavra reservada new
         */
        SomaDoisInteiros somaDoisInteiros = new SomaDoisInteiros();

        // Declaração da variável do tipo [SomaDoisInteiros] -- Ainda não existe um objeto!!!
        SomaDoisInteiros somaDoisInteiros2;

        // Criação da instância de [SomaDoisInteiros] -- Agora o objeto existe!!!
        somaDoisInteiros2 = new SomaDoisInteiros();

        // Passando valores para os atributos do objeto (atributos são os características do objeto)
        somaDoisInteiros.parcela1 = 10;
        somaDoisInteiros.parcela2 = 20;

        // System.out.println -> Utilizado para exibir mensagens na tela para o usuário.
        // Você pode passar uma Constante de caracteres (String), uma variável, ou expressão.
        // Como na linha [33]
        System.out.println("Resultado da soma: 30 + 30: " +
                somaDoisInteiros.soma(30, 30));
        System.out.println("Resultado da soma: utilizando atributos: " +
                somaDoisInteiros.soma());

        System.out.println("Parcela1: " + somaDoisInteiros.parcela1);
        System.out.println("Parcela2: " + somaDoisInteiros.parcela2);
        System.out.println("Resultado: " + somaDoisInteiros.resposta);

        /*
          Um objeto da classe Scanner é utilizado para fazer a leitura dos dados
          informados pelo usuário por intermédio do terminal.
          .nextInt -> lê um inteiro, pesquise sobre os demais métodos.
         */
        Scanner input = new Scanner(System.in);
        System.out.println();

        System.out.print("Por favor, informe o valor da parcela 1: ");
        somaDoisInteiros.parcela1 = input.nextInt();
        System.out.println();
        System.out.print("Por favor, informe o valor da parcela 2: ");
        somaDoisInteiros.parcela2 = input.nextInt();
        System.out.println();


        System.out.printf("Resultado da soma: %s + %s = %s  ",
                somaDoisInteiros.parcela1,
                somaDoisInteiros.parcela2,
                somaDoisInteiros.soma());

        /*
          Estruturas de decisão e repetição -> São idênticas às do C++
         */
        if (10 < somaDoisInteiros.resposta) {
            System.out.println("Passou");
        } else {
            System.out.println("Não Passou");
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }

        int j = 0;
        while (j < 10) {
            System.out.println(j);
            j++;
        }
    }


    // Segundo método [imprimir()]
    public static void imprimir() {
        System.out.println("Hello world!");
        System.out.println("Olá, bem vindo ao maravilhoso mundo Java!!!");
        System.out.print("Nãão quebra a linha\n");
        System.out.printf("\nOláá %s ", "Fabricio\n");


    }
}
