package br.com.pitagoras.aula07.oficial1.ui;

import java.util.Scanner;

public class ExecutorMenu {
    private Scanner entrada;

    public void menu() {
        boolean control = true;
        entrada = new Scanner(System.in);

        while (control) {
            System.out.println("Controle de Pessoas - Sistema de gestão de Pessoas");
            System.out.println("\t1. Casdastrar");
            System.out.println("\t2. Consultar");
            System.out.println("\t9. Sair");
            System.out.print("Opção: ");
            int opt = entrada.nextInt();
            System.out.println();
            if (opt == 1)
                cadastrar();
            else if (opt == 2)
                consultar();
            else if (opt == 9) {
                control = false;
                System.out.println("Programa encerrado");
            } else
                System.out.println("Opçao inválida, tente novamente");
        }
    }


    private void consultar() {
        System.out.println("consultar");
    }

    private void cadastrar() {
        int opt;
        System.out.println("Deseja cadastar Funcionario (1) ou Professor (2)");
        opt = entrada.nextInt();

        if (opt == 1) {

        }

    }
}
