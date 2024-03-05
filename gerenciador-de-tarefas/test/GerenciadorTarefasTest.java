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
    public void testCriarTarefa2Usuarios() {
        String usuario1 = "usuario1";
        String titulo1 = "Tarefa 1";
        String descricao1 = "Tarefa de teste.";
        String dataVencimento1 = "01/03/2024";
        String prioridade1 = "média";
        gerenciadorTarefas.criarTarefa(usuario1, titulo1, descricao1, dataVencimento1, prioridade1);

        String usuario2 = "usuario2";
        String titulo2 = "Tarefa 1";
        String descricao2 = ".";
        String dataVencimento2 = "05/03/2024";
        String prioridade2 = "alta";
        Boolean status2 = gerenciadorTarefas.criarTarefa(usuario2, titulo2, descricao2, dataVencimento2, prioridade2);
        Assert.assertTrue(status2);
        Tarefa tarefa2 = gerenciadorTarefas.getTarefa(usuario2, titulo2);
        Assert.assertNotNull(tarefa2);
    }

    @Test
    public void testCriarTarefaJaCriada() {
        String usuario = "usuario1";
        String titulo = "Tarefa 1";
        String descricao = "Tarefa de teste.";
        String dataVencimento = "01/03/2024";
        String prioridade = "média";
        gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);
        
        String novoUsuario = "usuario1";
        String novoTitulo = "Tarefa 1";
        String novaDescricao = "testando...";
        String novaDataVencimento = "10/03/2024";
        String novaPrioridade = "alta";
        Boolean status = gerenciadorTarefas.criarTarefa(novoUsuario, novoTitulo, novaDescricao, novaDataVencimento, novaPrioridade);
        Assert.assertFalse(status);
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
    public void testAtualizacaoDataVencimentoTarefaNaoCriada() {
        Boolean status = gerenciadorTarefas.atualizarDataVencimento( "usuario1", "Tarefa 1", "03/03/2024");
        Assert.assertFalse(status);
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

    @Test
    public void testAtualizacaoPrioridadeTarefaNaoCriada() {
        Boolean status = gerenciadorTarefas.atualizarPrioridade("usuario1", "Tarefa 1", "alta");
        Assert.assertFalse(status);
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

    @Test
    public void testPrioridadeBaixa1() {
        String usuario = "usuario1";
        String titulo = "Tarefa 1";
        String descricao = "Tarefa de teste.";
        String dataVencimento = "01/03/2024";
        String prioridade = "baixa";
        Boolean status = gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);
        Assert.assertTrue(status);
        Tarefa tarefa = gerenciadorTarefas.getTarefa(usuario, titulo);
        Assert.assertEquals(tarefa.getPrioridade(), prioridade);
    }

    @Test
    public void testPrioridadeMedia1() {
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

    @Test
    public void testPrioridadeAlta1() {
        String usuario = "usuario1";
        String titulo = "Tarefa 1";
        String descricao = "Tarefa de teste.";
        String dataVencimento = "01/03/2024";
        String prioridade = "alta";
        Boolean status = gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);
        Assert.assertTrue(status);
        Tarefa tarefa = gerenciadorTarefas.getTarefa(usuario, titulo);
        Assert.assertEquals(tarefa.getPrioridade(), prioridade);
    }

    @Test
    public void testPrioridadeErrada1() {
        String usuario = "usuario1";
        String titulo = "Tarefa 1";
        String descricao = "Tarefa de teste.";
        String dataVencimento = "01/03/2024";
        String prioridade = "muito alta";
        Boolean status = gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);
        Assert.assertFalse(status);
        Tarefa tarefa = gerenciadorTarefas.getTarefa(usuario, titulo);
        Assert.assertNull(tarefa);
    }
}