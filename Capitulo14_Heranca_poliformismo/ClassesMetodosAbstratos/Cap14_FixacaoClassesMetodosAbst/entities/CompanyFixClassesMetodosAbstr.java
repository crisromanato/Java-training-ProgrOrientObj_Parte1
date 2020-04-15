package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.ClassesMetodosAbstratos.Cap14_FixacaoClassesMetodosAbst.entities;

public class CompanyFixClassesMetodosAbstr extends TaxPayerFixClassesMetodosAbstr {

/*
atributos
 */
    private Integer numberOfEmployees;

/*
construtor com argumentos e super
 */

    public CompanyFixClassesMetodosAbstr(
            String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

/*
getters and setters
 */

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }
    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }


/*
implementacao do metodo abstrato tax com o override

 */

    @Override

    public Double tax() {
        if (numberOfEmployees > 10) {
            return getAnualIncome() * 0.14;
        }
        else {
            return getAnualIncome() * 0.16;
        }
    }
}
