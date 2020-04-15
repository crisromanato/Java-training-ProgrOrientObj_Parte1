package ProgramacaoOrientadaObjetos_Parte1.Capitulo8_Introducao.Exercicio_Fixacao2.application;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo8_Introducao.Exercicio_Fixacao2.entities.Employee;

import java.util.Locale;
import java.util.Scanner;


public class Program_Fix2_Cap8 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler os dados de um funcionário
        (nome, salário bruto e imposto). Em seguida, mostrar os
        dados do funcionário (nome e salário líquido).
        Em seguida, aumentar o salário do funcionário com base em
        uma porcentagem dada (somente o salário bruto é afetado pela
        porcentagem) e mostrar novamente os dados do funcionário.
        Use a classe projetada abaixo.

        Exemplo:
        Name: Joao Silva Gross salary: 6000.00 Tax: 1000.00
        Employee: Joao Silva, $ 5000.00
        Which percentage to increase salary? 10.0
        Updated data: Joao Silva, $ 5600.00

1. iniciar o programa (locale + scanner)
2. instanciar a variavel employee (tipo + nome recebe(=) new tipo;
3. adicionar informacao para leitura (name, gross salary and tax),
seguidos pelos parametros para entrada do usuario ( )
5. imprimir area, perimetro e diagonal

         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        Employee emp = new Employee();

        System.out.print("Name: ");
        emp.name = sc.nextLine();
        System.out.print("Salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + emp);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + emp);

        sc.close();
    }
}
