package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.ClassesMetodosAbstratos.MetodosAbstratos.MetodosAbstratosCase1.entities;


import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.ClassesMetodosAbstratos.MetodosAbstratos.MetodosAbstratosCase1.entities.enums.Color;

/*
quando fazemos o extends shape, o programa ja fala que
tem q implementar o metodo shape.area
 */
public class RectangleMetodosAbstratosCase1 extends
        ShapeMetodosAbstratosCase1{

    /*
    atributos
     */
    private Double width;
    private Double height;


/*
construtor padrado com super
 */
    public RectangleMetodosAbstratosCase1() {
        super();
    }

/*
construtor com argumentos e super
 */

    public RectangleMetodosAbstratosCase1(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }


/*
getters and setters
 */
    public Double getWidth() {
        return width;
    }
    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
       return height;
    }
    public void setHeight(Double height) {
        this.height = height;
    }

/*
implementacao do metodo abstrato area com o override
 */

    @Override
    public double area() {
        return width * height;
    }
}
