package ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Composicao.entities;

import java.util.Date;

public class HourContract {
/*
atributos com tipo Wrapper
 */

    private Date date;
    private Double valuePerHour;
    private Integer hours;

/*
contrutor simples e com argumentos
 */

    public HourContract() {
    }

    public HourContract(Date date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;

    }

/*
getters and setters
 */

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }
    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }
    public void setHours(Integer hours) {
        this.hours = hours;
    }

/*
metodos adicional
conceito de delegacao
 */
    public double totalValue() {
        return valuePerHour * hours;
    }
}
