package test;
import org.junit.*;

import src.Tarefa;
import src.GerenciadorTarefas;

public class GerenciadorTarefasTest {
    
    //testes da criação de tarefas
    @Test
    public void testCriarNovaTarefa() {
        String usuario = "usuario1";
        String titulo = "Tarefa 1";
        String descricao = "Tarefa de teste.";
        String dataVencimento = "01/03/2024";
        String prioridade = "média";
        Tarefa tarefa = GerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);
        Assert.assertNotNull(tarefa);
    }

    @Test
    public void testAtributoUsuario() {
        String usuario = "usuario1";
        String titulo = "Tarefa 1";
        String descricao = "Tarefa de teste.";
        String dataVencimento = "01/03/2024";
        String prioridade = "média";
        Tarefa tarefa = GerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);
        Assert.assertEquals(tarefa.getUsuario(), usuario);
    }

    @Test
    public void testAtributoTitulo() {
        String usuario = "usuario1";
        String titulo = "Tarefa 1";
        String descricao = "Tarefa de teste.";
        String dataVencimento = "01/03/2024";
        String prioridade = "média";
        Tarefa tarefa = GerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);
        Assert.assertEquals(tarefa.getTitulo(), titulo);
    }

    @Test
    public void testAtributoDescricao() {
        String usuario = "usuario1";
        String titulo = "Tarefa 1";
        String descricao = "Tarefa de teste.";
        String dataVencimento = "01/03/2024";
        String prioridade = "média";
        Tarefa tarefa = GerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);
        Assert.assertEquals(tarefa.getDescricao(), descricao);
    }

    @Test
    public void testAtributoDataVencimento() {
        String usuario = "usuario1";
        String titulo = "Tarefa 1";
        String descricao = "Tarefa de teste.";
        String dataVencimento = "01/03/2024";
        String prioridade = "média";
        Tarefa tarefa = GerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);
        Assert.assertEquals(tarefa.getDataVencimento(), dataVencimento);
    }

    @Test
    public void testAtributoPrioridade() {
        String usuario = "usuario1";
        String titulo = "Tarefa 1";
        String descricao = "Tarefa de teste.";
        String dataVencimento = "01/03/2024";
        String prioridade = "média";
        Tarefa tarefa = GerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);
        Assert.assertEquals(tarefa.getPrioridade(), prioridade);
    }
}

