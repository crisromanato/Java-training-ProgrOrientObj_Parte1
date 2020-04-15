package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Classes_Metodos_final;

/*
Classes e métodos final
• Palavra chave: final
• Classe: evita que a classe seja herdada
public final class SavingsAccount {
• Método: evita que o método sob seja sobreposto


Exemplo -Classe final
Suponha que você queira evitar que sejam criadas subclasses
 de SavingsAccount

add o final na class

 */
public final class SavingsAcount_final {

    /*
  atributos
   */
    private Double interestRate;
    private Integer number;
    private String holder; // titular
    private Double balance;


/*
construtor padrao e com argumentos
 */
    public SavingsAcount_final() {
            }

    public SavingsAcount_final(Double interestRate, Integer number, String holder, Double balance) {
        this.interestRate = interestRate;
        this.number = number;
        this.holder = holder;
        this.balance = balance;
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
    outros metodos
     */

    public void withdraw(double amount) {
        balance -= amount;
    }
}


