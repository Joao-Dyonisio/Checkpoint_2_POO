public class Rota {

    private Pacote pacote;
    private Veiculo veiculo;

    public Rota(Pacote pacote, Veiculo veiculo) {
        if (pacote == null || veiculo == null) {
            System.out.println("Pacote e veículo são obrigatórios.");
        }
        if (pacote.getPesoKg() > veiculo.getCapacidadeCargaKg()) {
            System.out.println("O pacote excede a capacidade do veículo.");
        }
        this.pacote = pacote;
        this.veiculo = veiculo;
    }

    public Pacote getPacote() {
        return pacote;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void realizarEntrega() {
        System.out.println("Levando pacote " + pacote.getCodigo() + " no veículo " + veiculo.getPlaca()
                + " (" + veiculo.getTipo() + ")");
    }
}