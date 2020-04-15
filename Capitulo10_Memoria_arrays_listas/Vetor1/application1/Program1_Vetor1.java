package ProgramacaoOrientadaObjetos_Parte1.Capitulo10_Memoria_arrays_listas.Vetor1.application1;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo10_Memoria_arrays_listas.Vetor1.entities1.Product_Vetor1;

import java.util.Locale;
import java.util.Scanner;

/*
Problema exemplo 1: - VETOR COM TIPO REFERENCIA

Fazer um programa para ler um número inteiro N e os dados (nome e preço)
de N Produtos. Armazene os N produtos em um vetor.
Em seguida, mostrar o preço médio dos produtos.


Example
o numero 3 significa que serao lidas 3 vetores definidos
Input: 3 TV 900.00 Fryer 400.00 Stove 800.00
Output: AVERAGE PRICE: 700.00

Nota: Na stack fica um ponteiro (n) e na heap ficam os valores deste vetor
 */

public class Program1_Vetor1 {
    /*
    VETOR COM TIPO REFERENCIA
     */

    public static void main(String[] args) {
        /*
        declarar config inicias - locale e scanner
        */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        Ler a variavel n para ser usada no vetor
         */
        int n = sc.nextInt();
        /*
        os produtos serao representados por uma classe
        vamos criar uma classe produtos para auxiliar nosso vetor
        vamos fazer isso dentro de um pacote entities1
        logo apos vamos criar nosso vetor
        */
        Product_Vetor1[] vect = new Product_Vetor1[n];

        /*
        quando temos um vetor usando um tipo referencia de outa classe,
        dentro da memoria heap os valores vem nullos - vazios e temos que
        instanciar o produto e fazer cada posicao apontar para o objeto no
        heap.
        temos um trabalho a mais porque cada quadrado da heap é só uma
        referencia tendo que ser instanciado para receber o valor no objeto.

        logo abaixo temos o for que vai percorrer todas as posicoes do vetor
         */

        //for (int i=0; i<n; i++) {
       for (int i=0; i<vect.length; i++) {
            /*
           atributo lenght que tem em um vetor
           estamos usando a variavel n - que é a qt de elementos de um vetor
           uma opcao é usar o vect.lenght ao inves de n.
           melhor a variavel vect.lenght para nao ficar dependente de uma
           outra variavel que nao esta atrelada ao vetor.
           é mais coeso pois o proprio vetor sabe o tamanho dele.
             */
            sc.nextLine(); // para consumir a quebra de linha do nextItn acima
            String name = sc.nextLine();
            double price = sc.nextDouble();
            /*
            instanciar o novo produto e o vect na posicao i vai apontar para
            o novo objeto
             */
            vect[i] = new Product_Vetor1(name, price);
        }

        /*
        fazer a soma e a media dos precos
         */
        double sum = 0.0;

        //for (int i=0; i<n; i++) {
        for (int i=0; i<vect.length; i++) {
             /*
           atributo lenght que tem em um vetor
           estamos usando a variavel n - que é a qt de elementos de um vetor
           uma opcao é usar o vect.lenght ao inves de n.
           melhor a variavel vect.lenght para nao ficar dependente de uma
           outra variavel que nao esta atrelada ao vetor.
           é mais coeso pois o proprio vetor sabe o tamanho dele.
             */
            sum += vect[i].getPrice();
        }
        // double avg = sum / n;
        double avg = sum / vect.length;
        /*
           atributo lenght que tem em um vetor
           estamos usando a variavel n - que é a qt de elementos de um vetor
           uma opcao é usar o vect.lenght ao inves de n.
           melhor a variavel vect.lenght para nao ficar dependente de uma
           outra variavel que nao esta atrelada ao vetor.
           é mais coeso pois o proprio vetor sabe o tamanho dele.
             */

        /*
        mostrar a msg
         */

        System.out.printf("AVERAGE PRICE = %.2f%n", avg);


        sc.close();
    }

}
