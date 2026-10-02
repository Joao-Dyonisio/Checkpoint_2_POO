public class Moto extends Veiculo {

    private boolean possuiBau;

    public Moto(String placa, double capacidadeCargaKg, boolean possuiBau) {
        super(placa, capacidadeCargaKg);
        this.possuiBau = possuiBau;
    }

    public boolean isPossuiBau() {
        return possuiBau;
    }

    public void setPossuiBau(boolean possuiBau) {
        this.possuiBau = possuiBau;
    }

    @Override
    public String getTipo() {
        return "Moto";
    }
}
