package br.com.cidandrade.aulas;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author cidandrade
 */
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Retangulo extends FormaGeometrica {

    private double base, altura;

    @Override
    public double getArea() {
        return base * altura;
    }

    @Override
    public String getDescricao() {
        return toString() + " / Área: " + FORMATADOR.format(getArea());
    }

    @Override
    public String toString() {
        var baseFormatada = FORMATADOR.format(base);
        var alturaFormatada = FORMATADOR.format(altura);
        return "Retângulo com base de " + baseFormatada
                + " e altura de " + alturaFormatada;
    }

}
