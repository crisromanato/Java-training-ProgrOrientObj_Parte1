package ProgramacaoOrientadaObjetos_Parte1.Capitulo10_Memoria_arrays_listas.Wrapper_Classes;
/*


Wrapper classes
• São classes equivalentes aos tipos primitivos
        • Boxing e unboxing é natural na linguagem
        • Uso comum: campos de entidades em sistemas de informação
            (IMPORTANTE!)
            • Pois tipos referência (classes) aceitam valor null e usufruem
                dos recursos OO (Orientacao a objeto)

Exemplo:
Integer x = 10;
int y = x * 2;
public class Product {
public String name;
public Double price;
public Integer quantity;
(...)

Neste exemplo é melhor usar o Wrapper, porue ele aceita valor nulo.
Já o tipo primitivo nao aceita um valor nulo.

Uma Wrapper classe é escrita em letra maiuscula.

exemplo:

Wrapper - Integer
primitivo - int

        Integer x = 10;
        int y = x * 2;

Wrappers classes tem o obj de tratar os tipos primitivos como classes
de uma forma transparente ao compilador, sem se preocupar em fazer
conversoes ou castings.

*/

public class Program_Wrapper {
    public static void main(String[] args) {

        int x = 20;
        Integer obj = x;
        System.out.println(obj);
        int y = obj * 2;
        System.out.println(y);
    }
}
