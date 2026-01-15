public abstract class Funcionario {
    private String nome;
    private String documento;

    public Funcionario(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public abstract double calcularPagamento();

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Documento: " + documento);
    }
}
