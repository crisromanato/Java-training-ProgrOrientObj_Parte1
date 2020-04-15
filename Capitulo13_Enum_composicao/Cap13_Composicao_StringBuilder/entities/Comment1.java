package ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Composicao_StringBuilder.entities;

public class Comment1 {
    /*
    atributos
     */
    private String text;

/*
construtor padrao e com argumentos
 */

    public Comment1() {
    }

    public Comment1(String text) {
        this.text = text;
    }

/*
getters and setters
 */

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}
