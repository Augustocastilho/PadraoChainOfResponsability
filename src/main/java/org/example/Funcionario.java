package org.example;

import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList listaServicos = new ArrayList();
    private Funcionario funcionarioInferior;

    public Funcionario getFuncionarioInferior() {
        return funcionarioInferior;
    }

    public void setFuncionarioInferior(Funcionario funcionarioInferior) {
        this.funcionarioInferior = funcionarioInferior;
    }

    public abstract String getDescricaoCargo();

    public String iniciarServico(Servico servico) {
        if (listaServicos.contains(servico.getTipoServico())) {
            return getDescricaoCargo();
        }
        else {
            if (funcionarioInferior != null) {
                return funcionarioInferior.iniciarServico(servico);
            }
            else
            {
                return "Sem assinatura";
            }
        }
    }

}
