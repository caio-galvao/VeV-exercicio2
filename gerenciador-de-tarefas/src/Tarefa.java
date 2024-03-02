package src;

public class Tarefa {

    private String usuario;
    private String titulo;
    private String descricao;
    private String dataVencimento;
    private String prioridade;

    public Tarefa(String usuario, String titulo, String descricao, String dataVencimento, String prioridade) {
        this.usuario = usuario;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataVencimento = dataVencimento;
        this.prioridade = prioridade;
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

    public Object getDataVencimento() {
        return this.dataVencimento;
    }

    public Object getPrioridade() {
        return this.prioridade;
    }

}
