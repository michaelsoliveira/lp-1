import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = -1;
        do { 
            System.out.println("\n======= MENU BANCO ========");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Funcionário");
            System.out.println("3 - Listar Clientes");
            System.out.println("4 - Listar Funcionários");

            switch(opcao) {
                case 1: 
                    cadastrarCliente();
                    break;
                case 2:
                    cadastrarFuncionario();
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        } while (opcao != 0);
    }

    public static void cadastrarCliente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("====== SISTEMA BANCÁRIO ======");
        System.out.print("Entre com o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Entre com o rg: ");
        String rg = sc.nextLine();
        System.out.print("Entre com o cpf: ");
        String cpf = sc.nextLine();
        System.out.print("Entre com sua profissão: ");
        String profissao = sc.nextLine();


        Cliente titular = new Cliente(cpf, nome, rg, profissao);   

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
