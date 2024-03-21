package sistema;

public interface NotaFiscalDao {
    void salva(NotaFiscal notaFiscal);

    void enviaParaSAP(NotaFiscal notaFiscal);

    void enviaPorEmail(NotaFiscal notaFiscal);
}
