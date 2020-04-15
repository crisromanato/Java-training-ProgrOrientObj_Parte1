package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.ClassesMetodosAbstratos.MetodosAbstratos.MetodosAbstratosCase1.application;
/*

Métodos abstratos
• São métodos que não possuem implementação.
• Métodos precisam ser abstratos quando a classe é genérica
demais para conter sua implementação.

eg. temos duas classes retangulo (largura e altura) e circulo
 (raio) e temos uma classe 'super' chamada  forma(shape),
 dentro desta classe temos a definicao de cor (enum) e também a
 definicao de area, porem a area de cada forma pode variar
 assim temos um caso abstrato no metodo area.
 Neste caso deixamos o metodo abstrato e só implementamos
 esse metodo nas subclasses.

 Para usamos o polimorfismo temos que declarar no shape, mesmo
 que ela nao tenha implementacao.

• Se uma classe possuir pelo menos um método abstrato, então
esta classe também é abstrata.

Note que quando temos uma classe ou um metodo abstrato ele
fica em italico no UML.


Exercício resolvido

Fazer um programa para ler os dados de N figuras
(N fornecido pelo usuário), e depois mostrar as áreas destas
figuras na mesma ordem em que foram digitadas.


Enter the number of shapes: 2
Shape #1 data:
Rectangle or Circle (r/c)? r
Color (BLACK/BLUE/RED): BLACK
Width: 4.0
Height: 5.0

Shape #2 data:
Rectangle or Circle (r/c)? c
Color (BLACK/BLUE/RED): RED
Radius: 3.0

SHAPE AREAS:
20.00
28.27


https://github.com/acenelio/inheritance7-java
 */

import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.ClassesMetodosAbstratos.MetodosAbstratos.MetodosAbstratosCase1.entities.CircleMetodosAbstratosCase1;
import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.ClassesMetodosAbstratos.MetodosAbstratos.MetodosAbstratosCase1.entities.RectangleMetodosAbstratosCase1;
import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.ClassesMetodosAbstratos.MetodosAbstratos.MetodosAbstratosCase1.entities.ShapeMetodosAbstratosCase1;
import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.ClassesMetodosAbstratos.MetodosAbstratos.MetodosAbstratosCase1.entities.enums.Color;
import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.ClassesMetodosAbstratos.MetodosAbstratos.MetodosAbstratosCase1.entities.ShapeMetodosAbstratosCase1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class ProgramMetodosAbstratosCase1 {

    public static void main(String[] args) {

/*
configuracao basica
 */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

/*
declarar uma lista de figuras que sera usado para os dados que sera
armazenado
Sempre vamos usar o tipo generico na nossa colecao, poruqe
estamos querendo polimorfismo, entao temos que declarar a
lista do tipo da superclasse.
Assim esta lista vai aceitar dados de todos os tipos das
subclasses.

Perceba que podemos criar variaveis ou colecoes de um tipo
abstrato(shape) basta instanciarmos com tipos concretos. eg.addlist

 */

        List<ShapeMetodosAbstratosCase1> list = new ArrayList<>();

       /*
       1. programa começa perguntando o numero de shapes
        */
        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

/*
2. fazer um for para ler as n figuras que temos
quando acabar teremos uma lista com todas as figuras lidas.

 */

        for (int i=1; i<=n; i++) {
            /*
            pedir para o usuario digitar a figura i
             */
            System.out.println("Shape #" + i + " data:");
            /*
            pegurnntar pro usuario retangulo ou circulo
             */
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            /*
            perguntar a cor.
             */
            System.out.print("Color (BLACK/BLUE/RED): ");
            /*
            declarar uma variavel do tipo color recebendo
            color que sera convertido via .valueOf para o tipo
            enumerado color.
             */
            Color color = Color.valueOf(sc.next());
/*
decisao
testar se o caracter digitado for r vai solicitar a entreda
da altura e largura.
 */
            if (ch == 'r') {
                System.out.print("Width: ");
                /*
                variavel para receber os dados digitados
                 */
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
/*
o dado digitado vai ser add a uma lista definida acima.
instanciado a lista com tipo concreto. Vai ser feito o
upcasting para shaping e a lista vai funcionar normalmente
inclusive fazendo o polimorfismo com a area. eg. shape.area
na impressao logo abaixo.
 */
                list.add(new RectangleMetodosAbstratosCase1(color, width, height));
            }
            else {
                /*
                caso o valor digitado seja c "circulo" sera solicitado
                o raio para o usuario
                 */
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                /*
                o valor sera armazenado a lista o circulo.
                 */
                list.add(new CircleMetodosAbstratosCase1(color, radius));
            }
        }


/*
Mostrar as areas das figuras
 */
        System.out.println();
        System.out.println("SHAPE AREAS:");

        /*
        laco for each
         */
        for (ShapeMetodosAbstratosCase1 shape : list) {
            /*
            polimorfismo em shape.area
            O polimorfismo aconteceu porque tinhamos tanto
            obj retanguo como circulo.
            Quanto era retangulo o calculo era de um jeito
            e para o circulo foi de outra forma.

            O polimorfismo passa natural pelo compilador
            ele nao sabe qual o tipo especifico de cada
            figura da lista.
            O calculo de cada area é obtido dos objetos
            polimorficamente dependendo do tipo de cada
            objeto.

             */
            System.out.println(String.format("%.2f", shape.area()));
        }

        sc.close();

    }
}
