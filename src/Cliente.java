public class Cliente extends Pessoa {
    private String profissao;

    public Cliente(String cpf, String nome, String rg, String profissao) {
        super(cpf, nome, rg);
        this.profissao = profissao;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
}
