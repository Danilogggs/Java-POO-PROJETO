public class FuncionarioCLT extends Funcionario {
    private double salarioMensal;

    public FuncionarioCLT(String nome, String documento, double salarioMensal) {
        super(nome, documento);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularPagamento() {
        return salarioMensal;
    }
}
