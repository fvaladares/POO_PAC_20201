package br.com.pitagoras.aula07.oficial1.model;

/**
 * Classe Pessoa
 */
public abstract class Pessoa {
    // Criação dos atributos da classe Pessoa
    private String nome;
    private String sobrenome;

    public String getNomeCompleto() {
        return this.nome + " " + this.sobrenome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // TODO Validar campo vazio.
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public abstract String returnNomeCompleto(String separador);

}