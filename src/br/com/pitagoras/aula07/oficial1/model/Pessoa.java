package br.com.pitagoras.aula07.oficial1.model;

/**
 * Classe Pessoa
 */
public abstract class Pessoa {
    // Criação dos atributos da classe Pessoa
    private String nome;
    private String sobrenome;

    // Construtor parametrizado (obriga a passagem de valores ao construir o objeto)
//    public Pessoa(String nome,
//                  String sobrenome) {
//        this.nome = nome;
//        this.sobrenome = sobrenome;
//    }

    // Construtor vazio.
//    public Pessoa() {
//        this.nome = "";
//        this.sobrenome = "";
//    }

    public String getNomeCompleto() {
        return this.nome + " " + this.sobrenome;
    }

    public String getNome() {
        return this.nome;
    }

    // TODO Validar campo vazio.
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

}
