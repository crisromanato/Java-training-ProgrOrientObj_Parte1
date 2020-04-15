package ProgramacaoOrientadaObjetos_Parte1.Capitulo8_Introducao.application;

import java.util.Locale;
import java.util.Scanner;

public class Program_Triangle {
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

         */
        double xA, xB, xC, yA, yB, yC;

        /* ler as variaveis */

        System.out.println("Enter the measures of triangle X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        /* calcular a area de cada triangulo
        Formula para os triangulos
         area: raiz de : p(p-a) (p-b) (p-c) onde
         p = (a+b+c) / 2
      */

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

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

        /* em resumo usamos varias variaveis para representar um triangulo.
        Para melhorar isso vamos usar uma classe para representar um triangulo

        Teoria
        Classe
        * é um tipo estruturado que pode conter membros.
            Atributos (dados / campos) - eg. tipo triangulo vai ter os atributos a,b,c
                tipo cliente - nome, cpf, email, etc.
                Os atributos sao os dados representados no meu tipo.
            Metodos (funçoes e operaçoes)


        A classe também pode prover muitos outros recursos,
        tais como: • Construtores • Sobrecarga • Encapsulamento • Herança • Polimorfismo

        • Exemplos:
        • Entidades: Produto, Cliente, Triangulo
        • Serviços: ProdutoService, ClienteService, EmailService, StorageService
        • Controladores: ProdutoController, ClienteController •
        Utilitários: Calculadora, Compactador
        • Outros (views, repositórios, gerenciadores, etc.)


         */



    }
}
