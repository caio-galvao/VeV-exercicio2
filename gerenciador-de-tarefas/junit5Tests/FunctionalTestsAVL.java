package junit5Tests;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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
        assertFalse(status);
    }

    @ParameterizedTest
    @ValueSource(strings = { "t", "tt", "título" })
    void testNovoTituloCorreto(String novoTitulo) {
        String usuario = "usuario1";
        String titulo = "titulo1";
        String descricao = "teste";
        String dataVencimento = "20/03/2024";
        String prioridade = "MEDIA";
        gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);

        Boolean status = gerenciadorTarefas.atualizarTituloTarefa(usuario, titulo, novoTitulo);
        assertTrue(status);
    }

    //testes atualizar descrição
    @ParameterizedTest
    @ValueSource(strings = { "", "d", "descrição" })
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

    //testes atualizar prioridade
    @ParameterizedTest
    @ValueSource(strings = { "BAIXA", "MEDIA", "ALTA" })
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
}
