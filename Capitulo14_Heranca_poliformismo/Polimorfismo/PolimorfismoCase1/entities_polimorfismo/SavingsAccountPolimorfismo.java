package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Polimorfismo.Polimorfismo.entities_polimorfismo;

public class SavingsAccountPolimorfismo extends AccountPolimorfismo{
    /*
   atributos
    */
    private Double interestRate;

/*
construtor padrao
 */

    public SavingsAccountPolimorfismo() {
        super();
    }

   /*
construtor com argumentos + super
 */

    public SavingsAccountPolimorfismo(Integer number, String holder, Double balance, Double interestRate) {
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
