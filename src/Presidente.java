public class Presidente extends Funcionario {

    public Presidente(String cpf, String nome, String rg, double salario, String profissao) {
        super(cpf, nome, rg, salario, profissao);
    }

    @Override
    public double getBonificacao() {
        return this.getSalario() * 0.2;
    }
}
