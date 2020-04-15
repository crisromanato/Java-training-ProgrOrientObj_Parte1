package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Upcasting_Downcasting.entities;

/*
Heranca

Exemplo
Suponha um negócio de banco que possui uma conta comum e
uma conta para empresas, sendo que a conta para empresa
possui todos membros da conta comum, mais um limite de
empréstimo e uma operação de realizar empréstimo.

Herança permite o reuso de atributos e métodos
(dados e comportamento)

 */

public class AccountUpDownCasting {
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

    public AccountUpDownCasting() {
    }

    public AccountUpDownCasting(Integer number,
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
