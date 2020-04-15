package ProgramacaoOrientadaObjetos_Parte1.Capitulo10_Memoria_arrays_listas.application2;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo10_Memoria_arrays_listas.entities2.Rent;

import java.util.Scanner;

/*

Exercício de fixação - VETOR com tipo referencia
A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos números 0 a 9.

Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o número de estudantes que vão alugar
quartos (N pode ser de 1 a 10).
Em seguida, registre o aluguel dos N estudantes.
Para cada registro de aluguel, informar o nome e email do estudante,
bem como qual dos quartos ele escolheu (de 0 a 9).
Suponha que seja escolhido um quarto vago. Ao final, seu programa deve
imprimir um relatório de todas ocupações do pensionato, por ordem de quarto,
 conforme exemplo.

Exemplo:
How many rooms will be rented? 3
Rent #1:
Name: Maria Green
Email: maria@gmail.com
Room: 5

Rent #2:
Name: Marco Antonio
Email: marco@gmail.com
Room: 1

Rent #3:
Name: Alex Brown
Email: alex@gmail.com
Room: 8

Busy rooms:
1: Marco Antonio, marco@gmail.com
5: Maria Green, maria@gmail.com
8: Alex Brown, alex@gmail.com


 */

public class Program_Vetor2 {
    public static void main(String[] args) {
/*
criar conf inicial - scanner
 */
        Scanner sc = new Scanner(System.in);

        /*
        iniciar a variavel vect usando tipo referencia de outra classe
        para buscar os 10 quartos para alugar
         */
        Rent[] vect = new Rent[10];

        /*
        imprimir msg para usuario inserir o numero do quarto de 0 a 9
         */
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt(); // variavel temporaria para vetor

        /*
        codigo para alimentar o vetor
         */

        for (int i=1; i<=n; i++) { System.out.println();
            /*
            adiçao de numero de "rent"
             */
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine(); // quebra de linha
            String name = sc.nextLine(); // variavel temporaria para name
            System.out.print("Email: ");
            String email = sc.nextLine(); // variavel temporaria para email
            System.out.print("Room: ");
            int room = sc.nextInt(); // variavel temporaria para quarto
            vect[room] = new Rent(name, email); // instanciar vetor
        }

        /*
        impressao em ordem crescente quartos ocupados
         */
        System.out.println();
        System.out.println("Busy rooms:");
        for (int i=0; i<10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }
        sc.close();
    }
}
