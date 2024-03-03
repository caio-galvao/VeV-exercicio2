package test;
import org.junit.*;

import src.Tarefa;
import src.GerenciadorTarefas;

public class GerenciadorTarefasTest {

    GerenciadorTarefas gerenciadorTarefas = new GerenciadorTarefas();
    
    //testes da criação de tarefas
    @Test
    public void testCriarNovaTarefa() {
        String usuario = "usuario1";
        String titulo = "Tarefa 1";
        String descricao = "Tarefa de teste.";
        String dataVencimento = "01/03/2024";
        String prioridade = "média";
        Boolean status = gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);
        Assert.assertTrue(status);
        Tarefa tarefa = gerenciadorTarefas.getTarefa(usuario, titulo);
        Assert.assertNotNull(tarefa);
    }

    @Test
    public void testAtributoUsuario() {
        String usuario = "usuario1";
        String titulo = "Tarefa 1";
        String descricao = "Tarefa de teste.";
        String dataVencimento = "01/03/2024";
        String prioridade = "média";
        Boolean status = gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);
        Assert.assertTrue(status);
        Tarefa tarefa = gerenciadorTarefas.getTarefa(usuario, titulo);
        Assert.assertEquals(tarefa.getUsuario(), usuario);
    }

    @Test
    public void testAtributoTitulo() {
        String usuario = "usuario1";
        String titulo = "Tarefa 1";
        String descricao = "Tarefa de teste.";
        String dataVencimento = "01/03/2024";
        String prioridade = "média";
        Boolean status = gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);
        Assert.assertTrue(status);
        Tarefa tarefa = gerenciadorTarefas.getTarefa(usuario, titulo);
        Assert.assertEquals(tarefa.getTitulo(), titulo);
    }

    @Test
    public void testAtributoDescricao() {
        String usuario = "usuario1";
        String titulo = "Tarefa 1";
        String descricao = "Tarefa de teste.";
        String dataVencimento = "01/03/2024";
        String prioridade = "média";
        Boolean status = gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);
        Assert.assertTrue(status);
        Tarefa tarefa = gerenciadorTarefas.getTarefa(usuario, titulo);
        Assert.assertEquals(tarefa.getDescricao(), descricao);
    }

    @Test
    public void testAtributoDataVencimento() {
        String usuario = "usuario1";
        String titulo = "Tarefa 1";
        String descricao = "Tarefa de teste.";
        String dataVencimento = "01/03/2024";
        String prioridade = "média";
        Boolean status = gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);
        Assert.assertTrue(status);
        Tarefa tarefa = gerenciadorTarefas.getTarefa(usuario, titulo);
        Assert.assertEquals(tarefa.getDataVencimento(), dataVencimento);
    }

    @Test
    public void testAtributoPrioridade() {
        String usuario = "usuario1";
        String titulo = "Tarefa 1";
        String descricao = "Tarefa de teste.";
        String dataVencimento = "01/03/2024";
        String prioridade = "média";
        Boolean status = gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);
        Assert.assertTrue(status);
        Tarefa tarefa = gerenciadorTarefas.getTarefa(usuario, titulo);
        Assert.assertEquals(tarefa.getPrioridade(), prioridade);
    }

    //testes atualização de tarefas
    @Test
    public void testAtualizacaoTitulo() {
        String usuario = "usuario1";
        String titulo = "Tarefa 1";
        String descricao = "Tarefa de teste.";
        String dataVencimento = "01/03/2024";
        String prioridade = "média";
        gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);
        
        String novoTitulo = "1";
        Boolean status = gerenciadorTarefas.atualizarTituloTarefa(usuario, titulo, novoTitulo);
        Assert.assertTrue(status);
        Tarefa tarefa = gerenciadorTarefas.getTarefa(usuario, novoTitulo);
        Assert.assertEquals(tarefa.getTitulo(), novoTitulo);
    }

    @Test
    public void testAtualizacaoTituloTarefaNaoCriada() {        
        Boolean status = gerenciadorTarefas.atualizarTituloTarefa("usuario1", "Tarefa 1", "1");
        Assert.assertFalse(status);
    }

    @Test
    public void testAtualizacaoDescricao() {
        String usuario = "usuario1";
        String titulo = "Tarefa 1";
        String descricao = "Tarefa de teste.";
        String dataVencimento = "01/03/2024";
        String prioridade = "média";
        gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);
        
        String novaDescricao = "Testando";
        Boolean status = gerenciadorTarefas.atualizarDescricaoTarefa(usuario, titulo, novaDescricao);
        Assert.assertTrue(status);
        Tarefa tarefa = gerenciadorTarefas.getTarefa(usuario, titulo);
        Assert.assertEquals(tarefa.getDescricao(), novaDescricao);
    }

    @Test
    public void testAtualizacaoDescricaoTarefaNaoCriada() {        
        String novaDescricao = "Testando";
        Boolean status = gerenciadorTarefas.atualizarDescricaoTarefa("usuario1", "Tarefa 1", "Testando");
        Assert.assertFalse(status);
    }

    @Test
    public void testAtualizacaoDataVencimento() {
        String usuario = "usuario1";
        String titulo = "Tarefa 1";
        String descricao = "Tarefa de teste.";
        String dataVencimento = "01/03/2024";
        String prioridade = "média";
        gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);
        
        String novaDataVencimento = "03/03/2024";
        Boolean status = gerenciadorTarefas.atualizarDataVencimento(usuario, titulo, novaDataVencimento);
        Assert.assertTrue(status);
        Tarefa tarefa = gerenciadorTarefas.getTarefa(usuario, titulo);
        Assert.assertEquals(tarefa.getDataVencimento(), novaDataVencimento);
    }

    @Test
    public void testAtualizacaoPrioridade() {
        String usuario = "usuario1";
        String titulo = "Tarefa 1";
        String descricao = "Tarefa de teste.";
        String dataVencimento = "01/03/2024";
        String prioridade = "média";
        gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);
        
        String novaPrioridade = "alta";
        Boolean status = gerenciadorTarefas.atualizarPrioridade(usuario, titulo, novaPrioridade);
        Assert.assertTrue(status);
        Tarefa tarefa = gerenciadorTarefas.getTarefa(usuario, titulo);
        Assert.assertEquals(tarefa.getPrioridade(), novaPrioridade);
    }

    //testes exclusão tarefas
    @Test
    public void testExclusao() {
        String usuario = "usuario1";
        String titulo = "Tarefa 1";
        String descricao = "Tarefa de teste.";
        String dataVencimento = "01/03/2024";
        String prioridade = "média";
        gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);

        Boolean status = gerenciadorTarefas.excluirTarefa(usuario, titulo);
        Assert.assertTrue(status);
        Tarefa tarefaExcluida = gerenciadorTarefas.getTarefa(usuario, titulo);
        Assert.assertNull(tarefaExcluida);
    }

    @Test
    public void testExclusaoTarefaNaoCriada() {
        Boolean status = gerenciadorTarefas.excluirTarefa("usuario1", "Tarefa 1");
        Assert.assertFalse(status);
    }
}