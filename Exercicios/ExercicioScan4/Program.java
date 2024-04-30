
// Fazer um programa que leia o número de um funcionário, 
// seu número de horas trabalhadas, o valor que recebe por 
// hora e calcula o salário desse funcionário. A seguir, 
//mostre o número e o salário do funcionário, com duas casas decimais.

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int nfunc, htrab;
        double vhora, salario;

        nfunc = sc.nextInt();
        htrab = sc.nextInt();
        vhora = sc.nextDouble();

        salario = vhora * htrab;

        System.out.printf("NUMBER = %d", nfunc);
        System.out.printf("SALARY = U$ %.2f", salario);

        sc.close();

    }
}
