package ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Composicao_StringBuilder.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post1 {
/*
com esta instanciacao teremos apenas uma copia para a
aplicacao inteira
 */
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

/*
atributos com Wrappers
 */
    private Date moment;
    private String title;
    private String content;
    private Integer likes;

/*
declarar e instanciar uma lista
 */
    private List<Comment1> comments = new ArrayList<>();

/*
contrutor padrao e com argumentos
Nao colocar a lista no construtor
 */

    public Post1() {
    }

    public Post1(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

/*
getters and setters
Nao posso ter um metodos set para lista, pois fara a troca
da lista e nao pode ocorrer isso, por isso temos que tirar
o set e deixar somente o get
 */

    public Date getMoment() {
        return moment;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }
    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment1> getComments() {
        return comments;
    }

    /*
    metodos adicionais para a lista
     */
    public void addComment(Comment1 comment) {
        comments.add(comment);
    }

    public void removeComment(Comment1 comment) {
        comments.remove(comment);
    }

    /*
    metodo adicional para a impressao ficar em formato
    de facil entendimento
     */
    public String toString() {
        /*
construir uma string muito grande é melhor usar o string
builder, pois consome menos memoria.
primeiro declaramos um objeto do tipo String Builder e
instanciamos o mesmo
         */
        StringBuilder sb = new StringBuilder();
        /*
        o objeto sb criado, vai permitir concatenar campos
        usando a funcao append.
        append significa acrescentar no final.
         */
        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        /*
        para imprimir a data teria que ter uma instancia
        do simple date format aqui também na classe post1
        para evitar a criacao a cada momento que preciso
        do date.
        Podemos declarar uma constante
         private static SimpleDateFormat que com isso
         teremos apenas uma copia para a aplicacao inteira
                 */
        sb.append(sdf.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments:\n");
        /*
        fazer um for each para cada comment c, acrescenta
        no meu string builder o comentario
         */
        for (Comment1 c : comments) {
            sb.append(c.getText() + "\n");
        }
        return sb.toString();
    }
}
