import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FaturaTest {

    @Test
    public void testGetNomeCliente() {
        Fatura fatura = new Fatura("Cliente A", "Endereço A", "SERVICO_A", 1000.0);

        assertEquals("Cliente A", fatura.getNomeCliente());
    }

    @Test
    public void testGetEnderecoCliente() {
        Fatura fatura = new Fatura("Cliente B", "Endereço B", "SERVICO_B", 2000.0);

        assertEquals("Endereço B", fatura.getEnderecoCliente());
    }

    @Test
    public void testGetTipoServico() {
        Fatura fatura = new Fatura("Cliente C", "Endereço C", "SERVICO_C", 3000.0);

        assertEquals("SERVICO_C", fatura.getTipoServico());
    }

    @Test
    public void testGetValor() {
        Fatura fatura = new Fatura("Cliente D", "Endereço D", "SERVICO_D", 4000.0);

        assertEquals(4000.0, fatura.getValor(), 0.001);
    }
}
