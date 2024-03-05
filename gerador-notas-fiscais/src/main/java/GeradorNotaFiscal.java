public class GeradorNotaFiscal {
    public static NotaFiscal geraNotaFiscal(Fatura fatura) {
        double imposto = 0;
        if (fatura.getTipoServico().equals("CONSULTORIA")) {
            imposto = fatura.getValor() * 0.25; // 25% de imposto para consultoria
        } else if (fatura.getTipoServico().equals("TREINAMENTO")) {
            imposto = fatura.getValor() * 0.15; // 15% de imposto para treinamento
        } else if (fatura.getTipoServico().equals("DESENVOLVIMENTO")) {
            imposto = fatura.getValor() * 0.06; // 6% de imposto para desenvolvimento
        }
        return new NotaFiscal(fatura.getNomeCliente(), fatura.getValor(), imposto);
    }
}
