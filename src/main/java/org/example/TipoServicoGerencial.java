package org.example;

public class TipoServicoGerencial implements TipoServico {

    private static TipoServicoGerencial tipoServicoGerencial = new TipoServicoGerencial();

    private TipoServicoGerencial() {};

    public static TipoServicoGerencial getTipoServicoGerencial() {
        return tipoServicoGerencial;
    }
    
}
