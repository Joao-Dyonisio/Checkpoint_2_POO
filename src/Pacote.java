public class Pacote {

    private String codigo;
    private double pesoKg;

    public Pacote(String codigo, double pesoKg) {
        if (codigo == null || codigo.isBlank()) {
            System.out.println("O código do pacote não pode ser vazio.");
        }
        if (pesoKg <= 0) {
            System.out.println("O peso do pacote deve ser maior que zero.");
        }
        this.codigo = codigo;
        this.pesoKg = pesoKg;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPesoKg() {
        return pesoKg;
    }
}