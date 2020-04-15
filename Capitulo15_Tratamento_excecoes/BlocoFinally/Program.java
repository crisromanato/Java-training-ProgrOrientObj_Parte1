    package ProgramacaoOrientadaObjetos_Parte1.Capitulo15_Tratamento_excecoes.BlocoFinally;

    import java.io.File;
    import java.io.FileNotFoundException;
    import java.util.Scanner;

    /*
    Bloco finally

     É um bloco que contém código a ser executado independentemente de ter
     ocorrido ou não uma exceção.
    • Exemplo clássico: fechar um arquivo, conexão de banco de dados, ou
    outro recurso específico ao final do processamento.

    Sintaxe:

    try {
    } catch (ExceptionType e) {
    } finally {
    }

     */
    public class Program {

        public static void main(String[] args) {
    /*
    iniciar variavel do tipo file, instanciacao do objeto
    passo o caminho do arquivo.

    eg: "C:\\temp\\in.txt"

    C:\Users\Usuario\Desktop\Programação\Udemy - Nelio\workplace-udemy-Nelio\src\ProgramacaoOrientadaObjetos_Parte1\Capitulo15_Tratamento_excecoes\BlocoFinally
     */
            File file = new File("C:\\temp\\in.txt");
            /*
            declaro um scanner
             */
            Scanner sc = null;
            try {
                /*
                tento instanciar o scanner apontado para o arquivo.
                a classe scanner também serve para ler arquivos
                 */
                sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    System.out.println(sc.nextLine());
                }
            }
            catch (FileNotFoundException e) {
                /*
                e.getMessage exibe a msg padrao do java para casos que nao
                encontra o file.
                 */
                System.out.println("Error opening file: " + e.getMessage());
            }
             finally {
                /*
                bloco finally é executado independente do resultado
                do bloco try

                test com e sem um arquivo no local mencionado acima.
                 */
                if (sc != null) {
                    sc.close();
                }
            System.out.println("Finally bock executed");
           }
        }
    }
