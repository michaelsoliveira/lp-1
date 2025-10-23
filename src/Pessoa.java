public abstract class Pessoa {
    private String nome;
    private String rg;
    private String cpf;
    private String profissao;

    public Pessoa(String cpf, String nome, String rg, String profissao) {
        this.cpf = cpf;
        this.nome = nome;
        this.rg = rg;
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
