public class GeradorNotaFiscal {
    public static NotaFiscal geraNotaFiscal(Fatura fatura) {
        double imposto = fatura.getValor() * 0.25; // imposto fixo de 25%
        return new NotaFiscal(fatura.getNomeCliente(), fatura.getValor(), imposto);
    }
}
