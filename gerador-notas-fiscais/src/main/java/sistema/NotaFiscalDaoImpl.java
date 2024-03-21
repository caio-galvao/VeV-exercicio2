package sistema;

public class NotaFiscalDaoImpl implements NotaFiscalDao {
    @Override
    public void salva(NotaFiscal notaFiscal) {
        System.out.println("Salvando nota fiscal no banco de dados...");
        System.out.println("Nome do cliente: " + notaFiscal.getNomeCliente());
        System.out.println("Valor: " + notaFiscal.getValor());
        System.out.println("Imposto: " + notaFiscal.getImposto());
        System.out.println("Nota fiscal salva com sucesso!");
    }

    public void enviaParaSAP(NotaFiscal notaFiscal) {
        System.out.println("Enviando nota fiscal para o SAP...");
        System.out.println("Nome do cliente: " + notaFiscal.getNomeCliente());
        System.out.println("Valor: " + notaFiscal.getValor());
        System.out.println("Imposto: " + notaFiscal.getImposto());
        System.out.println("Nota fiscal enviada para o SAP com sucesso!");
    }

    public void enviaPorEmail(NotaFiscal notaFiscal) {
        System.out.println("Enviando nota fiscal por e-mail...");
        System.out.println("Nome do cliente: " + notaFiscal.getNomeCliente());
        System.out.println("Valor: " + notaFiscal.getValor());
        System.out.println("Imposto: " + notaFiscal.getImposto());
        System.out.println("Nota fiscal enviada por e-mail com sucesso!");
    }
}
