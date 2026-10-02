public class ProgramaPrincipal {

    public static void main(String[] args) {

        // 1) Entrega de caminhão
        Caminhao caminhao = new Caminhao("ABC1234", 500.0, 3);
        Pacote pacote1 = new Pacote("BR999", 10.5);
        Rota rotaCaminhao = new Rota(pacote1, caminhao);
        rotaCaminhao.realizarEntrega();

        // 2) A mesma Rota funcionando com moto, sem alterar a classe Rota
        Moto moto = new Moto("XYZ9876", 30.0, true);
        Pacote pacote2 = new Pacote("BR1000", 2.0);
        Rota rotaMoto = new Rota(pacote2, moto);
        rotaMoto.realizarEntrega();

        // 3) Dado inválido sendo barrado (antes era o -500.0)
        try {
            new Caminhao("DEF5678", -500.0, 3);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }
    }
}