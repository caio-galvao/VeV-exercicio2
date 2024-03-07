public class GeradorNotaFiscal {
    
    /* O cálculo do imposto poderia estar uma função separada, de modo a modularizar
    melhor e facilitar possíveis extensões ou mudanças de regras.
    * Caio - revisão 06/03/2024 */
    public static NotaFiscal geraNotaFiscal(Fatura fatura) {
        if (!ehServicoValido(fatura.getTipoServico())) {
            throw new IllegalArgumentException("Tipo de serviço inválido: " + fatura.getTipoServico());
        }
        if (fatura.getValor() <= 0) {
            throw new IllegalArgumentException("Valor da fatura deve ser maior que zero.");
        }
        double imposto = 0;
        if (fatura.getTipoServico().equals("CONSULTORIA")) {
            imposto = fatura.getValor() * 0.25; // 25% de imposto para consultoria
        } else if (fatura.getTipoServico().equals("TREINAMENTO")) {
            imposto = fatura.getValor() * 0.15; // 15% de imposto para treinamento
        /* Segundo a especificação, para qualquer outro tipo de fatura, não apenas
        desenvolvimento, o imposto pago é de 6%.
        * Caio - revisão 06/03/2024 */
        } else if (fatura.getTipoServico().equals("DESENVOLVIMENTO")) {
            imposto = fatura.getValor() * 0.06; // 6% de imposto para desenvolvimento
        }
        return new NotaFiscal(fatura.getNomeCliente(), fatura.getValor(), imposto);
    }

    /* Assim como o comentário anterior, de acordo com a especificação, não existem
    serviços inválidos. 
    * Caio - revisão 06/03/2024 */
    private static boolean ehServicoValido(String tipoServico) {
        return tipoServico.equals("CONSULTORIA") || tipoServico.equals("TREINAMENTO") || tipoServico.equals("DESENVOLVIMENTO");
    }
}
