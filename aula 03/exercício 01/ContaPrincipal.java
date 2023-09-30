public class ContaPrincipal {

    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("Fulano De Tal", "619.780.799-07", "71690",
                "Banco Super Confiável", "Fim do Mundo, 000");

        minhaConta.verificarInformacoes();
        minhaConta.deduzirTaxaManutencaoMensal();
        minhaConta.deposito(500.0);
        minhaConta.saque(200.0);
        minhaConta.pix(300.0);

        ContaBancaria outraConta = new ContaBancaria("Aquele Cara Lá", "013.432.921-22", "00567",
                "Outro Banco Confiável (Confia)", "Quinto dos Infernos, 666");

        minhaConta.transferencia(outraConta, 400.0);
        minhaConta.verificarInformacoes();

        outraConta.verificarInformacoes();
        outraConta.deduzirTaxaManutencaoMensal();

        minhaConta.alterarEndereco("Rua Acabou Minha Criatividade, 69");
        minhaConta.calcularJuros(1.5);

        minhaConta.verificarSaldo();
        minhaConta.exibirHistoricoTransacoes();

        minhaConta.encerrarConta();
        outraConta.encerrarConta();
    }
}
