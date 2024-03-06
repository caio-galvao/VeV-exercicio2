public class Fatura {
    private String nomeCliente;
    private String enderecoCliente;
    private String tipoServico;
    private double valor;

    public Fatura(String nomeCliente, String enderecoCliente, String tipoServico, double valor) {
        this.nomeCliente = nomeCliente;
        this.enderecoCliente = enderecoCliente;
        this.tipoServico = tipoServico;
        this.valor = valor;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public double getValor() {
        return valor;
    }
}
