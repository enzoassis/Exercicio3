import java.util.Scanner;

public class exercicio3 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scan.nextInt();

        System.out.println("Digite outro número: ");
        int numero2 = scan.nextInt();

        System.out.println("A soma dos números foi " + (numero + numero2));
        scan.close();
    }
}
