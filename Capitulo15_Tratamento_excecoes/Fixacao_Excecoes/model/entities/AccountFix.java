package ProgramacaoOrientadaObjetos_Parte1.Capitulo15_Tratamento_excecoes.Fixacao_Excecoes.model.entities;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo15_Tratamento_excecoes.Fixacao_Excecoes.model.exceptions.DomainFixException;

public class AccountFix {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;


    public AccountFix(
            Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
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


    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }


    public void deposit(double amount){
        balance += amount ;

    }

    public void withdraw(double amount){
        if (amount > withdrawLimit){
            throw new DomainFixException("The amount exceeds withdraw limit");
        }
        if (amount > balance){
            throw new DomainFixException("Not enough balance");
        }
        balance -= amount;

    }

   }
