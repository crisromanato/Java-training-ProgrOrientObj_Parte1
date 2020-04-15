package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Classes_Metodos_final.Final_Metodos;

/*
Classes e métodos final
• Palavra chave: final
• Classe: evita que a classe seja herdada
public final class SavingsAccount {
• Método: evita que o método sob seja sobreposto


Exemplo -metodo final

Suponha que você não queira que o método Withdraw de
SavingsAccount seja sobreposto

Pra quê?
• Segurança: dependendo das regras do negócio, às vezes
 é desejável garantir que uma classe não seja herdada,
 ou que um método não seja sobreposto.
 • Geralmente convém acrescentar final em métodos
 sobrepostos, pois sobreposições múltiplas podem ser
 uma porta de entrada para inconsistências
• Performance: atributos de tipo de uma classe final são
analisados de forma mais rápida em tempo de execução.
• Exemplo clássico: String


 */
public class SavingsAcount_final1 {

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
    public SavingsAcount_final1() {
            }

    public SavingsAcount_final1(Double interestRate, Integer number, String holder, Double balance) {
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
    add final no metodo para nao permitir sobreposicao
     */

    public final void withdraw(double amount) {
        balance -= amount;
    }
}


