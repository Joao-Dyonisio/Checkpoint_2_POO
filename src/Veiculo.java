public abstract class Veiculo {

    private String placa;
    private double capacidadeCargaKg;

    protected Veiculo(String placa, double capacidadeCargaKg) {
        setPlaca(placa);
        setCapacidadeCargaKg(capacidadeCargaKg);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa == null || placa.isBlank()) {
            System.out.println("A placa não pode ser vazia.");
        }
        this.placa = placa;
    }

    public double getCapacidadeCargaKg() {
        return capacidadeCargaKg;
    }

    public void setCapacidadeCargaKg(double capacidadeCargaKg) {
        if (capacidadeCargaKg <= 0) {
            System.out.println("A capacidade de carga deve ser maior que zero.");
        }
        this.capacidadeCargaKg = capacidadeCargaKg;
    }
    public abstract String getTipo();
}