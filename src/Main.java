import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<Funcionario> funcionarios = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = -1;
        do { 
            System.out.println("\n======= MENU BANCO ========");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Funcionário");
            System.out.println("3 - Listar Clientes");
            System.out.println("4 - Listar Funcionários");

            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1: 
                    cadastrarCliente();
                    break;
                case 2:
                    cadastrarFuncionario();
                    break;
                case 3:
                    listarClientes();
                    break;
                case 4: {
                    listarFuncionarios();
                    break;
                }
                default:
                    System.out.println("Opção Inválida");
            }
        } while (opcao != 0);
    }

    public static void cadastrarFuncionario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("====== CADASTRO DO GERENTE ======");
        System.out.print("Entre com o nome: ");
        String nome = sc.nextLine();
        System.out.print("Entre com o rg: ");
        String rg = sc.nextLine();
        System.out.print("Entre com o cpf: ");
        String cpf = sc.nextLine();
        System.out.print("Entre com a profissão: ");
        String profissao = sc.nextLine();
        System.out.print("Entre com o salário: ");
        double salario = sc.nextDouble();
        Funcionario funcionario = new Gerente(cpf, nome, rg, salario, profissao);
        funcionarios.add(funcionario);
        System.out.println("Funcionário + " + funcionario.getNome() +
        " cadastrado com sucesso!");
    }

    public static void listarClientes() {
        System.out.println("====== LISTA DE CLIENTES ======");
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            int i = 1;
            for (Cliente cliente : clientes) {
                System.out.println(i + " - " + cliente.getNome() +
                    " | CPF: " + cliente.getCpf() +
                    " | Profissão: " + cliente.getProfissao());
            }
        }
    }

    public static void listarFuncionarios() {
        System.out.println("====== LISTA DE FUNCIONÁRIOS ======");
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            int i = 1;
            for (Funcionario funcionario : funcionarios) {
                System.out.println(i + " - " + funcionario.getNome() +
                    " | CPF: " + funcionario.getCpf() +
                    " | Profissão: " + funcionario.getProfissao() +
                    " | Salário: " + funcionario.getSalario() +
                    " | Tipo: " + funcionario.getClass().getName());
            }
        }
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
        System.out.println("===== Entre com o seu Endereço ===== ");
        System.out.print("Logradouro: ");
        String logradouro = sc.nextLine();
        System.out.print("Bairro: ");
        String bairro = sc.nextLine();
        System.out.print("Cidade: ");
        String cidade = sc.nextLine();
        System.out.print("Estado: ");
        String estado = sc.nextLine();
        System.out.print("CEP: ");
        String cep = sc.nextLine();

        Endereco endereco = new Endereco(logradouro, logradouro, bairro, cidade, estado, cep);

        Cliente titular = new Cliente(cpf, nome, rg, profissao, endereco);   
        clientes.add(titular);

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
