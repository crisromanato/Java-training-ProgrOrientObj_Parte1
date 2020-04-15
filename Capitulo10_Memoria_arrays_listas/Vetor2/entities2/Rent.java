package ProgramacaoOrientadaObjetos_Parte1.Capitulo10_Memoria_arrays_listas.entities2;

/*
Baseado no exemplo:
Exemplo:
How many rooms will be rented? 3
Rent #1:
Name: Maria Green
Email: maria@gmail.com
Room: 5

Criar os atributos: name e email e definir construtor e getters and setters
definir também um metodo Stringto para mostrar os dados no programa que retorne
nome e email.
 */
public class Rent {
    private String name;
    private String email;


    public Rent(String name, String email) {
        this.name = name;
        this.email = email;
    }

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

    public String toString() {
        return name + ", " + email; }
}
