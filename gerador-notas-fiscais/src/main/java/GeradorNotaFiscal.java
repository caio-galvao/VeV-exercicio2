public class GeradorNotaFiscal {

    public static NotaFiscal geraNotaFiscal(Fatura fatura) {
        if (fatura.getValor() <= 0) {
            throw new IllegalArgumentException("Valor da fatura deve ser maior que zero.");
        }
        double imposto = getImposto(fatura);
        return new NotaFiscal(fatura.getNomeCliente(), fatura.getValor(), imposto);
    }

    private static double getImposto(Fatura fatura) {
        double imposto = 0;
        if (fatura.getTipoServico().equals("CONSULTORIA")) {
            imposto = fatura.getValor() * 0.25; // 25% de imposto para consultoria
        } else if (fatura.getTipoServico().equals("TREINAMENTO")) {
            imposto = fatura.getValor() * 0.15; // 15% de imposto para treinamento
        } else {
            imposto = fatura.getValor() * 0.06; // 6% de imposto para qualquer outro serviço
        }
        return imposto;
    }

}
