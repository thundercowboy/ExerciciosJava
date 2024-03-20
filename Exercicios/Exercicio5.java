
// Fazer um programa para ler o código de uma peça 1, 
// o número de peças 1, o valor unitário de cada peça 1, o 
// código de uma peça 2, o número de peças 2 e o valor 
// unitário de cada peça 2. Calcule e mostre o valor a ser pago.

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codpeca1, npeca1, codpeca2, npeca2;
        double vunit1, vunit2, preco1, preco2, precototal;

        codpeca1 = sc.nextInt();
        npeca1 = sc.nextInt();
        vunit1 = sc.nextDouble();

        codpeca2 = sc.nextInt();
        npeca2 = sc.nextInt();
        vunit2 = sc.nextDouble();

        preco1 = npeca1 * vunit1;
        preco2 = npeca2 * vunit2;

        precototal = preco1 + preco2;

        System.out.printf("VALOR A PAGAR: %.2f", precototal);

        sc.close();

    }
}
