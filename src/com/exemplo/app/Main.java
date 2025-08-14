package com.exemplo.app;

import java.util.ArrayList;
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

        // System.out.print("Digite um número: ");
        // int numero = scanner.nextInt();

        // int fatorial = 1;

        // for (int i = 1; i <= numero; i++) {
        //     fatorial *= i;
        // }

        // System.out.println("O fatorial de " + numero + " é: " + fatorial);

        // scanner.close();

        // // ---------------------------------------------------------------

        // System.out.print("Digite os números separados por espaço: ");
        // String[] numerosStr = scanner.nextLine().split(" ");
        // int maior = Integer.MIN_VALUE;

        // for (String numStr : numerosStr) {
        //     int num = Integer.parseInt(numStr);
        //     if (num > maior) {
        //         maior = num;
        //     }
        // }
        // System.out.println("O maior número é: " + maior);
        // scanner.close();

        // // ---------------------------------------------------------------

        // System.out.println("""
        // ********** OPÇÕES **********
        // 1. Login
        // 2. Cadastro
        // 3. Listar cadastros
        // 4. Sair
        //         """);

        // System.out.print("Digite a opção desejada: ");
        // int opcao = scanner.nextInt();
        
        // if (opcao == 1) {
        //     System.out.println("Digite o email para login: ");
        //     String email = scanner.next();
        //     System.out.println("Digite a senha para login: ");

        // } else if (opcao == 2) {

        // } else if (opcao == 3) {

        // } else if (opcao == 4) {
        //     System.out.println("Saindo...");
        // } else {
        //     System.out.println("Opção inválida!");
        // }

        // // ---------------------------------------------------------------

        // final String SENHA_CORRETA = "1234";

        // for (int tentativas = 3; tentativas > 0; tentativas--) {
        //     System.out.print("Digite sua senha: ");
        //     String senha = scanner.nextLine();

        //     if (senha.equals(SENHA_CORRETA)) {
        //         System.out.println("Senha correta! Acesso concedido!");
        //         break;
        //     } else if (tentativas > 1) {
        //         System.out.println("Senha incorreta. Você tem " + (tentativas - 1) + " tentativas restantes.");
        //     } else {
        //         System.out.println("Conta bloqueada temporariamente.");
        //     }
        // }
        // scanner.close();

        // // ---------------------------------------------------------------

        // String nome;
        // do {
        //     System.out.print("Digite seu nome: ");
        //     nome = scanner.nextLine();
        //     if (nome.length() < 3) {
        //         System.out.println("Nome inválido. Digite novamente.");
        //     }
        // } while (nome.length() < 3);
        // System.out.println("Nome \"" + nome + "\" cadastrado com sucesso!");
        // scanner.close();

        // // ---------------------------------------------------------------

        // String numero;
        // int negativos = 0;
        // int positivos = 0;


        // while(true) {
        //     System.out.println("Digite um número (ou 'sair' para encerrar): ");
        //     numero = scanner.nextLine();

        //     if (numero.equalsIgnoreCase("sair")) {
        //         break;
        //     }

        //     int valor = Integer.parseInt(numero);

        //     if (valor >= 0) {
        //         positivos++;
        //     } else {
        //         negativos++;
        //     }
        // }
            
        
        //     System.out.println("Número positivos: " + positivos);
        //     System.out.println("Número negativos: " + negativos);

        // // ------------------------------------------------------------------

        // System.out.print("Digite um número: ");
        // int limite = scanner.nextInt();
        // for (int i = 1; i <= limite; i++) {
        //     if (i % 10 == 5) {
        //         continue;
        //     }
        //     System.out.print(i + " ");
        // }
        // scanner.close();

        // // ----------------------------------------------------------------------
 
        // ArrayList<String> convidados = new ArrayList<>();
 
        // while (true) {
        //     System.out.print("Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): ");
        //     String nome = scanner.nextLine().trim();
 
        //     if (nome.equalsIgnoreCase("sair")) {
        //         System.out.println("Programa finalizado.");
        //         break;
        //     }
 
        //     if (nome.equalsIgnoreCase("ver")) {
        //         System.out.println("Lista atualizada de convidados: " + convidados);
        //         continue;
        //     }
 
        //     boolean jaExiste = false;
        //     for (String convidado : convidados) {
        //         if (convidado.toLowerCase().equals(nome.toLowerCase())) {
        //             jaExiste = true;
        //             break;
        //         }
        //     }
 
        //     if (jaExiste) {
        //         System.out.println("O nome " + nome + " já está na lista de convidados.");
        //     } else {
        //         convidados.add(nome);
        //         System.out.println(nome + " foi adicionado à lista de convidados.");
        //     }
            
        // }
 
        // scanner.close();

        // ----------------------------------------------------------------------

        ArrayList<String> jogadores = new ArrayList<>();

        while (true) {
            System.out.println();
            System.out.println("""
            ********** OPÇÕES **********
            1. Adicionar jogador
            2. Listar jogadores
            3. Logar jogador
            4. Sair
            """);

            System.out.println("Digite a opção desejada: ");
            int opcao = scanner.nextInt();
            
            if (opcao == 1) {
                System.out.println("Digite o nome do jogador: ");
                String nome = scanner.next();
                
                boolean jaExiste = false;
                for (String jogador : jogadores) {
                    if (jogador.toLowerCase().equals(nome.toLowerCase())) {
                        jaExiste = true;
                        break;
                    }
                }

                if (jaExiste) {
                    System.out.println("O jogador " + nome + " já está na lista.");
                } else {
                    jogadores.add(nome);
                    System.out.println("Jogador " + nome + " adicionado com sucesso.");
                }

            } else if (opcao == 2) {
                System.out.println("Lista de jogadores: " + jogadores);
            } else if (opcao == 3) {
                System.out.println("Digite o nome do jogador para logar: ");
                String nome = scanner.next();

                boolean encontrado = false;
                for (String jogador : jogadores) {
                    if (jogador.toLowerCase().equals(nome.toLowerCase())) {
                        encontrado = true;
                        break;
                    }
                }

                if (encontrado) {
                    System.out.println("Jogador " + nome + " logado com sucesso.");
                } else {
                    System.out.println("Jogador " + nome + " não encontrado.");
                }

            } else if (opcao == 4) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }

    }      
}
