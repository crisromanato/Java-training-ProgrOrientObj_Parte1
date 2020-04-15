package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Upcasting_Downcasting.entities;

public class SavingsAccountUpDownCasting extends AccountUpDownCasting {
    /*
    atributos
     */
    private Double interestRate;

/*
construtor padrao
 */

    public SavingsAccountUpDownCasting() {
        super();
    }

   /*
construtor com argumentos + super
 */

    public SavingsAccountUpDownCasting(Integer number, String holder, Double balance, Double interestRate) {
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
    atualizar o saldo da conta com base nos juros
     */
    public void updateBalance() {
        balance += balance * interestRate;
    }
}
