public class Gerente extends Funcionario implements Autenticavel {
    private int senha;
    public Gerente(String cpf, String nome, String rg, double salario, String profissao) {
        super(cpf, nome, rg, salario, profissao);
    }

    @Override
    public double getBonificacao() {
        return this.getSalario() * 0.15;
    }

    @Override
    public boolean autentica(int senha) {
        if (this.senha != senha) {
            return false;
        }

        return true;
    }
}
