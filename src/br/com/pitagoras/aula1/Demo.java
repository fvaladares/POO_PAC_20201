package br.com.pitagoras.aula1;

import java.util.Scanner;

public class Demo {
    /**
     * @param args - parâmetros utilizados ao chamar a classe por linha de comando
     */
    // Ponto de partida do código
    public static void main(String[] args) {
        // Variável do tipo Scanner
        Scanner entradaTeclado;
        // Instância da classe Scanner
        entradaTeclado = new Scanner(System.in);
        int idade;
        double peso;
        double altura;
        System.out.println();
        System.out.println("Olá, seja bem vindo!");
        System.out.println();
        // Imprime na mesma linha
        System.out.print("Por favor, informe sua idade: ");
        idade = entradaTeclado.nextInt();
        System.out.printf("\nA idade informada foi %d anos", idade);
        System.out.println();

    }
}
