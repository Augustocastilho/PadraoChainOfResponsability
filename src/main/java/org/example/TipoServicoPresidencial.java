package org.example;

public class TipoServicoPresidencial implements TipoServico {

    private static TipoServicoPresidencial tipoServicoPresidencial = new TipoServicoPresidencial();

    private TipoServicoPresidencial() {};

    public static TipoServicoPresidencial getTipoServicoPresidencial() {
        return tipoServicoPresidencial;
    }

}
