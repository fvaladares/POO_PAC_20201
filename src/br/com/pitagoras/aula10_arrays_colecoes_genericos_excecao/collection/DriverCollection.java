package br.com.pitagoras.aula10_arrays_colecoes_genericos_excecao.collection;

import java.util.ArrayList;

public class DriverCollection {

    public static void main(String[] args) {
        ArrayList<Double> listaTemperatura = new ArrayList<Double>();

        System.out.println("Tamanho do arrayList: " + listaTemperatura.size());
        listaTemperatura.add(25.3);
        listaTemperatura.add(25.4);
        listaTemperatura.add(27.4);
        System.out.println("Tamanho do arrayList: " + listaTemperatura.size());

        for (int i = 0; i < listaTemperatura.size(); i++) {
            System.out.println("Temperatura " + (i + 1) + ": " + listaTemperatura.get(i));
        }

        listaTemperatura.remove(25.3);

        System.out.println("------");
        for (int i = 0; i < listaTemperatura.size(); i++) {
            System.out.println("Temperatura " + (i + 1) + ": " + listaTemperatura.get(i));
        }

        try {
            System.out.println(10 / 0);
            listaTemperatura.remove(4);
            System.out.println("------");
            for (int i = 0; i < listaTemperatura.size(); i++) {
                System.out.println("Temperatura " + (i + 1) + ": " + listaTemperatura.get(i));
            }

        } catch (IndexOutOfBoundsException exception) {
            System.err.println("Falha na execução do aplicativo, você tentou acessar uma posição inválida. " +
                    exception.getMessage()
            );
        } catch (ArithmeticException arithmeticException) {
            System.err.println("Não é possível dividir por zero!!!");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }


    }
}
