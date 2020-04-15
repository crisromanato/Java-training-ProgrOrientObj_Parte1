package ProgramacaoOrientadaObjetos_Parte1.Capitulo8_Introducao.Exercicio_Fixacao_Membros_Estaticos1.application;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo8_Introducao.Exercicio_Fixacao_Membros_Estaticos1.util.CurrencyConverter1;

import java.util.Locale;
import java.util.Scanner;

public class Program_Membros_Estaticos {
    public static void main(String[] args) {
        /*

Exercício de fixação
Faça um programa para ler a cotação do dólar, e depois um
valor em dólares a ser comprado por uma pessoa em reais.
Informar quantos reais a pessoa vai pagar pelos dólares,
considerando ainda que a pessoa terá que pagar 6% de IOF
sobre o valor em dólar. Criar uma classe CurrencyConverter
para ser responsável pelos cálculos.

Exemplo:

What is the dollar price? 3.10
How many dollars will be bought? 200.00
Amount to be paid in reais = 657.20

Steps:
1. metodos iniciais (Locale + Scanner)
2. msg para usuario entrar valor do dolar
3. variavel (dollar price) para receber o input
4. msg para usuario entrar qt de dolar a converter
5 variavel (amount) para receber o input
6. variavel para conversao
7. msg de valor convertido

         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double amount = sc.nextDouble();
        double result = CurrencyConverter1.dollarToReal(amount, dollarPrice);
        System.out.printf("Amount to be paid in reais = %.2f%n", result);

        sc.close();

    }
}
