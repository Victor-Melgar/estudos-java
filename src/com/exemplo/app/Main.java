package com.exemplo.app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Digite a quantidade de degraus: ");
        // int degraus = scanner.nextInt();

        // for (int i = 0; i < degraus; i++) {
        //     System.out.println("Subindo degrau " + (i + 1));
        // }
        // System.out.println("Você chegou ao topo!");

        // // ---------------------------------------------------------------

        // int[] valores = {10, 20, 30, 40, 50};
        // int resultado = 0;

        // for (int valor : valores) {
        //     resultado += valor;
        // }

        // System.out.println("A soma dos valores é: " + resultado);

        // // ---------------------------------------------------------------

        // int soma = 0;
        // for (int i = 1; i <= 100; i++) {
        //     if (i % 2 == 0) {
        //         soma += i;
        //     }
        // }
        // System.out.println("A soma dos números pares de 1 a 100 é: " + soma);

        // // ---------------------------------------------------------------

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        scanner.close();

        // ---------------------------------------------------------------

        System.out.println("Digite os números separados por espaço: ");
        String entrada = scanner.nextLine();

        int 

        for (int i = 0; i < entrada.length(); i++) {
            System.out.println(entrada);
        }
    }      
}
