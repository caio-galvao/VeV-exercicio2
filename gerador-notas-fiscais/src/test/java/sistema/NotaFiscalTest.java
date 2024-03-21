package sistema;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NotaFiscalTest {

    @Test
    public void testGetNomeCliente() {
        NotaFiscal notaFiscal = new NotaFiscal("Cliente B", 2000.0, 500.0);

        assertEquals("Cliente B", notaFiscal.getNomeCliente());
    }

    @Test
    public void testGetValor() {
        NotaFiscal notaFiscal = new NotaFiscal("Cliente C", 3000.0, 750.0);

        assertEquals(3000.0, notaFiscal.getValor(), 0.001);
    }

    @Test
    public void testGetImposto() {
        NotaFiscal notaFiscal = new NotaFiscal("Cliente D", 4000.0, 1000.0);

        assertEquals(1000.0, notaFiscal.getImposto(), 0.001);
    }
}
