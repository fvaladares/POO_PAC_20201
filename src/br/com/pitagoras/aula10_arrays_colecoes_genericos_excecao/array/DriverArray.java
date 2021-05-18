package br.com.pitagoras.aula10_arrays_colecoes_genericos_excecao.array;

public class DriverArray {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        double[] temperaturas = {23.5, 24.0, 23.4, 25, 25.2};
        double[][] notas = new double[2][3];

        System.out.println("Imprimindo o array números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice: " + (i + 1) + ": " + numeros[i]);
        }
        System.out.println();


        System.out.println("Imprimindo o array temperaturas:");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Dia: " + (i + 1) + ": " + temperaturas[i]);
        }
        System.out.println("Esta linha deveria ser executada.");


        System.out.println("Imprimindo o array temperaturas com foreach:");
        for (double temperatura : temperaturas) {
            System.out.print(temperatura + ", ");
        }
        System.out.println();
        System.out.println("Esta linha deveria ser executada.");
    }
}
