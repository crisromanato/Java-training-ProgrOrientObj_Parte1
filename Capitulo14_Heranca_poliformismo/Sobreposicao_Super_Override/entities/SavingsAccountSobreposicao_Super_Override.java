package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Sobreposicao_Super_Override.entities;



public class SavingsAccountSobreposicao_Super_Override extends AccountSobreposicao_Super_Override {
    /*
    atributos
     */
    private Double interestRate;

/*
construtor padrao
 */

    public SavingsAccountSobreposicao_Super_Override() {
        super();
    }

   /*
construtor com argumentos + super
 */

    public SavingsAccountSobreposicao_Super_Override(Integer number, String holder, Double balance, Double interestRate) {
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

    /*
    sobreposicao da superclasse para calculo diferenciado na contasavings.
    A informacao @Override mostra que houve uma sobreposicao isso e temos um
    calculo diferente do mencionado na classe Acoount.
    Nota o @Override é só um informativo para facilitar a leitura do
    programador.
         */

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}

