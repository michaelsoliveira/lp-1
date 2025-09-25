public class Presidente extends Funcionario {

    public Presidente(String cpf, String nome, String rg, double salario) {
        super(cpf, nome, rg, salario);
    }

    @Override
    public double getBonificacao() {
        return this.getSalario() * 0.2;
    }
}
