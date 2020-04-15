package ProgramacaoOrientadaObjetos_Parte1.Capitulo8_Introducao.Membros_Estaticos3.application;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo8_Introducao.Membros_Estaticos3.util.Calculator_Membros_Estaticos3;

import java.util.Locale;
import java.util.Scanner;

public class Program_Membros_Estaticos3 {
    public static void main(String[] args) {
        /*
Steps:
1. add funcoes padroes (locale + scanner)
2. imprimir msg para usuario add raio
3. armazenar raio
4. instanciar circunferencia e volume - baseado numa classe estatica
5. imprimir valores na tela

* Note que foram usados metodos com classes estaticas obtidas via import.

         */

        Locale.setDefault(Locale.US); //1
        Scanner sc = new Scanner(System.in); //1

        System.out.print("Enter radius: "); //2

        double radius = sc.nextDouble();
        double c = Calculator_Membros_Estaticos3.circumference(radius);
        double v = Calculator_Membros_Estaticos3.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator_Membros_Estaticos3.PI);

    }
}
