package ProgramacaoOrientadaObjetos_Parte1.Capitulo8_Introducao.Exercicio_Fixacao1.entities;

public class Retangulo {

    /*
    area: base x altura
    perimetro: 2(base + altura)
    diagonal:
    (teorema de pitagoras) - valor do quadrado da hipotenusa = soma dos
    quadrados de seus catetos.
    Formula:
    d2= b2+h2 ou d=√b2+h2

declarar as variaveis
         */

    public double width;
    public double height;

/*
metodo pra calculo area , perimetro e diagonal

 */
public double area() {
    return width * height; // base x altura
}
public double perimeter (){
    return 2*(width + height); //  2(base + altura)
}
public double diagonal(){
    return Math.sqrt(width*width + height*height); // d=√b2+h2
}
}
