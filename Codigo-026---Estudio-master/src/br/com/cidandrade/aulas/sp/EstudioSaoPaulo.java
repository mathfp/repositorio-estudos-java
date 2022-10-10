package br.com.cidandrade.aulas.sp;

import br.com.cidandrade.aulas.ensaio.Ensaio;
import br.com.cidandrade.aulas.ensaio.Estudio;
import br.com.cidandrade.aulas.enums.TipoEnsaio;

public class EstudioSaoPaulo extends Estudio {

    @Override
    public Ensaio criaEnsaio(TipoEnsaio tipo) {
        Ensaio ensaio = null;
        switch (tipo) {
            case CATALOGO:
                ensaio = new CatalogoSP();
                break;
            case MASCULINO:
                ensaio = new MasculinoSP();
                break;
            case FEMININO:
                ensaio = new FemininoSP();
                break;
        }
        return ensaio;
    }

}
