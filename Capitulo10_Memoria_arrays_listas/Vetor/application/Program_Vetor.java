package ProgramacaoOrientadaObjetos_Parte1.Capitulo10_Memoria_arrays_listas.Vetor.application;

/*
Problema exemplo 1: - VETOR

Fazer um programa para ler um número inteiro N e a altura de N pessoas.
Armazene as N alturas em um vetor. Em seguida, mostrar a altura média
dessas pessoas.

Example
o numero 3 significa que serao lidas 3 alturas definidas
Input: 3 1.72 1.56 1.80
Output: AVERAGE HEIGHT = 1.69

Nota: Na stack fica um ponteiro (n) e na heap ficam os valores deste vetor
 */
import java.util.Locale;
import java.util.Scanner;

public class Program_Vetor {
    public static void main(String[] args) {

        /*
        iniciar o programa
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        ler o valor do n
         */

        int n = sc.nextInt(); // ler numero inteiro - variavel temporaria

         /*
        criar um vetor
        ao criar o vetor vect ele ira instanciar os 3 valores iniciados com
        0 pois em java como estou definindo eles como double, o java inicia
        com 0.
        os colchetes mostra que é um vetor e ao declarar a variavel new ela
        vai receber a instanciacao do vetor - entre colchetes colocamos o tamanho
        do vetor que no nosso caso sera igual a n.
         */
        double[] vect = new double[n];

         /*
        como faço para guardar os numeros recebido no vetor dentro da heap?
        para isso criamos um laço-for, que vai incrementando a heap conforme
        formos inserindo os valores.
        criamos o for onde variavel i começa com 0 e enquanto ela for menor q
        n continua a repeticao i++

         */

        for (int i=0; i<n; i++) {
            /*
            dentro do laço teremos a leitura dos dados do vetor
             */
            vect[i] = sc.nextDouble();
        }
            /*
            calcular a media do vetor, faremos o mesmo porem iniciando uma
            variavel sum com 0 para ser usada dentro do laço-for.
             */
        double sum = 0.0;
        for (int i=0; i<n; i++) {
            sum += vect[i];
        }

         /*
        criar uma variavel para guardar a media
         */
        double avg = sum / n;

        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);

        sc.close();
    }
}
