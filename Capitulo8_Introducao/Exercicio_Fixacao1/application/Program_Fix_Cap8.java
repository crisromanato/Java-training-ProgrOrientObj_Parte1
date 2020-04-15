package ProgramacaoOrientadaObjetos_Parte1.Capitulo8_Introducao.Exercicio_Fixacao1.application;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo8_Introducao.Exercicio_Fixacao1.entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program_Fix_Cap8 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler os valores da largura e altura
        de um retângulo. Em seguida, mostrar na tela o valor de sua área,
        perímetro e diagonal. Usar uma classe como mostrado no projeto ao
        lado.

        exemplo:
        Enter rectangle width and height:
        3.00
        4.00
        AREA = 12.00
        PERIMETER = 14.00
        DIAGONAL = 5.00

1. iniciar o programa (locale + scanner)
2. instanciar a variavel retangulo
3. adicionar informacao para leitura
4. incluir parametros para entrada do usuario ( width + height)
5. imprimir area, perimetro e diagonal

         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo rect = new Retangulo();
        System.out.println("Enter rectangle width and height: ");
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();

        System.out.printf("Area : %.2f\n", rect.area());
        System.out.printf("Perimeter : %.2f\n", rect.perimeter());
        System.out.printf("Diagonal : %.2f\n", rect.diagonal());



    }
}
