package src;

public class Tarefa {

    private String usuario;
    private String titulo;

    public Tarefa(String usuario, String titulo, String descricao, String dataVencimento, String prioridade) {
        this.usuario = usuario;
        this.titulo = titulo;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public String getTitulo() {
        return this.titulo;
    }

}
