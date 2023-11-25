package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServicoTest {

    FuncionarioGerente gerente;
    FuncionarioDiretor diretor;
    FuncionarioPresidente presidente;
    FuncionarioSupervisor supervisor;
    FuncionarioVendedor vendedor;

    @BeforeEach
    void setUp() {
        vendedor = new FuncionarioVendedor(null);
        supervisor = new FuncionarioSupervisor(vendedor);
        gerente = new FuncionarioGerente(supervisor);
        diretor = new FuncionarioDiretor(gerente);
        presidente = new FuncionarioPresidente(diretor);
    }

    @Test
    void deveRetornarPresidenteParaServicoPresidencial() {
        assertEquals("Presidente", presidente.iniciarServico(new Servico(TipoServicoPresidencial.getTipoServicoPresidencial())));
    }

    @Test
    void deveRetornarDiretorParaServicoDirecao() {
        assertEquals("Diretor", presidente.iniciarServico(new Servico(TipoServicoDirecao.getTipoServicoDirecao())));
    }

    @Test
    void deveRetornarGerenteParaServicoGerencial() {
        assertEquals("Gerente", presidente.iniciarServico(new Servico(TipoServicoGerencial.getTipoServicoGerencial())));
    }

    @Test
    void deveRetornarSupervisorParaServicoSupervisional() {
        assertEquals("Supervisor", presidente.iniciarServico(new Servico(TipoServicoSupervisional.getTipoServicoSupervisional())));
    }

    @Test
    void deveRetornarVendedorParaServicoVenda() {
        assertEquals("Vendedor", presidente.iniciarServico(new Servico(TipoServicoVenda.getTipoServicoVenda())));
    }
}