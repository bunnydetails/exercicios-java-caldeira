public class MinhasCompras {
    public static void main(String[] args) {
        ListaDeCompras listaDeCompras = new ListaDeCompras();

        listaDeCompras.adicionarItem("Kinder Ovo", 5, "6 meses");
        listaDeCompras.adicionarItem("Nescau Cereal", 3, "09/24");
        listaDeCompras.adicionarItem("Presunto", 1, "1 semana");
        listaDeCompras.adicionarItem("Petisco para cães", 1, "07/24");

        listaDeCompras.exibirListaDeCompras();

        listaDeCompras.alterarQuantidade();

        listaDeCompras.exibirListaDeCompras();

        listaDeCompras.excluirItem();

        listaDeCompras.exibirListaDeCompras();
    }
}
