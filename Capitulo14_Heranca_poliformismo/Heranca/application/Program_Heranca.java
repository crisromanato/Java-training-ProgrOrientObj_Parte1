package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Heranca.application;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Heranca.entities.BusinessAccount_Heranca;


/*
exemplo criando um pbjeto do tipo:
BusinessAccount account = new BusinessAccount();
posso chamar os objetos eg.
        account.getBalance();
        getHolder, etc.
Isso porque via extends ela recebe a heranca contido no account.

https://github.com/acenelio/inheritance1-java

 */
public class Program_Heranca {
    public static void main(String[] args) {
        BusinessAccount_Heranca account = new BusinessAccount_Heranca();
        account.getBalance();
    }
}
