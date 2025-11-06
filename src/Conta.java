public class Conta implements OperacoesBancarias {
    private int numero;
    private double saldo;
    private double limite;
    private Cliente titular;

    public Conta(Cliente titular, int numero, double saldo, double limite){
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public Double getLimite() {
        return this.limite;
    }

    public void setLimite(double valor) {
        this.limite = valor;
    }

    public boolean transferir(Conta destino, double valor) {
        if (this.saldo + this.limite >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso!");
            return true;
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência.");
            return false;
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }   
}
