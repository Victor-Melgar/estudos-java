package com.exemplo.app.praticas.variaveis;

public class Variaveis {
    public static void main(String[] args) {
        double preco = 150.00;

        System.out.println("""
        Classificação de Preço:
        
        Econômico: preço até R$ 50,00.
        Intermediário: preço entre R$ 50,01 e R$ 200,00.
        Premium: preço acima de R$ 200,00. 
                """);

        if (preco <= 50.00) {
            System.out.println("Categoria do produto: Econômico!");
        } else if (preco > 50.00 && preco <= 200.00) {
            System.out.println("Categoria do produto: Intermediário!");
        } else if (preco > 200.00) {
            System.out.println("Categoria do produto: Premium!");
        } else {
            System.out.println("Preço inválido!");
        }

        // -----------------------------------------------------------------

        int numero = 7;

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

        // -----------------------------------------------------------------

        double valorReais = 451.50;
        double valorDolar = valorReais / 5.25;

        System.out.println("O valor em dólares é: U$ " + valorDolar);

        // -----------------------------------------------------------------

        int idade = 19;
        String mensagemMaior = "Você é maior de idade.";
        String mensagemMenor = "Você é menor de idade.";
        // Outra possibilidade: String mensagem;

        if (idade >= 18) {
            System.out.println(mensagemMaior);
        } else {
            System.out.println(mensagemMenor);
        }

        // -----------------------------------------------------------------

        double consumoMedio = 12.5;
        double capacidadeTanque = 50;
        double combustivelAtual = 20;
        double distanciaViagem = 200;

        double autonomiaMaxima = consumoMedio * capacidadeTanque;
        double autonomiaAtual = combustivelAtual * consumoMedio;

        System.out.println("A autonomia máxima do carro é: " + autonomiaMaxima + " km");
        System.out.println("A autonomia atual do carro é: " + autonomiaAtual + " km");

        if (autonomiaAtual >= distanciaViagem) {
            System.out.println("Você pode realizar a viagem.");
        } else {
            System.out.println("Você não pode realizar a viagem.");
        }
    }
}
