
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int controle1 = 1, controle2 = 1;
        double media, nota1 = 0, nota2 = 0;

        for (int i = 0; i < controle1; i++) {
            nota1 = leia.nextDouble();
            if (nota1 < 0 || nota1 > 10) {
                System.out.println("nota invalida");
                nota1 = 0;
                controle1++;
            } else {
                controle1 = 0;
            }
        }
        for (int j = 0; j < controle2; j++) {
            nota2 = leia.nextDouble();
            if (nota2 < 0 || nota2 > 10) {
                System.out.println("nota invalida");
                nota2 = 0;
                controle2++;
            } else {
                controle2 = 0;
            }
        }
        media = (nota1 + nota2) / 2;
        System.out.printf("media = %.2f\n", media);
    }
}
