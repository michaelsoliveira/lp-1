public abstract class Funcionario extends Pessoa {
    private double salario;
    
    public Funcionario(String cpf, String nome, String rg, double salario, String profissao) {
        super(cpf, nome, rg, profissao);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double getBonificacao();

}
