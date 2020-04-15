package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.ClassesMetodosAbstratos.Cap14_FixacaoClassesMetodosAbst.entities;

public abstract class TaxPayerFixClassesMetodosAbstr {
/*
atributos
 */
    private String name;
    private Double anualIncome;
/*
construtor com argumento
 */


    public TaxPayerFixClassesMetodosAbstr(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
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

        public Double getAnualIncome() {
        return anualIncome;
    }
    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }


/*
declaracao do metodo tax
 */

    public abstract Double tax();
}
