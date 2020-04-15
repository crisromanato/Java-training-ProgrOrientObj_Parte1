package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.ClassesMetodosAbstratos.MetodosAbstratos.MetodosAbstratosCase1.entities;


import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.ClassesMetodosAbstratos.MetodosAbstratos.MetodosAbstratosCase1.entities.enums.Color;

/*
quando o metodo é abstrato também tenho q falar q a classe
e abstrata
 */
public abstract class ShapeMetodosAbstratosCase1 {

    /*
    atributos
     */
    private Color color;

/*
construtor padrao
 */

    public ShapeMetodosAbstratosCase1() {
   }


/*
construtor com argumento
 */
    public ShapeMetodosAbstratosCase1(Color color) {
        this.color = color;
    }

    /*
    getters and setters
     */
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }


/*
declaracao do metodo area
 */
    public abstract double area();
}
