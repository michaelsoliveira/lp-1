
import java.util.Scanner;


class MeuPrimeiroPrograma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua nota da AV1 (0 a 10): ");
        double av1 = sc.nextDouble();
        System.out.print("Digite sua nota da AV2 (0 a 10): ");
        double av2 = sc.nextDouble();
        double media = (av1 + av2)/2;
        int mediaInt = (int) media;

        switch(mediaInt) {
            case 7,8,9,10 -> System.out.println("Aprovado!");
            case 0,1,2,3,4,5,6 -> System.out.println("Reprovado!");
            default -> System.out.println("Vai Estudar!");
        }

        sc.close();
    }

    public static double media(double av1, double av2) {
        return (av1 + av2)/2;
    }
}