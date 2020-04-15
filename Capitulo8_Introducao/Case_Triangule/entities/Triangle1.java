package ProgramacaoOrientadaObjetos_Parte1.Capitulo8_Introducao.entities;

public class Triangle1 {

    /* atributos
 public fala que esse atributo pode ser acessado por outro arquivo.

 Vamos declarar as variaveis x e y to tipo triangle e vamos instancia-las
 Triangle x, y;  - perceba que o triangle é um tipo assim como o double.
 Porém ele é um tipo composto porque tem 3 atributos (a,b,c)
 x = new Triangle();
 y = new Triangle();

 A variavel x vai apontar para um objeto e esse objeto é composto por 3 atributos (a,b,c)
Vamos condensar os valores diferente da variavel anterior que fizemos.

Quando a variavel é do tipo classe, temos que instanciar com o comando new + nome do tipo.

     */
    public double a;
    public double b;
    public double c;


    /* calcular a area de cada triangulo
       Formula para os triangulos
        area: raiz de : p(p-a) (p-b) (p-c) onde
        p = (a+b+c) / 2

        Note que o metodo / funcao para calculo da area noo trouxe os atributos (a,b,c) como
        parametros porque eles ja estao declarados acima.

        public - visibilidade
        double - tipo da funcao - para calculo de area
        area - nome da funcao
        () parametros que a funcao recebe para execuçao - no caso da area nao precisamos de mais
        dados alem do que ja temos nas variaveis (a,b,c) assim neste caso fica em branco.
     */
    public double area() {
        /*
        Implementar a funcao
        double é uma variavel local
         */
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    }
