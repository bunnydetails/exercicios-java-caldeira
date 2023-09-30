public class MinhaLista {
    public static void main(String[] args) {
        Impressao listaDeImpressao = new Impressao();

        listaDeImpressao.adicionarDocumentoNaLista("Receitas", 13);
        listaDeImpressao.adicionarDocumentoNaLista("Exercícios de biologia", 25);
        listaDeImpressao.adicionarDocumentoNaLista("Resumo de linguagem: Python", 15);
        listaDeImpressao.adicionarDocumentoNaLista("Java: Introdução", 30);

        System.out.println(" ");

        listaDeImpressao.listarDocumentos();

        System.out.println(" ");

        listaDeImpressao.alterarNumeroDePaginas();

        System.out.println(" ");

        listaDeImpressao.excluirDocumento();

        System.out.println(" ");

        listaDeImpressao.listarDocumentos();

        System.out.println(" ");

        listaDeImpressao.imprimirLista();

        System.out.println(" ");

        listaDeImpressao.listarDocumentos();

        System.out.println(" ");

        listaDeImpressao.adicionarDocumentoNaLista("Fotos de infância", 7);
        listaDeImpressao.adicionarDocumentoNaLista("Mass Effect 2: Walkthrough", 50);

        System.out.println(" ");

        listaDeImpressao.listarDocumentos();

        System.out.println(" ");

        listaDeImpressao.esvaziarLista();

        System.out.println(" ");

        listaDeImpressao.listarDocumentos();
    }
}
