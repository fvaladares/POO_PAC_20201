package br.com.pitagoras.aula0;


// Nome da class
public class SomaDoisInteiros {

    // Atributos (Dados)
    int parcela1;
    int parcela2;
    int resposta;

    // Métodos com parâmetro
    public int soma(int parcela1, int parcela2) {
        resposta = parcela1 + parcela2;
        // this.parcela1 = parcela1;

        return resposta;
    }

    // Método sem parâmetro
    public int soma() {
        resposta = parcela1 + parcela2;

        return resposta;
    }

}

