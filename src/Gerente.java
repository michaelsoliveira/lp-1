public class Gerente extends Funcionario {

    public Gerente(String cpf, String nome, String rg, double salario, String profissao) {
        super(cpf, nome, rg, salario, profissao);
    }

    @Override
    public double getBonificacao() {
        return this.getSalario() * 0.15;
    }
}
