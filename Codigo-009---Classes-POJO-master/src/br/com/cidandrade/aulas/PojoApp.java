package br.com.cidandrade.aulas;

import br.com.cidandrade.util.Entrada;
import br.com.cidandrade.util.Mensagem;

/**
 *
 * @author cidandrade
 */
public class PojoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            float medida1 = Entrada.getFloat("Digite uma medida");
            float medida2 = Entrada.getFloat("Digite outra medida");

            Triangulo triangulo = new Triangulo(medida1, medida2);
            Retangulo retangulo = new Retangulo(medida1, medida2);

            System.out.println(triangulo.getDescricao());
            System.out.println(retangulo.getDescricao());
        } catch (NumberFormatException e) {
            Mensagem.msgErro("Erro na entrada de dados.\n"
                    + e.getLocalizedMessage());
        } finally {
            System.exit(0);
        }
    }

}
