package src;

import java.util.HashMap;

public class GerenciadorTarefas {

    private HashMap<String, Tarefa> tarefas;

    public GerenciadorTarefas() {
        this.tarefas = new HashMap<String, Tarefa>();
    }

    public Tarefa criarTarefa(String usuario, String titulo, String descricao, String dataVencimento, String prioridade) {
       Tarefa tarefa = new Tarefa(usuario, titulo, descricao, dataVencimento, prioridade);
       this.tarefas.put(titulo, tarefa);
       return tarefa;
    }

    public Tarefa atualizarTituloTarefa(String usuario, String titulo, String novoTitulo) {
        Tarefa tarefa = tarefas.get(titulo);
        tarefa.setTitulo(novoTitulo);
        return tarefa;
    }
}
