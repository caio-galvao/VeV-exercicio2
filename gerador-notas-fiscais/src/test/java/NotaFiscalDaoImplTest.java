import org.junit.Test;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class NotaFiscalDaoImplTest {
    @Test
    public void testPersistenciaNotaFiscalBancoDados() {
        Fatura fatura = new Fatura("Maria", "Endereço D", "DESENVOLVIMENTO", 5000.0);

        NotaFiscal notaFiscalMock = mock(NotaFiscal.class);
        when(notaFiscalMock.getNomeCliente()).thenReturn("Maria");
        when(notaFiscalMock.getValor()).thenReturn(5000.0);
        when(notaFiscalMock.getImposto()).thenReturn(300.0);

        GeradorNotaFiscal.geraNotaFiscal(fatura);

        NotaFiscalDao notaFiscalDaoMock = mock(NotaFiscalDao.class);
        notaFiscalDaoMock.salva(notaFiscalMock);

        verify(notaFiscalDaoMock, times(1)).salva(notaFiscalMock);
    }
}
