package ProgramacaoOrientadaObjetos_Parte1.Capitulo15_Tratamento_excecoes.EstruturaTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Estrutura try-catch
• Bloco try
    • Contém o código que representa a execução normal do trecho de
    código que pode acarretar em uma exceção
• Bloco catch
    • Contém o código a ser executado caso uma exceção ocorra
    • Deve ser especificado o tipo da exceção a ser tratada
        (upcasting é permitido)

• Demo

try tenta executar
catch - caputar e trata a excecao.

Sintaxe
try {
} catch (ExceptionType e) {
} catch (ExceptionType e) {
} catch (ExceptionType e) {
}


 */
public class Program {


    public static void main(String[] args) {
       /*
    configuracao padrao
         */

        Scanner sc = new Scanner(System.in);

/*
declarar uma variavel vetor que vai receber valores separados
por espaço em branco
vou ler varios dados na mesma linha separados por espaco
em branco e cada um dos dados sera parte do meu vetor.
String[] vect = sc.nextLine().split(" ")

em seguida o programa var ler uma variavel position int
int position = sc.nextInt();

 e vamos mostrar na tela o vetor naquela posicao que informei.
System.out.println(vect[position]);


Exemplo:
Alex Maria Bob
test colocando letra A e 5 vao dar duas excecoes diferentes.

vamos colocar o bloco do dcodigo que pode gerar a excecao
dentro do try conforme mostra abaixo.

 */
        try { String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }

        /*
        o catch vamos colocar abaixo para cada um does erros
        o primeiro erro foi quando colocamos 5 na posicao.
        

        Temos que add a excecao e um apelilo para ela no caso
        'e' e add a msg a ser exibida.


         */
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
        }
        /*
        o catch vamos colocar abaixo para cada um does erros
        o primeiro erro foi quando colocamos A na posicao.
         */
        catch (InputMismatchException e) {
            System.out.println("Input error");
        }
        System.out.println("End of program");

        sc.close();
    }

}
