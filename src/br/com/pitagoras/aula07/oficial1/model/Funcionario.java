package br.com.pitagoras.aula07.oficial1.model;

public class Funcionario extends Pessoa {
    private int matricula;
    private double salario;

    // TODO validar salario negativo.
    public Funcionario(String nome,
                       String sobrenome,
                       int matricula,
                       double salario) {
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.matricula = matricula;
        this.salario = salario;
    }


    /**
     * @return 60% do salário
     */
    public double getSalarioPrimeiraParcela() {
        return this.salario * 0.6;
    }

    /**
     * @return 40% do salário
     */
    public double getSalarioSegundaParcela() {
        return this.salario * 0.4;
    }

    @Override
    public String returnNomeCompleto(String separador) {
        return this.getNome() + separador + this.getSobrenome();
    }
}
