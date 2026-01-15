import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new FuncionarioCLT("Ana", "111.111.111-11", 3500));
        funcionarios.add(new FuncionarioPJ("Bruno", "222.222.222-22", 80, 160));

        for (Funcionario f : funcionarios) {
            f.exibirDados();
            System.out.println("Pagamento: R$ " + f.calcularPagamento());
            System.out.println("--------------------");
        }
    }
}
