package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Sobreposicao_Super_Override.entities;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Heranca.entities.AccountHeranca;

public class BusinessAccountSobreposicao_Super_Override extends AccountSobreposicao_Super_Override {
     /*
    atributos
     */

    private Double loanLimit;

    /*
    Construtor padrao
         */

    public BusinessAccountSobreposicao_Super_Override() {
        super();
    }

    /*
    Construtor com argumentos
     */

    public BusinessAccountSobreposicao_Super_Override(Integer number, String holder, Double balance, Double loanLimit) {
        /*
        o contrutor com argumentos chama os argumentos da super
        classe com a palavra super
         */
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
            /*
            ajustado a visibilidade do balance de private
            para protected para poder ser usado dentro da
            subclasse.
             */
            balance += amount - 10.0;
        }
    }
    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
        balance -= 2.0;
    }

}
