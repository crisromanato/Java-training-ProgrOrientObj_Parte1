package ProgramacaoOrientadaObjetos_Parte1.Capitulo10_Memoria_arrays_listas.Unboxing;

   /*
    Unboxing
• É o processo de conversão de um objeto tipo referência para um objeto
tipo valor compatível (casting) mandatorio para o compilador nao reclamar.


exemplo:
int x = 20; - na stack da memoria fico com o valor
Object obj = x; fica com ponteiro na Stack e o valor no Heap da memoria do
Java
int y = (int) obj; o y fica na stack, mas o obj fica com um ponteiro para o
Heap do Java.

Essa classe Object é a classe mais generica do JAVA - todas as classes
por padrao sao filhas dessa classe object.
capitulo introdutorio de java

Quando fazemos um boxing o valor vai para a Heap do Java

     */


public class Program_Unboxing {


    public static void main(String[] args) {

        int x = 20;
        Object obj = x;
        System.out.println(obj);

        int y = (int) obj;
        System.out.println(y);
    }



}
