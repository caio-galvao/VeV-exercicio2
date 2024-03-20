package sistema;

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

    @Test
    public void testEnvioNotaFiscalSAP() {
        Fatura fatura = new Fatura("Pedro", "Endereço D", "CONSULTORIA", 3000.0);

        NotaFiscal notaFiscalMock = mock(NotaFiscal.class);
        when(notaFiscalMock.getNomeCliente()).thenReturn("Pedro");
        when(notaFiscalMock.getValor()).thenReturn(3000.0);
        when(notaFiscalMock.getImposto()).thenReturn(750.0);

        GeradorNotaFiscal.geraNotaFiscal(fatura);

        NotaFiscalDao notaFiscalDaoMock = mock(NotaFiscalDao.class);
        notaFiscalDaoMock.enviaParaSAP(notaFiscalMock);

        verify(notaFiscalDaoMock, times(1)).enviaParaSAP(notaFiscalMock);
    }

    @Test
    public void testEnvioNotaFiscalEmail() {
        Fatura fatura = new Fatura("Lucas", "Endereço do Cliente E", "TREINAMENTO", 4000.0);

        NotaFiscal notaFiscalMock = mock(NotaFiscal.class);
        when(notaFiscalMock.getNomeCliente()).thenReturn("Lucas");
        when(notaFiscalMock.getValor()).thenReturn(4000.0);
        when(notaFiscalMock.getImposto()).thenReturn(600.0);

        GeradorNotaFiscal.geraNotaFiscal(fatura);

        NotaFiscalDao notaFiscalDaoMock = mock(NotaFiscalDao.class);
        notaFiscalDaoMock.enviaPorEmail(notaFiscalMock);

        verify(notaFiscalDaoMock, times(1)).enviaPorEmail(notaFiscalMock);
    }
}
