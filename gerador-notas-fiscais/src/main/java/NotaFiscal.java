public class NotaFiscal {
    private String nomeCliente;
    private double valor;
    private double imposto;

    public NotaFiscal(String nomeCliente, double valor, double imposto) {
        this.nomeCliente = nomeCliente;
        this.valor = valor;
        this.imposto = imposto;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getValor() {
        return valor;
    }

    public double getImposto() {
        return imposto;
    }
}
