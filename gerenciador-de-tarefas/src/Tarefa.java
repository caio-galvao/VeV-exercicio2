package src;

public class Tarefa {

    private String usuario;

    public Tarefa(String usuario, String titulo, String descricao, String dataVencimento, String prioridade) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return this.usuario;
    }

}
