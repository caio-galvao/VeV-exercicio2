import org.junit.Test;
import static org.junit.Assert.*;

public class GeradorNotaFiscalTest {
    @Test
    public void testGeracaoNotaFiscalConsultoria() {
        Fatura fatura = new Fatura("Arthur", "Endereço A", "CONSULTORIA", 1000.0);
        NotaFiscal notaFiscal = GeradorNotaFiscal.geraNotaFiscal(fatura);

        assertEquals("Cliente A", notaFiscal.getNomeCliente());
        assertEquals(1000.0, notaFiscal.getValor(), 0.001);
        assertEquals(250.0, notaFiscal.getImposto(), 0.001);
    }


}
