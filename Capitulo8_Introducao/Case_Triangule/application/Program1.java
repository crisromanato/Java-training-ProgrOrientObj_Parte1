package ProgramacaoOrientadaObjetos_Parte1.Capitulo8_Introducao.application;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo8_Introducao.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;


public class Program1 {
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
        Triangle x, y;
        /* instanciar o objeto */

        x = new Triangle();
        y = new Triangle();


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
        Formula para os triangulos
         area: raiz de : p(p-a) (p-b) (p-c) onde
         p = (a+b+c) / 2
      */

        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));


        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

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
            1. Atributos (dados / campos) - eg. tipo triangulo vai ter os atributos a,b,c
                tipo cliente - nome, cpf, email, etc.
                Os atributos sao os dados representados no meu tipo.
               2. Metodos (funçoes e operaçoes)

         Nota: Objeto: são instancias da classe (eg. triangulo x e y)

        A classe também pode prover muitos outros recursos,
        tais como: • Construtores • Sobrecarga • Encapsulamento • Herança • Polimorfismo

        • Exemplos:
        • Entidades: Produto, Cliente, Triangulo
        • Serviços: ProdutoService, ClienteService, EmailService, StorageService
        • Controladores: ProdutoController, ClienteController •
        Utilitários: Calculadora, Compactador
        • Outros (views, repositórios, gerenciadores, etc.)


        Instanciacao
        Quando instanciamos uma variavel x, alocamos um espaço da Stack. Trata-se de uma alocacao
        dinamica e na stack fica o endereço de memoria desta alocacao.
        A utlizacao da memoria para cada atributo (objeto) -  (a,b,c) fica dentro da Heap
        A variavel stack contem um endereço via ponteiro para a o Heap.

         */



    }
}
