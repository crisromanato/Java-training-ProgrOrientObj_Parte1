package ProgramacaoOrientadaObjetos_Parte1.Capitulo10_Memoria_arrays_listas.Lista_Fixacao.entities;

public class Employee {
    /*
    Variaveis Wrapper
     */
    private Integer id;
    private String name;
    private Double salary;

/*
Constutores
 */

    public Employee() {

    }

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

/*
Getters and setters
 */

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }

/*
Metodos adicionais
 */

    public void increaseSalary(double percentage) {
        salary += salary * percentage / 100.0;
    }

    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }
}
