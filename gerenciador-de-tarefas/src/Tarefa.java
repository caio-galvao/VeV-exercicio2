package src;

public class Tarefa {

    private String usuario;
    private String titulo;
    private String descricao;

    public Tarefa(String usuario, String titulo, String descricao, String dataVencimento, String prioridade) {
        this.usuario = usuario;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

}
