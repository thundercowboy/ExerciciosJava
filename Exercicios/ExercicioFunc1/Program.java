
// Fazer um programa que leia três valores com ponto flutuante 
// de dupla precisão: A, B e C. Em seguida, calcule e mostre: 
// a) a área do triângulo retângulo que tem A por base e C por altura. 
// b) a área do círculo de raio C. (pi = 3.14159) 
// c) a área do trapézio que tem A e B por bases e C por altura. 
// d) a área do quadrado que tem lado B. 
// e) a área do retângulo que tem lados A e B

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, atrian, acirc, atrap, aquad, aret, pi = 3.14159;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        atrian = A * C / 2.0;
        acirc = pi * C * C;
        atrap = ((A + B) * C) / 2.0;
        aquad = B * B;
        aret = A * B;

        System.out.printf("TRIANGULO: %.3f%n", atrian);
        System.out.printf("CIRCULO: %.3f%n", acirc);
        System.out.printf("TRAPEZIO: %.3f%n", atrap);
        System.out.printf("QUADRADO: %.3f%n", aquad);
        System.out.printf("RETANGULO: %.3f%n", aret);

        sc.close();
    }
}
