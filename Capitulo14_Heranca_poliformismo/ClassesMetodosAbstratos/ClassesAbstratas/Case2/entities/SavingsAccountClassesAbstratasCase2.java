package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.ClassesMetodosAbstratos.ClassesAbstratas.Case2.entities;

public class SavingsAccountClassesAbstratasCase2 extends AccountClassesAbstratasCase2{

    /*
    atributos
     */

    private Double interestRate;

    /*
    construtor padrao
     */


    public SavingsAccountClassesAbstratasCase2() {
        super();
    }

/*
construtor com argumentos e super
 */

    public SavingsAccountClassesAbstratasCase2(
            Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

/*
getters and setters
 */

    public Double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

/*
metodos adicionais
 */

    public void updateBalance() {
        balance += balance * interestRate;
    }

/*
sobreposicao?
 */

    @Override
    public final void withdraw(double amount) {
        balance -= amount;
    }
}
