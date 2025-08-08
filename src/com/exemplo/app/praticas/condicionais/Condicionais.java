package com.exemplo.app.praticas.condicionais;

import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

        // -----------------------------------------------------------------

        double nota = scanner.nextDouble();

        if (nota >= 7.0) {
            System.out.println("O estudante teve média " + nota + "e foi aprovado. ");
        } else if (nota >= 5.0 && nota < 7.0) {
            System.out.println("O estudante teve média " + nota + "e está de recuperação. ");
        } else {
            System.out.println("O estudante teve média " + nota + "e foi reprovado. ");
        }

        // -----------------------------------------------------------------

        int senha = 12345;

        int senhaDigitada = scanner.nextInt();

        if (senhaDigitada == senha) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Acesso negado.");
        }

        // -----------------------------------------------------------------

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();

        if (primeiroNumero > segundoNumero) {
            System.out.println("O primeiro número " + primeiroNumero + " é maior que o segundo número " + segundoNumero + ".");
        } else if (segundoNumero > primeiroNumero) {
            System.out.println("O segundo número " + segundoNumero + " é maior que o primeiro número " + primeiroNumero + ".");
        } else {
            System.out.println("Os números são iguais.");
        }

        // -----------------------------------------------------------------

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        if (valorCompra >= 100.00) {
            double desconto = valorCompra * 0.10;
            double valorComDesconto = valorCompra - desconto;
            System.out.println("Parabéns! Você ganhou um desconto de 10%");
            System.out.println("Valor com desconto: R$ " + valorComDesconto);
        } else {
            System.out.println("Valor sem desconto: R$ " + valorCompra);
        }

        // -----------------------------------------------------------------

        System.out.print("Digite o dia da semana (em letras minúsculas): ");      
        String dia = scanner.nextLine(); 
        scanner.close();      

        if (dia.equals("segunda") || dia.equals("terca") ||      
            dia.equals("quarta") || dia.equals("quinta") ||      
            dia.equals("sexta")) {      
            System.out.println(dia + " é um dia útil.");      
        } else {      
            System.out.println(dia + " não é um dia útil.");      
        } 
        
        // -----------------------------------------------------------------

        System.out.print("Digite o valor do empréstimo: ");
        int valor = scanner.nextInt();
        
        if (valor < 1000) {
            System.out.println("O valor" + valor + ", não está dentro do intervalo permitido para empréstimo.");
        } else if (valor >= 1000 && valor <= 5000) {
            System.out.println("O valor " + valor + ", está dentro do intervalo permitido para empréstimo.");
        } else {
            System.out.println("O valor " + valor + ", é muito alto para o empréstimo.");
        }

        // -----------------------------------------------------------------
  
        System.out.print("Digite o primeiro lado: ");    
        int lado1 = scanner.nextInt();    
        System.out.print("Digite o segundo lado: ");    
        int lado2 = scanner.nextInt();    
        System.out.print("Digite o terceiro lado: ");    
        int lado3 = scanner.nextInt();    
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {    
            System.out.println("Os lados podem formar um triângulo.");    
        } else {    
            System.out.println("Os lados não podem formar um triângulo.");    
        } 
        scanner.close();    

        // -----------------------------------------------------------------

        System.out.print("Digite a idade do doador: ");      
        int idade = scanner.nextInt();      

        System.out.print("Digite o peso do doador (em kg): ");      
        double peso = scanner.nextDouble();   

        boolean idadeValida = idade >= 18 && idade <= 65;      
        boolean pesoValido = peso > 50;      

        if (idadeValida && pesoValido) {      
            System.out.println("O doador é compatível para doação de sangue.");  
        } else {      
            System.out.println("O doador não é compatível. Motivo:");      
            if (!idadeValida) {      
                System.out.println("- Deve ter entre 18 e 65 anos.");      
            }      
            if (!pesoValido) {      
                System.out.println("- Deve pesar mais de 50 kg.");      
            }      
        }

        // -----------------------------------------------------------------
    
        int codigoCorreto = 2023;    
        int nivelPermissaoMinimo = 1;    
        int nivelPermissaoMaximo = 3;    
 
        System.out.print("Digite o código de acesso: ");    
        int codigoDigitado = scanner.nextInt();    
 
        System.out.print("Digite o nível de permissão: ");    
        int nivelPermissao = scanner.nextInt();    
 
        boolean codigoValido = codigoDigitado == codigoCorreto;  
        boolean permissaoValida = nivelPermissao >= nivelPermissaoMinimo && nivelPermissao <= nivelPermissaoMaximo;    
 
        if (codigoValido && permissaoValida) {    
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");    
        } else {    
            System.out.println("Acesso negado. Motivo(s):");    
            if (!codigoValido) {    
                System.out.println("- Código de acesso incorreto.");    
            }    
            if (!permissaoValida) {    
                System.out.println("- Nível de permissão inválido.");    
            }    
        }  
    }
}
