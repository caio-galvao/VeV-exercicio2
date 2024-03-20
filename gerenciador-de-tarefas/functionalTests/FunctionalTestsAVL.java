package functionalTests;
import org.junit.*;

import src.GerenciadorTarefas;

public class FunctionalTestsAVL {

    GerenciadorTarefas gerenciadorTarefas = new GerenciadorTarefas();

    //testes criação de tarefas

    //testes atualizar título
    @Test
    public void testNovoTituloVazio() {
        String usuario = "usuario1";
        String titulo = "titulo1";
        String descricao = "teste";
        String dataVencimento = "20/03/2024";
        String prioridade = "MEDIA";
        gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);

        String novoTitulo = "";
        Boolean status = gerenciadorTarefas.atualizarTituloTarefa(usuario, titulo, novoTitulo);
        Assert.assertFalse(status);
    }

    @Test
    public void testNovoTitulo1Caractere() {
        String usuario = "usuario1";
        String titulo = "titulo1";
        String descricao = "teste";
        String dataVencimento = "20/03/2024";
        String prioridade = "MEDIA";
        gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);

        String novoTitulo = "t";
        Boolean status = gerenciadorTarefas.atualizarTituloTarefa(usuario, titulo, novoTitulo);
        Assert.assertTrue(status);
    }

    @Test
    public void testNovoTitulo2Caracteres() {
        String usuario = "usuario1";
        String titulo = "titulo1";
        String descricao = "teste";
        String dataVencimento = "20/03/2024";
        String prioridade = "MEDIA";
        gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);

        String novoTitulo = "tt";
        Boolean status = gerenciadorTarefas.atualizarTituloTarefa(usuario, titulo, novoTitulo);
        Assert.assertTrue(status);
    }

    @Test
    public void testNovoTituloVariosCaracteres() {
        String usuario = "usuario1";
        String titulo = "titulo1";
        String descricao = "teste";
        String dataVencimento = "20/03/2024";
        String prioridade = "MEDIA";
        gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);

        String novoTitulo = "título";
        Boolean status = gerenciadorTarefas.atualizarTituloTarefa(usuario, titulo, novoTitulo);
        Assert.assertTrue(status);
    }

    //testes atualizar descrição
    @Test
    public void testNovaDescricaoVazia() {
        String usuario = "usuario1";
        String titulo = "titulo1";
        String descricao = "teste";
        String dataVencimento = "20/03/2024";
        String prioridade = "MEDIA";
        gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);

        String novaDescriao = "";
        Boolean status = gerenciadorTarefas.atualizarDescricaoTarefa(usuario, titulo, novaDescriao);
        Assert.assertTrue(status);
    }

    @Test
    public void testNovaDescricao1Caractere() {
        String usuario = "usuario1";
        String titulo = "titulo1";
        String descricao = "teste";
        String dataVencimento = "20/03/2024";
        String prioridade = "MEDIA";
        gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);

        String novaDescriao = "d";
        Boolean status = gerenciadorTarefas.atualizarDescricaoTarefa(usuario, titulo, novaDescriao);
        Assert.assertTrue(status);
    }

    @Test
    public void testNovaDescricaoVariosCaracteres() {
        String usuario = "usuario1";
        String titulo = "titulo1";
        String descricao = "teste";
        String dataVencimento = "20/03/2024";
        String prioridade = "MEDIA";
        gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);

        String novaDescriao = "descrição";
        Boolean status = gerenciadorTarefas.atualizarDescricaoTarefa(usuario, titulo, novaDescriao);
        Assert.assertTrue(status);
    }

    //testes atualizar prioridade
    @Test
    public void testNovaPrioridadeMinima() {
        String usuario = "usuario1";
        String titulo = "titulo1";
        String descricao = "teste";
        String dataVencimento = "20/03/2024";
        String prioridade = "MEDIA";
        gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);

        String novaPrioridade = "BAIXA";
        Boolean status = gerenciadorTarefas.atualizarPrioridade(usuario, titulo, novaPrioridade);
        Assert.assertTrue(status);
    }

    @Test
    public void testNovaPrioridadeIntermediaria() {
        String usuario = "usuario1";
        String titulo = "titulo1";
        String descricao = "teste";
        String dataVencimento = "20/03/2024";
        String prioridade = "MEDIA";
        gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);

        String novaPrioridade = "MEDIA";
        Boolean status = gerenciadorTarefas.atualizarPrioridade(usuario, titulo, novaPrioridade);
        Assert.assertTrue(status);
    }

    @Test
    public void testNovaPrioridadeMaxima() {
        String usuario = "usuario1";
        String titulo = "titulo1";
        String descricao = "teste";
        String dataVencimento = "20/03/2024";
        String prioridade = "MEDIA";
        gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);

        String novaPrioridade = "ALTA";
        Boolean status = gerenciadorTarefas.atualizarPrioridade(usuario, titulo, novaPrioridade);
        Assert.assertTrue(status);
    }

    
}
