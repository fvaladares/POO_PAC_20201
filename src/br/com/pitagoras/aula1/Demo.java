package br.com.pitagoras.aula1;

import java.util.Locale;
import java.util.Scanner;

public class Demo {
    /**
     * @param args - parâmetros utilizados ao chamar a classe por linha de comando
     */
    // Ponto de partida do código
    public static void main(String[] args) {
        Triangulo triangulo;
        triangulo = new Triangulo();

        Scanner input = new Scanner(System.in);


        System.out.println("Programa para cálculo da área de um triângulo");
        System.out.println();
        System.out.print("Por favor, informe o valor da base: ");
        triangulo.base = input.nextDouble();
        System.out.println();
        System.out.print("Por favor, informe o valor da altura: ");
        triangulo.height = input.nextDouble();
        System.out.println();
        System.out.printf(
                "A área para o triângulo informado é: %f \n",
                triangulo.area()
        );


        // Para executar os outros exemplos, remova o comentário da próxima linha
        // (ctrl + /)
//        exemploBasico();
    }

    public static void exemploBasico() {
        // Variável do tipo Scanner
        Scanner entradaTeclado;
        // Instância da classe Scanner
        entradaTeclado = new Scanner(System.in);
        String nome;
        int idade;
        double peso;
        double altura;
        int i = 0;

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

        System.out.println();
        System.out.println("Exemplo de utilização do While");
        // Exemplo while
        while (i < 100) {
            if (i % 2 == 0) {
                i++; // i = i+1
                continue;
            } else {
                System.out.printf("%d, ", i);
                i++; // i = i+1
            }
        }
        System.out.println("Valor do i: " + i);

        System.out.println();
        System.out.println("Exemplo de utilização do DO/WHILE");
        do {
            System.out.printf("%d, ", i);
            i++; // i = i+1
        } while (i < 100);

        System.out.println();
        System.out.println("Exemplo de utilização do FOR");
        // Exemplo for
        for (i = 0; i < 100; i++) {
            System.out.printf("%d, ", i);
            if (i == 50)
                break;
        }
    }
}
