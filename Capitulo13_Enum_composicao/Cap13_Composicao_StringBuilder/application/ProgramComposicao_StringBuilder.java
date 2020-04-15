package ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Composicao_StringBuilder.application;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Composicao_StringBuilder.entities.Comment1;
import ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Composicao_StringBuilder.entities.Post1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
Exercício resolvido 2 (demo StringBuilder)
http://educandoweb.com.br
Prof. Dr. Nelio Alves

Instancie manualmente (hard code) os objetos mostrados
abaixo e mostre-os na tela do terminal, conforme exemplo.

Console Output
Traveling to New Zealand
 12 Likes - 21/06/2018 13:05:44
 I'm going to visit this wonderful country!
 Comments:
 Have a nice trip
 Wow that's awesome!

Good night guys
 5 Likes - 28/07/2018 23:14:19
 See you tomorrow
 Comments:
 Good night
 May the Force be with you


https://github.com/acenelio/composition2-java

 */
public class ProgramComposicao_StringBuilder {

    public static void main(String[] args) throws ParseException {

/*
declarar e instanciar o simple date format que sera usado nos posts
colocando a mascara
 */
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
/*
objeto do tipo comment e instanciar o primeiro posting
 */
        Comment1 c1 = new Comment1("Have a nice trip!");
        Comment1 c2 = new Comment1("Wow that's awesome!");
/*
objeto do tipo post1 e instanciar usando o simple date format.
incluso a declaracao throws para eliminar a msg de erro.
 */
        Post1 p1 = new Post1(
                sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12);
/*
add os comentarios para o posting 1
 */
        p1.addComment(c1);
        p1.addComment(c2);
/*
objeto do tipo comment e instanciar o segundo posting
 */
        Comment1 c3 = new Comment1("Good night");
        Comment1 c4 = new Comment1("May the Force be with you");
/*
objeto do tipo post1 e instanciar o segundo posting usando o
simple date format
 */
        Post1 p2 = new Post1(
                sdf.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5);
/*
associacoes para add os comentarios para o posting 2
 */
        p2.addComment(c3);
        p2.addComment(c4);

/*
Impressao dos dois postings
 */

        System.out.println(p1);
        System.out.println(p2);

    }
}
