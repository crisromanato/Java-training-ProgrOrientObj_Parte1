package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Polimorfismo.Polimorfismo.Cap14_ExercicioResolvido_Polimorfismo.entities;

public class EmployeeResolvido {

/*
atributos com Wrapper
 */
    private String name;
    private Integer hours;
    private Double valuePerHour;


/*
construtor padrao
 */
    public EmployeeResolvido() {
    }

/*
construtor com argumentos
 */

    public EmployeeResolvido(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
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

    public Integer getHours() {
        return hours;
    }
    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }
    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }


/*
metodos adicionais
 */
    public double payment() {
        return hours * valuePerHour;
    }
}
