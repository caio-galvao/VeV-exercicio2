import org.junit.Test;

import static javax.management.Query.times;
import static org.junit.Assert.*;

public class GeradorNotaFiscalTest {
    @Test
    public void testGeracaoNotaFiscalConsultoria() {
        Fatura fatura = new Fatura("Arthur", "Endereço A", "CONSULTORIA", 1000.0);
        NotaFiscal notaFiscal = GeradorNotaFiscal.geraNotaFiscal(fatura);

        assertEquals("Arthur", notaFiscal.getNomeCliente());
        assertEquals(1000.0, notaFiscal.getValor(), 0.001);
        assertEquals(250.0, notaFiscal.getImposto(), 0.001);
    }

    @Test
    public void testGeracaoNotaFiscalTreinamento() {
        Fatura fatura = new Fatura("Pedro", "Endereço B", "TREINAMENTO", 1500.0);
        NotaFiscal notaFiscal = GeradorNotaFiscal.geraNotaFiscal(fatura);

        assertEquals("Pedro", notaFiscal.getNomeCliente());
        assertEquals(1500.0, notaFiscal.getValor(), 0.001);
        assertEquals(225.0, notaFiscal.getImposto(), 0.001);
    }

    @Test
    public void testGeracaoNotaFiscalDesenvolvimento() {
        Fatura fatura = new Fatura("Carlos", "Endereço C", "DESENVOLVIMENTO", 2000.0);
        NotaFiscal notaFiscal = GeradorNotaFiscal.geraNotaFiscal(fatura);

        assertEquals("Carlos", notaFiscal.getNomeCliente());
        assertEquals(2000.0, notaFiscal.getValor(), 0.001);
        assertEquals(120.0, notaFiscal.getImposto(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGeracaoNotaFiscalComServicoInvalido() {
        Fatura fatura = new Fatura("Heitor", "Endereço aux", "SERVICO_INVALIDO", 2000.0);
        GeradorNotaFiscal.geraNotaFiscal(fatura);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGeracaoNotaFiscalComValorNegativo() {
        Fatura fatura = new Fatura("Victória", "Endereço aux", "DESENVOLVIMENTO", -3000.0);
        GeradorNotaFiscal.geraNotaFiscal(fatura);
    }
}
