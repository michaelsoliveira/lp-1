public class Funcionario extends Pessoa {
    private double salario;
    
    public Funcionario(String cpf, String nome, String rg, double salario) {
        super(cpf, nome, rg);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonificacao() {
        return this.salario * 0.10;
    }

}
