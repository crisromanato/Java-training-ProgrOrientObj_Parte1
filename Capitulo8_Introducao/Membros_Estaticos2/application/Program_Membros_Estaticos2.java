package ProgramacaoOrientadaObjetos_Parte1.Capitulo8_Introducao.Membros_Estaticos2.application;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo8_Introducao.Membros_Estaticos2.util.Calculator_Membros_Estaticos2;

import java.util.Locale;
import java.util.Scanner;

public class Program_Membros_Estaticos2 {
    public static void main(String[] args) {
        /*
Steps:
1. add funcoes padroes (locale + scanner)
2. Instanciar a variavel calculator
3. imprimir msg para usuario add raio
4. armazenar raio
5. instanciar circunferencia e volume
6. imprimir valores na tela

* Note que foram usados metodos comuns com instanciamento somente.

         */

        Locale.setDefault(Locale.US); //1
        Scanner sc = new Scanner(System.in); //1

        Calculator_Membros_Estaticos2 calc = new Calculator_Membros_Estaticos2(); //2
        System.out.print("Enter radius: ");  //3

        double radius = sc.nextDouble(); //4
        double c = calc.circumference(radius); //5
        double v = calc.volume(radius); //5

        System.out.printf("Circumference: %.2f%n", c); //6
        System.out.printf("Volume: %.2f%n", v); //6
        System.out.printf("PI value: %.2f%n", calc.PI); //6

        sc.close();
    }

}
