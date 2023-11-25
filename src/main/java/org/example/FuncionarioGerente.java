package org.example;

public class FuncionarioGerente extends Funcionario {

    public FuncionarioGerente(Funcionario inferior) {
        listaServicos.add(TipoServicoGerencial.getTipoServicoGerencial());
        setFuncionarioInferior(inferior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Gerente";
    }
}
