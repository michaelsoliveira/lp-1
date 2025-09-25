public class Cliente extends Pessoa {
    private String profissao;
    private Endereco endereco;

    public Cliente(String cpf, String nome, String rg, String profissao, Endereco endereco) {
        super(cpf, nome, rg);
        this.profissao = profissao;
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
}
