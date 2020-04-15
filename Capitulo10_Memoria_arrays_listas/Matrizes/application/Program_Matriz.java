package ProgramacaoOrientadaObjetos_Parte1.Capitulo10_Memoria_arrays_listas.Matrizes.application;

import java.util.Scanner;

/*
Exercício resolvido
Fazer um programa para ler um número inteiro N e uma matriz
de ordem N contendo números inteiros. Em seguida, mostrar a
diagonal principal e aquantidade de valores negativos da matriz.

Example
Input:
3
5 -3 10
15 8  2
7  9 -4
Output:
Main diagonal: 5 8 -4
Negative numbers = 2

https://github.com/acenelio/matrix1-java/blob/master/src/application/Program.java


 */
public class Program_Matriz {
    public static void main(String[] args) {

        /*
        configuracao basica
         */
        Scanner sc = new Scanner(System.in);

        /*
        ler a variavel n
         */
        int n = sc.nextInt();
/*
criar a matriz - dois colchetes pra bidimensional se for tridimensional 3
colchetes. ao final teremos n linhas e n colunas.
Instanciando a matriz na memoria
na stack teremos o poneior n da variavel mat criada abaixo
no heap teremos os valores das linhas e das colunas iniciados com 0.
 */
        int[][] mat = new int[n][n];

/*
Como faço pra ler a matriz
teremos que ler a linha e depois as colunas (2 for)

Propriedade Length do Array Bidimensional - math.Length
A propriedade similar ao do vetor.
Exemplo para For inicial com N:
for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                mat[i][j] = sc.nextInt();

A quantidade de linhas da matriz é N, podemos trocar a informacação N
por mat.length para ficar dentro do mesmo objeto.
de:   for (int i=0; i<n; i++) {
Para: for (int i=0; i<mat.length; i++) {

E a quantidade de colunas?
Lembra que a matriz é um vetor de vetores?
As linhas sao os vetores - cada linha corresponde a um vetor de x posiçoes.
As colunas sao a quantidade de vetores da linha i, ou seja:
de:         for (int j=0; j<n; j++) {
Muda pra:   for (int j=0; j<mat[i].length; j++) {

  */

            for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
            /*
            debugar neste ponto para ver os dados sendo processados
             */
        }
/*
comando para mostrar a diagonal principal
note que o 5 esta na posicao 0 0
o 8 está na posicao 1 1
o 4 esta na posicao 2 2
Neste caso os elementos da diagonal vao sempre ter os mesmo valores para
a coluna e linha
Com isso posso fazer um for pra buscar os valores da matriz
e dentro colocar pra imprimir sempre o elemento da matriz mat na linha i e
coluna i também e adicionar um espaço em branco pra nao ficar um grudado no
outro.
 */
        System.out.println("Main diagonal:");
        for (int i=0; i<mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }

        System.out.println();
/*
Quantidade de numeros negativos
primeiro vou iniciar uma variavel count com zero.
 */
        int count = 0;
        /*
        depois vamos percorrer a matriz com for
        dentro do for vamos colocar a regra pra encontrar os numeros
        negativos com o if.
         */

        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }

        System.out.println("Negative numbers = " + count);

        sc.close();
    }
}
