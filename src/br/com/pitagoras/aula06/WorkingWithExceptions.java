package br.com.pitagoras.aula06;

import javax.swing.*;

public class WorkingWithExceptions {

    public static void main(String[] args) {
        try {
            System.out.println("Line 9");
//            throw new IllegalStateException();

        } catch (IllegalStateException e) {
            System.out.println("Desculpe, algo inesperado aconteceu.");
            JOptionPane.showMessageDialog(null,
                    "Erro código 500",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
//            e.printStackTrace();
        } finally {
            System.out.println("Estamos no bloco finally");
        }
    }
}
