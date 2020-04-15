    package ProgramacaoOrientadaObjetos_Parte1.Capitulo15_Tratamento_excecoes.PilhaChamadaMetodos_StackTrace;
    /*
    Pilha de chamada de Metodos
     */
    import java.util.InputMismatchException;
    import java.util.Scanner;

    public class Program {
        public static void main(String[] args) {
            /*
            programa main chama o metodo 2 e depois
            mostra a msg que o programa terminou.
             */
            method2();
            System.out.println("End of program");
        }

        /*
        criar um novo metodo e colocar o codigo do try_catch
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
