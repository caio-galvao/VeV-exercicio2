package src;

public class GerenciadorTarefas {

    public static Tarefa criarTarefa(String usuario, String titulo, String descricao, String dataVencimento, String prioridade) {
       Tarefa tarefa = new Tarefa(usuario, titulo, descricao, dataVencimento, prioridade);
       return tarefa;
    }
    
}
