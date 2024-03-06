public class NotaFiscalDaoImpl implements NotaFiscalDao {
    @Override
    public void salva(NotaFiscal notaFiscal) {
        // Lógica para salvar a nota fiscal no banco de dados
        System.out.println("Salvando nota fiscal no banco de dados...");
        System.out.println("Nome do cliente: " + notaFiscal.getNomeCliente());
        System.out.println("Valor: " + notaFiscal.getValor());
        System.out.println("Imposto: " + notaFiscal.getImposto());
        System.out.println("Nota fiscal salva com sucesso!");
    }
}
