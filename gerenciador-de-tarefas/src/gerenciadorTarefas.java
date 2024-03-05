package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GerenciadorTarefas {

    private HashMap<String, List<Tarefa>> tarefas;

    public GerenciadorTarefas() {
        this.tarefas = new HashMap<String, List<Tarefa>>();
    }

    public Tarefa getTarefa(String usuario, String titulo) {
        List<Tarefa> tarefasUsuario = this.tarefas.get(usuario);

        if (tarefasUsuario == null) {
            return null;
        }
        
        for (Tarefa tarefa : tarefasUsuario) {
            if (tarefa.getTitulo().equals(titulo)) {
                return tarefa;
            }
        }
        return null;
    }

    public Boolean criarTarefa(String usuario, String titulo, String descricao, String dataVencimento, String prioridade) {
        if (getTarefa(usuario, titulo) != null) {
            return false;
        }

        List<Tarefa> tarefasUsuario = this.tarefas.get(usuario);
        if (tarefasUsuario == null) {
            tarefasUsuario = new ArrayList<Tarefa>();
            tarefas.put(usuario, tarefasUsuario);
        }

        Tarefa tarefa = new Tarefa(usuario, titulo, descricao, dataVencimento, prioridade);
        tarefasUsuario.add(tarefa);
        return true;
    }

    public Boolean atualizarTituloTarefa(String usuario, String titulo, String novoTitulo) {
        Tarefa tarefa = getTarefa(usuario, titulo);
        if (tarefa == null) {
            return false;
        }

        tarefa.setTitulo(novoTitulo);
        return true;
    }

    public Boolean atualizarDescricaoTarefa(String usuario, String titulo, String novaDescricao) {
        Tarefa tarefa = getTarefa(usuario, titulo);
        if (tarefa == null) {
            return false;
        }
        
        tarefa.setDescricao(novaDescricao);
        return true;
    }

    public Boolean atualizarDataVencimento(String usuario, String titulo, String novaDataVencimento) {
        Tarefa tarefa = getTarefa(usuario, titulo);
        if (tarefa == null) {
            return false;
        }

        tarefa.setDataVencimento(novaDataVencimento);
        return true;
    }

    public Boolean atualizarPrioridade(String usuario, String titulo, String novaPrioridade) {
        Tarefa tarefa = getTarefa(usuario, titulo);
        if (tarefa == null) {
            return false;
        }

        tarefa.setPrioridade(novaPrioridade);
        return true;
    }

    public Boolean excluirTarefa(String usuario, String titulo) {
        Tarefa tarefa = getTarefa(usuario, titulo);
        if (tarefa == null) {
            return false;
        }

        List<Tarefa> tarefasUsuario = this.tarefas.get(usuario);
        tarefasUsuario.remove(tarefa);
        return true;
    }
}
