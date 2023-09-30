public class MinhasTarefas {
    public static void main(String[] args) {
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();

        listaDeTarefas.adicionarTarefa("Fazer tarefas do Caldeira;", "30/09;", "Fazer os exercícios restantes.");

        listaDeTarefas.adicionarTarefa("Fazer tarefas domésticas;", "01/09;", "Terminar minhas responsabilidades em casa.");

        listaDeTarefas.adicionarTarefa("Ir para o Caldeira;", "03/10;", "Comparecer na aula e fazer os exercícios.");

        listaDeTarefas.listarTarefas();

        listaDeTarefas.excluirTarefa();

        listaDeTarefas.listarTarefas();

    }
}

