package br.com.pitagoras.aula07.oficial1.test;

import br.com.pitagoras.aula07.oficial1.model.Funcionario;
import br.com.pitagoras.aula07.oficial1.model.Pessoa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FuncionarioTest {

    @Test
    public void objetoInstanciadeFuncionario() {
        String nome = "Fabricio";
        String sobrenome = "Valadares";
        double salario = 1000.0;
        int matricula = 1010;
        Pessoa f = new Funcionario(nome, sobrenome, matricula, salario);

        assertTrue(f instanceof Funcionario);
        assertTrue(f instanceof Pessoa);
    }
}