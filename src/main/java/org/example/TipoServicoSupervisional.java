package org.example;

public class TipoServicoSupervisional implements TipoServico {

    private static TipoServicoSupervisional tipoServicoSupervisional = new TipoServicoSupervisional();

    private TipoServicoSupervisional() {};

    public static TipoServicoSupervisional getTipoServicoSupervisional() {
        return tipoServicoSupervisional;
    }

}
