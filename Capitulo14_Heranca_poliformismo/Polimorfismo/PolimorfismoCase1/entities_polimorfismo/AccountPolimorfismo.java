package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Polimorfismo.Polimorfismo.entities_polimorfismo;

public class AccountPolimorfismo {
    /*
atributos
 */
    private Integer number;
    private String holder; // titular
    /*
    alterado para protected para poder ser usado no business
    account
     */
    protected Double balance;

    /*
    construtor padrao e com argumentos
     */

    public AccountPolimorfismo() {
    }

    public AccountPolimorfismo(Integer number,
                                              String holder,
                                              Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    /*
    Getters and setters
         */

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }
   /*
   metodos adicionais
    */

    public void withdraw(double amount){
        balance -= amount + 5.0;
    }
    public void deposit(double amount){
        balance += amount;
    }
}
