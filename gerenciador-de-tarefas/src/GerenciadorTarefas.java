package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GerenciadorTarefas {

    private HashMap<String, List<Tarefa>> tarefas;

    /* Sugestão: usar "enumerator" para prioridades, para evitar o uso de strings diretamente. Isso evita erros
     de digitação e facilita a manutenção do código.
     * Arthur - revisão 06/03/2024*/
    private List<String> prioridades;

    public GerenciadorTarefas() {
        this.tarefas = new HashMap<String, List<Tarefa>>();
        this.prioridades = new ArrayList<String>();
        this.prioridades.add("baixa");
        this.prioridades.add("média");
        this.prioridades.add("alta");
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

        if (!prioridades.contains(prioridade)) {
            return false;
        }
        /* Sugestão: usar o método computeIfAbsent (método do HashMap) para simplificar a lógica.
        * Arthur - revisão 06/03/2024*/

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

        if (!prioridades.contains(novaPrioridade)) {
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
