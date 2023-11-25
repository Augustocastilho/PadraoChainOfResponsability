package org.example;

public class FuncionarioPresidente extends Funcionario {

    public FuncionarioPresidente(Funcionario inferior) {
        listaServicos.add(TipoServicoPresidencial.getTipoServicoPresidencial());
        setFuncionarioInferior(inferior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Presidente";
    }
}
