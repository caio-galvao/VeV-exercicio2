package functionalTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import sistema.Fatura;
import sistema.GeradorNotaFiscal;
import sistema.NotaFiscal;


public class TestesTabelasDecisao {

    @Test
    public void testeConsultaImpostoConsultoria() {
        // Valor da fatura válido (> 0), Tipo de serviço = CONSULTORIA
        Fatura fatura = new Fatura("Cliente", "Endereço", "CONSULTORIA", 500.00);
        NotaFiscal notaFiscal = GeradorNotaFiscal.geraNotaFiscal(fatura);
        assertEquals(125.00, notaFiscal.getImposto(), 0.001);
    }

    @Test
    public void testeConsultaImpostoTreinamento() {
        // Valor da fatura válido (> 0), Tipo de serviço = TREINAMENTO
        Fatura fatura = new Fatura("Cliente", "Endereço", "TREINAMENTO", 800.00);
        NotaFiscal notaFiscal = GeradorNotaFiscal.geraNotaFiscal(fatura);
        assertEquals(120.00, notaFiscal.getImposto(), 0.001);
    }

    @Test
    public void testeConsultaImpostoOutro() {
        // Valor da fatura válido (> 0), Tipo de serviço = Outro
        Fatura fatura = new Fatura("Cliente", "Endereço", "Outro", 1200.00);
        NotaFiscal notaFiscal = GeradorNotaFiscal.geraNotaFiscal(fatura);
        assertEquals(72.00, notaFiscal.getImposto(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testeFaturaValorZero() {
        //Valor da fatura válido (0), Tipo de serviço qualquer
        Fatura fatura = new Fatura("Cliente", "Endereço", "CONSULTORIA", 0.00);
        NotaFiscal notaFiscal = GeradorNotaFiscal.geraNotaFiscal(fatura);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testeFaturaValorNegativo() {
        //Valor da fatura inválido (< 0), Tipo de serviço qualquer
        Fatura fatura = new Fatura("Cliente", "Endereço", "TREINAMENTO", -100.00);
        NotaFiscal notaFiscal = GeradorNotaFiscal.geraNotaFiscal(fatura);
    }

    @Test
    public void testeConsultaImpostoMaximoConsultoria() {
        //Valor da fatura máximo, Tipo de serviço = CONSULTORIA
        Fatura fatura = new Fatura("Cliente", "Endereço", "CONSULTORIA", Double.MAX_VALUE);
        NotaFiscal notaFiscal = GeradorNotaFiscal.geraNotaFiscal(fatura);
        assertEquals(4.4942328371557893E307, notaFiscal.getImposto(), 0.001);
    }

    @Test
    public void testeConsultaImpostoMaximoTreinamento() {
        //Valor da fatura máximo, Tipo de serviço = TREINAMENTO
        Fatura fatura = new Fatura("Cliente", "Endereço", "TREINAMENTO", Double.MAX_VALUE);
        NotaFiscal notaFiscal = GeradorNotaFiscal.geraNotaFiscal(fatura);
        assertEquals(2.6965397022934733E307, notaFiscal.getImposto(), 0.001);
    }

    @Test
    public void testeConsultaImpostoMaximoOutro() {
        //Valor da fatura máximo, Tipo de serviço = Outro
        Fatura fatura = new Fatura("Cliente", "Endereço", "Outro", Double.MAX_VALUE);
        NotaFiscal notaFiscal = GeradorNotaFiscal.geraNotaFiscal(fatura);
        assertEquals(1.0786158809173894E307, notaFiscal.getImposto(), 0.001);
    }
}
