package com.exemplo.app;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Digite o nome: ");
        // String nome = scanner.nextLine();

        // System.out.println("Digite o segundo nome: ");
        // String nomeSegundo = scanner.nextLine();

        // String nomeFormatado = nome.trim();
        // System.out.println("Nome sem espaços: " + nomeFormatado);
        // System.out.println("Nome sem espaços: " + nomeSegundo);
        // scanner.close();

        // // ---------------------------------------------------------

        // System.out.println("Digite o texto: ");
        // String texto = scanner.nextLine();

        // String textoMaiusculo = texto.toUpperCase();
        // String textoMinusculo = texto.toLowerCase();

        // System.out.println("Texto em maiúsculas: " + textoMaiusculo);
        // System.out.println("Texto em minúsculas: " + textoMinusculo);

        // // -------------------------------------------------------------

        System.out.print("Digite o nome do arquivo: ");
        String arquivo = scanner.nextLine();
        
        int posicaoPonto = arquivo.lastIndexOf(".");
        if (posicaoPonto != -1) {
            String nomeSemExtensao = arquivo.substring(0, posicaoPonto);
            System.out.println("Nome do arquivo sem extensão: " + nomeSemExtensao);
        } else {
            System.out.println("O arquivo não possui extensão.");
        }
        scanner.close();


    }      
}
