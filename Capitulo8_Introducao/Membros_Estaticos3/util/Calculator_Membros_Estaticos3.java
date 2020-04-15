package ProgramacaoOrientadaObjetos_Parte1.Capitulo8_Introducao.Membros_Estaticos3.util;

public class Calculator_Membros_Estaticos3 {
/*
Steps:
    1. declaracao da constante PI
   2. criacao das funcoes que de calculo da circunferencia e volume
   com calculos staticos.


 */
    public static final double PI = 3.14159;

    public static double circumference(double radius) {
        return 2.0 * PI * radius; }
    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0; }


}
