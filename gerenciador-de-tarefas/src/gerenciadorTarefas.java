package src;

import java.util.HashMap;

public class GerenciadorTarefas {

    private HashMap<String, Tarefa> tarefas;

    public GerenciadorTarefas() {
        this.tarefas = new HashMap<String, Tarefa>();
    }

    public Tarefa getTarefa(String usuario, String titulo) {
        return this.tarefas.get(titulo);
    }

    public Boolean criarTarefa(String usuario, String titulo, String descricao, String dataVencimento, String prioridade) {
        if (tarefas.containsKey(titulo)) {
            return false;
        }
        
        Tarefa tarefa = new Tarefa(usuario, titulo, descricao, dataVencimento, prioridade);
        this.tarefas.put(titulo, tarefa);
        return true;
    }

    public Boolean atualizarTituloTarefa(String usuario, String titulo, String novoTitulo) {
        Tarefa tarefa = tarefas.get(titulo);
        
        if (tarefa == null) {
            return false;
        }

        tarefa.setTitulo(novoTitulo);
        tarefas.remove(titulo);
        tarefas.put(novoTitulo, tarefa);
        return true;
    }

    public Boolean atualizarDescricaoTarefa(String usuario, String titulo, String novaDescricao) {
        Tarefa tarefa = tarefas.get(titulo);
        
        if (tarefa == null) {
            return false;
        }
        
        tarefa.setDescricao(novaDescricao);
        return true;
    }

    public Boolean atualizarDataVencimento(String usuario, String titulo, String novaDataVencimento) {
        Tarefa tarefa = tarefas.get(titulo);

        if (tarefa == null) {
            return false;
        }

        tarefa.setDataVencimento(novaDataVencimento);
        return true;
    }

    public Boolean atualizarPrioridade(String usuario, String titulo, String novaPrioridade) {
        Tarefa tarefa = tarefas.get(titulo);

        if (tarefa == null) {
            return false;
        }

        tarefa.setPrioridade(novaPrioridade);
        return true;
    }

    public Boolean excluirTarefa(String usuario, String titulo) {
        Tarefa tarefaRemovida = this.tarefas.remove(titulo);
        if (tarefaRemovida == null) {
            return false;
        } else {
            return true;
        }
    }
}
