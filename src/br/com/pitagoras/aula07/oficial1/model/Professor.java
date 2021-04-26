package br.com.pitagoras.aula07.oficial1.model;

public class Professor extends Funcionario {
    public Professor(String nome,
                     String sobrenome,
                     int matricula,
                     double salario) {
        super(nome, sobrenome, matricula, salario);
    }

    private double getSalario() {
        return super.getSalarioPrimeiraParcela() + getSalarioSegundaParcela();
    }

    @Override
    public double getSalarioPrimeiraParcela() {
        return this.getSalarioSegundaParcela();
    }

    @Override
    public double getSalarioSegundaParcela() {
        return 0.0;
    }
}
