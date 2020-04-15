package ProgramacaoOrientadaObjetos_Parte1.Capitulo8_Introducao.Exercicio_Fixacao_Membros_Estaticos1.util;

public class CurrencyConverter1 {
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
1. Variante com valor determinado para IOF
2. metodo pra converter dollar

         */

    public static double IOF = 0.06;

    public static double dollarToReal(double amount, double dollarPrice) {
        return amount * dollarPrice * (1.0 + IOF);
    }
    }
