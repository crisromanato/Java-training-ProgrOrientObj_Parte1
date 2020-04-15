package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.ClassesMetodosAbstratos.ClassesAbstratas.Case2.application;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.ClassesMetodosAbstratos.ClassesAbstratas.Case2.entities.AccountClassesAbstratasCase2;
import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.ClassesMetodosAbstratos.ClassesAbstratas.Case2.entities.BusinessAccountClassesAbstratasCase2;
import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.ClassesMetodosAbstratos.ClassesAbstratas.Case2.entities.SavingsAccountClassesAbstratasCase2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/*
Classes Abstratas

• Demo:
suponha que você queira:
• Totalizar o saldo de todas as contas.
• Depositar 10.00 em todas as contas.

https://github.com/acenelio/inheritance6-java

 */
public class ProgramClassesAbstratasCase2 {

    public static void main(String[] args) {

/*
customizacao basica
 */

        Locale.setDefault(Locale.US);

        /*
criar uma lista do tipo account
         */
        List<AccountClassesAbstratasCase2> list = new ArrayList<>();
        /*
        note que estamos usando uma lista do tipo generic e com isso
        podemos inserir tanto objetos do tipo conta poupanca quanto
        empresarial
        inserir algumas contas dentro desta lista
         */
        list.add(new SavingsAccountClassesAbstratasCase2(
                1001, "Alex", 500.00, 0.01));
        list.add(new BusinessAccountClassesAbstratasCase2(
                1002, "Maria", 1000.0, 400.0));
        list.add(new SavingsAccountClassesAbstratasCase2(
                1004, "Bob", 300.0, 0.01));
        list.add(new BusinessAccountClassesAbstratasCase2(
                1005, "Anna", 500.0, 500.0));
/*
criar uma variavel soma iniciando com 0. para totalizar as contas
 */
        double sum = 0.0;
/*
vamos fazer laco for each para ter a soma de todas as contas
independente do tipo que for,
 */
        for (AccountClassesAbstratasCase2 acc : list) {
            sum += acc.getBalance();
        }


/*
impressao para ver o resultado.
 */
        System.out.printf("Total balance: %.2f%n", sum);


/*
laco for each para depositar valores em cada conta
 */
        for (AccountClassesAbstratasCase2 acc : list) {
            acc.deposit(10.0);
        }
/*
aco for each para impressao dos valores finais em cada conta
 */
        for (AccountClassesAbstratasCase2 acc : list) {
            System.out.printf("Updated balance for account %d: %.2f%n",
                    acc.getNumber(), acc.getBalance());
        }
    }
}
