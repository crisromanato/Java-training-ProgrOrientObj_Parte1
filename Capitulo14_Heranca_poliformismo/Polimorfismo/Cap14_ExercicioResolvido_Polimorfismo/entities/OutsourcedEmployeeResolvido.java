package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Polimorfismo.Polimorfismo.Cap14_ExercicioResolvido_Polimorfismo.entities;
/*
subclasse da classe employee
 */
public class OutsourcedEmployeeResolvido extends EmployeeResolvido{
/*
atributos com wrapper
 */
    private Double additionalCharge;

/*
construtor padrao
 */

    public OutsourcedEmployeeResolvido() {
        super();
    }

/*
construtor com argumentos e super class
 */

    public OutsourcedEmployeeResolvido(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }


/*
getters and setters
 */
    public Double getAdditionalCharge() {
        return additionalCharge;
    }
    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

/*
sobreposicao
 */

    @Override
    public double payment() {
        /*
        vai receber o pgamento do funcionario normal
        no caso da superclass e o adicional de bonus
         */
        return super.payment() + additionalCharge * 1.1;
    }
}
