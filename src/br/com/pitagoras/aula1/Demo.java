package br.com.pitagoras.aula1;

import java.util.Locale;
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
        int index = 0;

        System.out.println();
        System.out.println("Olá, seja bem vindo!");
        System.out.println();
        // Imprime na mesma linha
        System.out.print("Por favor, informe sua idade: ");
        idade = entradaTeclado.nextInt();
        System.out.printf("\nA idade informada foi %d anos", idade);
        System.out.println();
        System.out.println("Por favor, informe seu nome: ");
        nome = entradaTeclado.next();


        // Utilizando If/Else
        if (idade >= 18) {
            System.out.printf("Entrada Liberada %s, seja bem vindo!!\n", nome.toUpperCase(Locale.ROOT));
        } else {
            System.out.printf(
                    "%s, sua entrada foi bloqueada, você ainda não atingiu a idade mínima",
                    nome.toUpperCase()
            );
        }

        // Utilizando o operador ternário do java :?
        System.out.println(
                idade >= 18 ?
                        "Entrada Liberada, seja bem vindo!!" :
                        "Entrada bloqueada, você ainda não atingiu a idade mínima"
        );

        // Exemplo while
    }
}
