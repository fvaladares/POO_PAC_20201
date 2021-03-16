package br.com.pitagoras.aula3;

import java.util.Arrays;

public class Exercicio3 {
    // Declaração de atributos
// --------------------------------------------------------------------
    private int[] numbers; // Array declaration
    private int biggerValue = Integer.MIN_VALUE; // Armazenará o maior valor do array
    private int smallestValue = Integer.MAX_VALUE; // Armazenará o menor valor do array


// --------------------------------------------------------------------
// Declaração de métodos

    public Exercicio3(int[] numbers) {
        this.numbers = numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int getBiggerValue() {
        if (biggerValue == Integer.MIN_VALUE)
            this.biggerValue();
        return biggerValue;
    }

    public int getSmallestValue() {
        if (smallestValue == Integer.MAX_VALUE)
            this.smallestValue();
        return smallestValue;
    }

    /**
     * This method initialize the array (create the object)
     *
     * @param size -- this is the size of the array
     */
    public void initArray(int size) {
        this.numbers = new int[size];
    }

    private int biggerValue() {
        biggerValue = numbers[0];

        // For tradicional
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > biggerValue) {
                biggerValue = numbers[i];
            }
        }
        return biggerValue;
    }

    private int smallestValue() {
        smallestValue = numbers[0];

        // For simplificado (enhanced/foreach)
        for (int number : numbers) {
            if (number < smallestValue) {
                smallestValue = number;
            }
        }
        return smallestValue;
    }

    @Override
    public String toString() {
        return "Exercicio3{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }
}
