package ProgramacaoOrientadaObjetos_Parte1.Capitulo8_Introducao.Exercicio_Fixacao3.application;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo8_Introducao.Exercicio_Fixacao3.entities.Student;


import java.util.Locale;
import java.util.Scanner;

public class Program_Fix3_Cap8 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler o nome de um aluno e as três notas
        que ele obteve nos três trimestres do ano (primeiro trimestre
        vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar
        qual a nota final do aluno no ano. Dizer também se o aluno está
        aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos
        faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota).
        Você deve criar uma classe Studentpara resolver este problema.

        Exemplo:
        Entrada:                                        Saída:
        Alex Green 27.00 31.00 32.00                    FINAL GRADE = 90.00 PASS

        Entrada: Saída: Alex Green 17.00 20.00 15.00    FINAL GRADE = 52.00
                                                        FAILED
                                                        MISSING 8.00 POINTS

Steps:
1. criar entrada standard (locale + scanner)
2. finalizar scanner
3. instanciar a variavel student.
4. ler nome + notas

         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Type your name and the grades for each quarter: ");

        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();



        System.out.printf("Final Grade: %.2f\n", student.finalGrade());

        if (student.finalGrade()<60.00) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS\n", student.missingPoint());
        }
        else {
            System.out.println("PASS");
        }

sc.close();
    }
}
