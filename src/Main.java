import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====== SISTEMA BANCÁRIO ======");
        System.out.print("Entre com o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Entre com o rg: ");
        String rg = sc.nextLine();
        System.out.print("Entre com o cpf: ");
        String cpf = sc.nextLine();

        Pessoa titular = new Pessoa(cpf, nome, rg);   

        System.out.print("Entre com o número da conta: ");
        int numero = sc.nextInt();
        System.out.print("Entre com o saldo: ");
        Double saldo = sc.nextDouble();
        System.out.print("Entre com o limite da conta: ");
        Double limite = sc.nextDouble();
        Conta minhaConta = new Conta(titular, numero, saldo, limite);
        
        System.out.println("Cliente: " + titular.getNome() +
        "\nSaldo: " + minhaConta.getSaldo() + "\nLimite: " + 
        minhaConta.getLimite());
    }
}
