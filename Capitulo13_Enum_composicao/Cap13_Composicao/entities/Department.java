package ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Composicao.entities;


public class Department {
/*
declarar o atributo.
 */
    private String name;

    /*
construtor vazio e com argumentos
 */

    public Department() {
    }


    public Department(String name) {
        this.name = name;
    }

/*
getter
 */
    public String getName() {
        return name;
    }
}

