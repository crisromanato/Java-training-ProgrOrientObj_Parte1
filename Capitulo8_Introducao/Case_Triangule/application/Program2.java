package ProgramacaoOrientadaObjetos_Parte1.Capitulo8_Introducao.application;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo8_Introducao.entities.Triangle1;

import java.util.Locale;
import java.util.Scanner;


public class Program2 {
    public static void main(String[] args) {

        /* Capitulo 8 - item 62 - Resolvendo um problema sem
        orientacao a objetos

Fazer um programa para ler as medidas dos lados de dois
triângulos X e Y (suponha medidas válidas). Em seguida,
 mostrar o valor das áreas dos dois triângulos e dizer
 qual dos dois triângulos possuiamaiorárea. A fórmula para
 calcular a área de um triângulo a partir das medidas de seus
 lados a, b e c é a seguinte(fórmuladeHeron):

 area: raiz de : p(p-a) (p-b) (p-c) onde

 p = (a+b+c) / 2

 Exemplo:

Enter the measures of triangle X: 3.00 4.00 5.00
Enter the measures of triangle Y: 7.50 4.50 4.02
Triangle X area: 6.0000
Triangle Y area: 7.5638
Larger area: Y


         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /* criar as variaveis dos 2 triangulos
        importar o pacote da classe triangle via importar (class)
         */
        Triangle1 x, y;
        /* instanciar o objeto */

        x = new Triangle1();
        y = new Triangle1();


        /* ler as variaveis */

        System.out.println("Enter the measures of triangle X: ");
        /* para ler e guardar a informação usar o ponto entre a variavel (eg. x)  e o atributo
        * eg. a) */
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        /* calcular a area de cada triangulo
        foi enviado para o triangle1
        agora vamos chamar somente o calculo feito na classe triangle1 aqui
      */

        double areaX = x.area();

        double areaY = y.area();

        /* imprimir os valores de cada triangulo */

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else
            {
                System.out.println("Larger area: Y");
            }

        sc.close();

        /* em resumo usamos a classe triangulo para fazer o calculo e a classe programa para
        mostrar os dados.

        Beneficios
        Reaproveitamento do codigo
        Delegacao de responsabilidade

         */



    }
}
