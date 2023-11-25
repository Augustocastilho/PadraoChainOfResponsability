package org.example;

public class FuncionarioSupervisor extends Funcionario {

    public FuncionarioSupervisor(Funcionario inferior) {
        listaServicos.add(TipoServicoSupervisional.getTipoServicoSupervisional());
        setFuncionarioInferior(inferior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Supervisor";
    }
}
