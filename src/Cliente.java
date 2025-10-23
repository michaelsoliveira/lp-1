public class Cliente extends Pessoa { 
    private Endereco endereco;

    public Cliente(String cpf, String nome, String rg, String profissao, Endereco endereco) {
        super(cpf, nome, rg, profissao);
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }
}
