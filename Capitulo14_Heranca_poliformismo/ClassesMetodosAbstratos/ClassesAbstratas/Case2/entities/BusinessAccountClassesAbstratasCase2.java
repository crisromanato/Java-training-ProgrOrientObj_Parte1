package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.ClassesMetodosAbstratos.ClassesAbstratas.Case2.entities;

public class BusinessAccountClassesAbstratasCase2 extends AccountClassesAbstratasCase2 {
    /*
    atributos
     */
    private Double loanLimit;

/*
construtor padrao
 */
    public BusinessAccountClassesAbstratasCase2() {
        super();
    }

/*
construtor com argmentos e super
 */

    public BusinessAccountClassesAbstratasCase2(
            Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

/*
getters and setters
 */
    public Double getLoanLimit() {
        return loanLimit;
    }
    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    /*
    metodos adicionais
     */

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }


/*
sobreposicao ?
 */
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }
}
