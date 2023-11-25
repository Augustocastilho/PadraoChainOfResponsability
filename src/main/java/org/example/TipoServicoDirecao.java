package org.example;

public class TipoServicoDirecao implements TipoServico {

    private static TipoServicoDirecao tipoServicoDirecao = new TipoServicoDirecao();

    private TipoServicoDirecao() {};

    public static TipoServicoDirecao getTipoServicoDirecao() {
        return tipoServicoDirecao;
    }

}
