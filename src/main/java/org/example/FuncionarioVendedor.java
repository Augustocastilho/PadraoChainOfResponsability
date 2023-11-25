package org.example;

public class FuncionarioVendedor extends Funcionario{

    public FuncionarioVendedor(Funcionario inferior) {
        listaServicos.add(TipoServicoVenda.getTipoServicoVenda());
        setFuncionarioInferior(inferior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Vendedor";
    }
}
