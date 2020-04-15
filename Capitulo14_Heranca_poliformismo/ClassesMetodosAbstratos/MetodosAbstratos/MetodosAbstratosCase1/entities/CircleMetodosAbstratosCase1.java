package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.ClassesMetodosAbstratos.MetodosAbstratos.MetodosAbstratosCase1.entities;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.ClassesMetodosAbstratos.MetodosAbstratos.MetodosAbstratosCase1.entities.enums.Color;
/*
quando fazemos o extends shape, o programa ja fala que
tem q implementar o metodo shape.area
 */
public class CircleMetodosAbstratosCase1 extends
        ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.ClassesMetodosAbstratos.MetodosAbstratos.MetodosAbstratosCase1.entities.ShapeMetodosAbstratosCase1 {

    /*
    atributos
     */
    private Double radius;

/*
construtor padrao
 */

    public CircleMetodosAbstratosCase1() {
        super();
    }

/*
construtor com argumentos e super
 */

    public CircleMetodosAbstratosCase1(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }
  /*
getters and setters
 */

    public Double getRadius() {
        return radius;
    }
    public void setRadius(Double radius) {
        this.radius = radius;
    }

/*
implementacao do metodo abstrato area com o override
area do circulo.
 */

    @Override

    public double area() {
        return Math.PI * radius * radius;
    }
    }
