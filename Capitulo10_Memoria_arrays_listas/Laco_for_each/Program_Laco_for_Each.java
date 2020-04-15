package ProgramacaoOrientadaObjetos_Parte1.Capitulo10_Memoria_arrays_listas.Laco_for_each;

/*
Laço "for each"
Sintaxe opcional e simplificada para percorrer coleções
Sintaxe:
for (Tipo apelido : coleção) { <comando 1> <comando 2> }
for ("tipo" do elemento do vetor,  depois o "nome" dele, depois ":"
depois o nome da colecao - é o nome dado ao vetor.
Dentro os comando que se deseja.

Chamar um for each tem o mesmo comportamento da chamada for para o vetor.
 Demo
 Leitura do laço_for_each:
 "para cada objeto 'obj' contido em no vetor vect, faça:"
for (String obj : vect)

 */
public class Program_Laco_for_Each {
    public static void main(String[] args) {

        String[] vect = new String[]{"Maria", "Bob", "Alex"};

        System.out.println("Usando vetor com for normal: ");

        for (int i = 0; i < vect.length; i++) {
               System.out.println(vect[i]);
        }

        System.out.println("____________________________");

        System.out.println("Usando vetor com laço for each:");

        for (String obj : vect) {
            System.out.println(obj);
        }
    }
}
