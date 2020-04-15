package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.ClassesMetodosAbstratos.Cap14_FixacaoClassesMetodosAbst.entities;

public class IndividualFixClassesMetodosAbstr extends TaxPayerFixClassesMetodosAbstr {

/*
atributos
 */
    private Double healthExpenditures;

/*
construtor com argumento e super
 */

    public IndividualFixClassesMetodosAbstr(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

/*
getters and setters
 */

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }
    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

/*
implementacao do metodo abstrato tax com o override

 */


    @Override
    public Double tax() {

        if (getAnualIncome() < 20000.0) {
            return getAnualIncome() * 0.15 - healthExpenditures * 0.5;
        }
        else {
            return getAnualIncome() * 0.25 - healthExpenditures * 0.5;
        }

    }
    }
