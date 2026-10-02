public class Caminhao extends Veiculo {

    private int quantidadeEixos;

    public Caminhao(String placa, double capacidadeCargaKg, int quantidadeEixos) {
        super(placa, capacidadeCargaKg);
        setQuantidadeEixos(quantidadeEixos);
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos) {
        if (quantidadeEixos < 2) {
            System.out.println("Um caminhão deve ter pelo menos 2 eixos.");
        }
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public String getTipo() {
        return "Caminhão";
    }
}