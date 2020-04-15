package ProgramacaoOrientadaObjetos_Parte1.Capitulo8_Introducao.Membros_Estaticos2.util;

public class Calculator_Membros_Estaticos2 {
    /*
    Steps:
    1. declaracao da constante PI
   2. criacao das funcoes que de calculo da circunferencia e volume
     */
    public final double PI = 3.14159;

    public double circumference(double radius) {
        return 2.0 * PI * radius; }
    public double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0; }
}
