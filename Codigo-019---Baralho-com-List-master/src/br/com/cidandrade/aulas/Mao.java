package br.com.cidandrade.aulas;

import br.com.cidandrade.util.Mensagem;
import java.util.List;

public class Mao extends ConjuntoDeCartas {

    @Override
    public void imprime() {
        StringBuilder sb = new StringBuilder();
        conjunto.forEach((c) -> sb.append(c).append(", "));
        String listaMao = sb.substring(0, sb.length() - 2);
        Mensagem.mensagem(listaMao);
    }

    public Mao(List<Carta> conjunto) {
        this.conjunto = conjunto;
    }

}
