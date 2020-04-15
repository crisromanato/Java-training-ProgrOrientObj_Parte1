package ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Fixacao.model.entities;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

/*
Atributos
 */

    private String name;
    private String email;
    private Date birthDate;


/*
construtor
 */
    public Client(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

/*
getters and setters
 */

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

/*
generate toString para retornar os dados do cliente
 */

    @Override
    public String toString() {
        return name + " (" + sdf.format(birthDate) + ") - " + email;
    }
}
