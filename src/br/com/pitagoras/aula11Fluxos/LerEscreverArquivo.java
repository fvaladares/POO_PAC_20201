package br.com.pitagoras.aula11Fluxos;

import java.io.*;

public class LerEscreverArquivo {
    public static void main(String[] args) {
        String entradaDoUsuario;
        String nomeDoArquivo = "ListaDeNomes.txt";
        FileWriter fileWriter; // Escrever no arquivo
        BufferedReader bufferedReader; // Faz a leitura dos caracteres do terminal

        System.out.println("Por favor, informe seu nome completo: ");
        System.out.print(": ");
        bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        try {

            entradaDoUsuario = bufferedReader.readLine();

            fileWriter = new FileWriter(nomeDoArquivo, true);
            entradaDoUsuario += "\r\n";
            fileWriter.write(entradaDoUsuario);
            fileWriter.close();
            bufferedReader.close();
            System.out.println("Fim do programa.");
        } catch (IOException e) {
            System.err.println(
                    "Falha 200: Não é possível realizar a leitura de dados no momento, " +
                            "tente novamente mais tarde. Se o problema persistir, por favor, " +
                            "entre em contato com suporte através do helpdesk.");
//            e.printStackTrace();
        }

        System.out.println("Conteúdo do arquivo: ");
        try {
            bufferedReader = new BufferedReader(new FileReader(nomeDoArquivo));
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
