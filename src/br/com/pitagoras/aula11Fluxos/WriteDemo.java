package br.com.pitagoras.aula11Fluxos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WriteDemo {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        int num;

        System.out.println("Insira uma frase: ");
        try {
            str = br.readLine();
            System.out.println(str);
            num = Integer.parseInt(str);
            System.out.println(num);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Não é possível converter string em int");
        }

//        int b;
//
//        b = 'X';
//
//        System.out.write(b);
//        System.out.write('\n');
    }
}
