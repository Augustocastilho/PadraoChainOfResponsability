package org.example;

public class FuncionarioDiretor extends Funcionario {

    public FuncionarioDiretor(Funcionario inferior) {
        listaServicos.add(TipoServicoDirecao.getTipoServicoDirecao());
        setFuncionarioInferior(inferior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Diretor";
    }
}
