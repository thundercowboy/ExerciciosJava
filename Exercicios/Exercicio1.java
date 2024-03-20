
// Faça um programa para ler dois valores inteiros, 
// e depois mostrar na tela a soma desses números com uma 
// mensagem explicativa, conforme exemplos.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x1, x2, soma;

        x1 = sc.nextInt();
        x2 = sc.nextInt();
        soma = x1 + x2;

        System.out.printf("SOMA= %d", soma);

        sc.close();

    }
}
