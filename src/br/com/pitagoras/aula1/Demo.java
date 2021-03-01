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
        String nome;
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

        // Utilizando If/Else
        if (idade >= 18) {
            System.out.println("Entrada Liberada, seja bem vindo!!");
        } else {
            System.out.println("Entrada bloqueada, você ainda não atingiu a idade mínima");
        }

        // Utilizando o operador ternário do java :?
        System.out.println(
                idade >= 18 ?
                        "Entrada Liberada, seja bem vindo!!" :
                        "Entrada bloqueada, você ainda não atingiu a idade mínima"
        );
    }
}
