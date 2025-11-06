public interface OperacoesBancarias {
    void sacar(double valor);
    void depositar(double valor);
    boolean transferir(Conta destino, double valor);
}
