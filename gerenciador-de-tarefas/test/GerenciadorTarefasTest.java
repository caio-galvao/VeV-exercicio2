package test;
import org.junit.*;

import src.Tarefa;
import src.gerenciadorTarefas;

public class GerenciadorTarefasTest {
    
    //testes da criação de tarefas
    @Test
    public void testCriarNovaTarefa() {
        String usuario = "usuario1";
        String titulo = "Tarefa 1";
        String descricao = "Tarefa de teste.";
        String dataVencimento = "01/03/2024";
        String prioridade = "média";
        Tarefa tarefa = gerenciadorTarefas.criarTarefa(usuario, titulo, descricao, dataVencimento, prioridade);
        Assert.assertNotNull(tarefa);
    }
}

