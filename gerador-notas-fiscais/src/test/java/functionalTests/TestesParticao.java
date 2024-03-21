package functionalTests;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import sistema.Fatura;
import sistema.GeradorNotaFiscal;
import sistema.NotaFiscal;

public class TestesParticao {

    @Test
    public void testeValorFaturaValido() {
        // Partição de Valores Válidos para Fatura
        Fatura fatura = new Fatura("Cliente", "Endereço", "CONSULTORIA", 100.00);
        NotaFiscal notaFiscal = GeradorNotaFiscal.geraNotaFiscal(fatura);
        assertEquals(25.00, notaFiscal.getImposto(), 0.001);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testeValorFaturaNegativo() {
        // Partição de Valores Inválidos para Fatura
        Fatura fatura = new Fatura("Cliente", "Endereço", "CONSULTORIA", -100.00);
        NotaFiscal notaFiscal = GeradorNotaFiscal.geraNotaFiscal(fatura);
    }

    @Test
    public void testeTipoServicoConsultoria() {
        // Partição de Tipos de Serviço
        Fatura fatura = new Fatura("Cliente", "Endereço", "CONSULTORIA", 500.00);
        NotaFiscal notaFiscal = GeradorNotaFiscal.geraNotaFiscal(fatura);
        Assert.assertEquals(125.00, notaFiscal.getImposto(), 0.001);
    }

    @Test
    public void testeTipoServicoInvalido() {
        // Partição de Outros Tipos de Serviço
        Fatura fatura = new Fatura("Cliente", "Endereço", "DIAGRAMAÇÃO", 300.00);
        NotaFiscal notaFiscal = GeradorNotaFiscal.geraNotaFiscal(fatura);
        assertEquals(18.00, notaFiscal.getImposto(), 0.001);
    }
}
