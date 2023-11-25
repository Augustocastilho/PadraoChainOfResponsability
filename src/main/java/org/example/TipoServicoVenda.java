package org.example;

public class TipoServicoVenda implements TipoServico{

    private static TipoServicoVenda tipoServicoVenda = new TipoServicoVenda();

    private TipoServicoVenda() {};

    public static TipoServicoVenda getTipoServicoVenda() {
        return tipoServicoVenda;
    }

}
