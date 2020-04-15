package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.ClassesMetodosAbstratos.ClassesAbstratas.Case2.entities;

public class AccountClassesAbstratasCase2 {
    /*
    atributos
     */
    private Integer number;
    private String holder;
    protected Double balance;

    /*
    construtor padrao
     */

    public AccountClassesAbstratasCase2() {
    }

/*
construtor com argumentos
 */

    public AccountClassesAbstratasCase2(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;

    }

/*
getters and setters
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
    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
