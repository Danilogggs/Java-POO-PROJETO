public class FuncionarioPJ extends Funcionario {
    private double valorHora;
    private int horasTrabalhadas;

    public FuncionarioPJ(String nome, String documento, double valorHora, int horasTrabalhadas) {
        super(nome, documento);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularPagamento() {
        return valorHora * horasTrabalhadas;
    }
}
