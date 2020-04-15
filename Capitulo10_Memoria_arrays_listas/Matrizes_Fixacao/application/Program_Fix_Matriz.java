package ProgramacaoOrientadaObjetos_Parte1.Capitulo10_Memoria_arrays_listas.Matrizes_Fixacao.application;

import java.util.Scanner;

public class Program_Fix_Matriz {
    /*
    Fazer um programa para ler dois números inteiros M e N,
    e depois ler uma matriz de M linhas por N colunas contendo números
    inteiros, podendo haver repetições. Em seguida, ler um número inteiro
    X que pertence à matriz. Para cada ocorrência de X, mostrar os valores
    à esquerda, acima, à direita e abaixo de X, quando houver, conforme
    exemplo.

    Example
3 4
10 8 15 12
21 11 23 8
14 5 13 19
8
Position 0,1:
Left: 10
Right: 15
Down: 11
Position 1,3:
Left: 23
Up: 12
Down: 19

https://github.com/acenelio/matrix2-java
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
leitura variaveis m e n
 */
        int m = sc.nextInt();
        int n = sc.nextInt();

        /*
        instanciacao da matriz
         */
        int[][] mat = new int[m][n];

/*
Como faço pra ler a matriz
teremos que ler a linha e depois as colunas (2 for) identificando
sempre a leitura do proximo
 */
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

/*
ler o numero X dentro da matriz
 */
        int x = sc.nextInt();
/*
comandos for e if para ler cada posicao
 */
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j-1]);
                    }

                    if (i > 0) {
                       System.out.println("Up: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length-1) {
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (i < mat.length-1) {
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
