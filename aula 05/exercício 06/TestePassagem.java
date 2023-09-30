public class TestePassagem {
    public static void main(String[] args) {
        ListaDeReservas listaDeReservas = new ListaDeReservas();

        listaDeReservas.reservarPassagem("Leon;", "75089043179;", "Londres, Inglaterra.", 2);

        System.out.println(" ");

        listaDeReservas.reservarPassagem("Suzuki;", "69004057621", "Tóquio, Japão.", 2);

        System.out.println(" ");

        listaDeReservas.reservarPassagem("Alice;", "60053575067;", "Tromsø, Noruega.", 2);

        System.out.println(" ");

        listaDeReservas.reservarPassagem("Min-ho;", "07012938990;", "Seoul, Coreia do Sul.", 2);

        System.out.println(" ");

        listaDeReservas.listarReservas();

        System.out.println(" ");

        listaDeReservas.alterarDataDeReserva("60053575067");

        System.out.println(" ");

        listaDeReservas.alterarLocalDaPassagem("60053575067");

        System.out.println(" ");

        listaDeReservas.alterarQuantidadeDePassagem("60053575067");

        System.out.println(" ");

        listaDeReservas.listarReservas();

        System.out.println(" ");

        listaDeReservas.cancelarReserva("60053575067");



    }
}