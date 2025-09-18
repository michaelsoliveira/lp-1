public class Gerente extends Funcionario {

    public Gerente(String cpf, String nome, String rg, double salario) {
        super(cpf, nome, rg, salario);
    }

    @Override
    public double getBonificacao() {
        return this.getSalario() * 0.15;
    }
}
