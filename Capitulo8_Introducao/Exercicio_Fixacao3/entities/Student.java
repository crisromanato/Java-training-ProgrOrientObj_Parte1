package ProgramacaoOrientadaObjetos_Parte1.Capitulo8_Introducao.Exercicio_Fixacao3.entities;

public class Student {
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
1. criar variaveis
2. criar funcao para somar as notas.
3. criar funcao para calcular o minimo que falta para o aluno ser aprovado

         */
 public String name;
 public double grade1;
    public double grade2;
    public double grade3;


 public double finalGrade(){
     return grade1 + grade2 + grade3;
 }

 public double missingPoint(){
     if (finalGrade()<60.0) {
         return 60.0 - finalGrade();
              }
     else {
         return 0.00;
     }
 }
}

