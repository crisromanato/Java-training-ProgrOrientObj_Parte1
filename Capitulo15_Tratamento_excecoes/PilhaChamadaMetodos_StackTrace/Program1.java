    package ProgramacaoOrientadaObjetos_Parte1.Capitulo15_Tratamento_excecoes.PilhaChamadaMetodos_StackTrace;
    /*
    Pilha de chamada de Metodos
     */

    import java.util.InputMismatchException;
    import java.util.Scanner;

    public class Program1 {
        public static void main(String[] args) {
            /*
            neste caso o comportamento é diferente
            o metodo 1 começa, depois comeca o metodo2
            após digitar os dados,
            termina o 2 e depois o 1 e depois o programa
             */
            method1();
            System.out.println("End of program");
        }
        /*
                criar um novo metodo1 e chama o metodo 2 dentro
                dele
                 */
        public static void method1(){
            System.out.println("**** Method1 START ******");
            method2();
            System.out.println("**** Method1 END ******");
        }
        /*
        criar um novo metodo2 e colocar o codigo do try_catch
        dentro dele.
         */
        public static void method2() {
            /*
            inserir marcador de inicio
             */
            System.out.println("**** Method2 START ******");
            Scanner sc = new Scanner(System.in);

            try {
                String[] vect = sc.nextLine().split(" ");
                int position = sc.nextInt();
                System.out.println(vect[position]);
            } catch (ArrayIndexOutOfBoundsException e) {
                /*
                pedir pra imprimir o stack trace de msg.
                Com isso se eu testar a digitacao de uma posicao
                maior q o range doo vetor. eg. 5
                ele vai mostrar a msg de erro, depois a
                msg de excecao e também cada chamada que ocasionou
                a excecao, ou seja, cada parte do programa foi
                chamado hierarquicamente.

                Nota: por padrao se nao tivermos tratamento
                a mgs também aparece com detalhes da excecao
                e hierarchia, porem nao para em nenhum ponto.

                O stacktrace ajuda parando no local desejado.

                 */
                e.printStackTrace();
                sc.next();

                System.out.println("Invalid position!");
            } catch (InputMismatchException e) {
                System.out.println("Input error");
            }
            sc.close();
            /*
            inserir marcador de fim
             */
            System.out.println("**** Method2 END ******");
        }
    }
