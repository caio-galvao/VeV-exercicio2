package junit5Tests;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import src.GerenciadorTarefas;

public class FunctionalTestsParticoesEquivalencia {
    
    GerenciadorTarefas gerenciadorTarefas = new GerenciadorTarefas();

    //testes atualizar título
    @Test
    public void testAtualizarTituloDadosValidos() {
        String usuario = "usuario1";
        String titulo = "titulo1";
        String descricao = "teste";
        String dataVencimento = "20/03/2024";
        String prioridade = "MEDIA";
        gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);

        String novoTitulo = "novo título";
        Boolean status = gerenciadorTarefas.atualizarTituloTarefa(usuario, titulo, novoTitulo);
        assertTrue(status);
    }

    @Test
    public void testAtualizarTituloUsuarioInexistente() {
        String usuario = "usuario0";
        String titulo = "titulo1";
        String novoTitulo = "novo título";
        Boolean status = gerenciadorTarefas.atualizarTituloTarefa(usuario, titulo, novoTitulo);
        assertFalse(status);
    }

    @Test
    public void testAtualizarTituloInexistente() {
        String usuario = "usuario1";
        String titulo = "titulo1";
        String descricao = "teste";
        String dataVencimento = "20/03/2024";
        String prioridade = "MEDIA";
        gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);

        titulo = "titulo0";
        String novoTitulo = "novo título";
        Boolean status = gerenciadorTarefas.atualizarTituloTarefa(usuario, titulo, novoTitulo);
        assertFalse(status);
    }

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
        assertFalse(status);
    }

    @Test
    public void testNovoTituloJaExistente() {
        String usuario = "usuario1";
        String titulo = "titulo1";
        String descricao = "teste";
        String dataVencimento = "20/03/2024";
        String prioridade = "MEDIA";
        gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);

        String titulo2 = "titulo2";
        String descricao2 = "teste";
        String dataVencimento2 = "20/03/2024";
        String prioridade2 = "MEDIA";
        gerenciadorTarefas.criarTarefa(usuario, titulo2, descricao2, dataVencimento2, prioridade2);

        String novoTitulo = "titulo2";
        Boolean status = gerenciadorTarefas.atualizarTituloTarefa(usuario, titulo, novoTitulo);
        assertFalse(status);
    }

    //testes atualizar descrição
    @ParameterizedTest
    @ValueSource(strings = { "", "descrição" })
    public void testNovaDescricaoCorreta(String novaDescricao) {
        String usuario = "usuario1";
        String titulo = "titulo1";
        String descricao = "teste";
        String dataVencimento = "20/03/2024";
        String prioridade = "MEDIA";
        gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);

        Boolean status = gerenciadorTarefas.atualizarDescricaoTarefa(usuario, titulo, novaDescricao);
        assertTrue(status);
    }

    @Test
    public void testAtualizarDescricaoUsuarioInexistente() {
        String usuario = "usuario0";
        String titulo = "titulo1";
        String novaDescriao = "descrição";
        Boolean status = gerenciadorTarefas.atualizarDescricaoTarefa(usuario, titulo, novaDescriao);
        assertFalse(status);
    }

    @Test
    public void testAtualizarDescricaoTituloInexistente() {
        String usuario = "usuario1";
        String titulo = "titulo1";
        String descricao = "teste";
        String dataVencimento = "20/03/2024";
        String prioridade = "MEDIA";
        gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);

        titulo = "titulo0";
        String novaDescriao = "descrição";
        Boolean status = gerenciadorTarefas.atualizarDescricaoTarefa(usuario, titulo, novaDescriao);
        assertFalse(status);
    }

    //testes atualizar prioridade

    @ParameterizedTest
    @ValueSource(strings = { "ALTA", "MEDIA", "BAIXA" })
    public void testNovaPrioridadeCorreta(String novaPrioridade) {
        String usuario = "usuario1";
        String titulo = "titulo1";
        String descricao = "teste";
        String dataVencimento = "20/03/2024";
        String prioridade = "MEDIA";
        gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);

        Boolean status = gerenciadorTarefas.atualizarPrioridade(usuario, titulo, novaPrioridade);
        assertTrue(status);
    }

    @Test
    public void testNovaPrioridadeInvalida() {
        String usuario = "usuario1";
        String titulo = "titulo1";
        String descricao = "teste";
        String dataVencimento = "20/03/2024";
        String prioridade = "MEDIA";
        gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);

        String novaPrioridade = "MUITO ALTA";
        Boolean status = gerenciadorTarefas.atualizarPrioridade(usuario, titulo, novaPrioridade);
        assertFalse(status);
    }

    @Test
    public void testAtualizarPrioridadeUsuarioInexistente() {
        String usuario = "usuario0";
        String titulo = "titulo1";
        String novaPrioridade = "MEDIA";
        Boolean status = gerenciadorTarefas.atualizarPrioridade(usuario, titulo, novaPrioridade);
        assertFalse(status);
    }

    @Test
    public void testAtualizarPrioridadeTituloInexistente() {
        String usuario = "usuario1";
        String titulo = "titulo1";
        String descricao = "teste";
        String dataVencimento = "20/03/2024";
        String prioridade = "MEDIA";
        gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);

        titulo = "titulo0";
        String novaPrioridade = "MEDIA";
        Boolean status = gerenciadorTarefas.atualizarPrioridade(usuario, titulo, novaPrioridade);
        assertFalse(status);
    }

    //testes excluir atividade
    @Test
    public void testExcluirDadosValidos() {
        String usuario = "usuario1";
        String titulo = "titulo1";
        String descricao = "teste";
        String dataVencimento = "20/03/2024";
        String prioridade = "MEDIA";
        gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);

        Boolean status = gerenciadorTarefas.excluirTarefa(usuario, titulo);
        assertTrue(status);
    }

    @Test
    public void testExcluirUsuarioInexistente() {
        String usuario = "usuario0";
        String titulo = "titulo1";
        Boolean status = gerenciadorTarefas.excluirTarefa(usuario, titulo);
        assertFalse(status);
    }

    @Test
    public void testExcluirTituloInexistente() {
        String usuario = "usuario1";
        String titulo = "titulo1";
        String descricao = "teste";
        String dataVencimento = "20/03/2024";
        String prioridade = "MEDIA";
        gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);

        titulo = "titulo0";
        Boolean status = gerenciadorTarefas.excluirTarefa(usuario, titulo);
        assertFalse(status);
    }

}
