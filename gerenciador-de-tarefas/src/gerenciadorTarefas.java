package src;

public class gerenciadorTarefas {

    public static Tarefa criarTarefa(String usuario, String titulo, String descricao, String dataVencimento, String prioridade) {
       Tarefa tarefa = new Tarefa(usuario, titulo, descricao, dataVencimento, prioridade);
       return tarefa;
    }
    
}
