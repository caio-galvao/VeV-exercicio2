package functionalTests;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import sistema.Fatura;
import sistema.NotaFiscal;
import sistema.GeradorNotaFiscal;

public class TestesValoresLimite {


    @Test
    public void testeFaturaComValorMinimo() {
        Fatura fatura = new Fatura("Arthur", "Rua X", "CONSULTORIA", 0.01);
        NotaFiscal notaFiscal = GeradorNotaFiscal.geraNotaFiscal(fatura);
        Assert.assertEquals(0.01, notaFiscal.getValor(), 0.001);
        Assert.assertEquals(0.0025, notaFiscal.getImposto(), 0.001);
    }

    @Test
    public void testeFaturaPoucoAcimaValorMinimo() {
        Fatura fatura = new Fatura("Arthur", "Rua X", "CONSULTORIA", 1);
        NotaFiscal notaFiscal = GeradorNotaFiscal.geraNotaFiscal(fatura);
        Assert.assertEquals(1, notaFiscal.getValor(), 0.001);
        Assert.assertEquals(0.25, notaFiscal.getImposto(), 0.001);
    }

    @Test
    public void testeFaturaPoucoAbaixoValorMaximo() {
        Fatura fatura = new Fatura("Arthur", "Rua X", "TREINAMENTO", Double.MAX_VALUE - 100);
        NotaFiscal notaFiscal = GeradorNotaFiscal.geraNotaFiscal(fatura);
        Assert.assertEquals(1.7976931348623157E308, notaFiscal.getValor(), 0.001);
        Assert.assertEquals(2.6965397022934733E307, notaFiscal.getImposto(), 0.001);
    }

    @Test
    public void testeFaturaComValorMaximo() {
        Fatura fatura = new Fatura("Arthur", "Rua X", "TREINAMENTO", Double.MAX_VALUE);
        NotaFiscal notaFiscal = GeradorNotaFiscal.geraNotaFiscal(fatura);
        Assert.assertEquals(1.7976931348623157E308, notaFiscal.getValor(), 0.001);
        Assert.assertEquals(2.6965397022934733E307, notaFiscal.getImposto(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testeFaturaComValorNulo() {
        Fatura fatura = new Fatura("Arthur", "Rua X", "Outro", 0.00);
        NotaFiscal notaFiscal = GeradorNotaFiscal.geraNotaFiscal(fatura);
    }
}
