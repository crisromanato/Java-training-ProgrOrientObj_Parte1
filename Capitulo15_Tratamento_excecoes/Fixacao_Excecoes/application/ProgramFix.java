package ProgramacaoOrientadaObjetos_Parte1.Capitulo15_Tratamento_excecoes.Fixacao_Excecoes.application;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo15_Tratamento_excecoes.Fixacao_Excecoes.model.entities.AccountFix;
import ProgramacaoOrientadaObjetos_Parte1.Capitulo15_Tratamento_excecoes.Fixacao_Excecoes.model.exceptions.DomainFixException;

import java.util.Locale;
import java.util.Scanner;

/*
Exercício de fixação
Fazer um programa para ler os dados de uma conta bancária e depois
realizar um saque nesta conta bancária, mostrando o novo saldo.
Um saque não pode ocorrer ou se não houver saldo na conta, ou
se o valor do saque for superior ao limite de saque da conta.
Implemente a conta bancária conforme projeto abaixo:


Account
-number: integer
- holder: String
- balance: Double
-WithdrawLimit: Double

+ deposit(amount Double) void
+ withdraw(amount Double) void

Example 1
Enter account data
Number: 8021
Holder: Bob Brown
Initial balance: 500.00
Withdraw limit: 300.00

Enter amount for withdraw: 100.00
New balance: 400.00

Enter account data
Number: 8021
Holder: Bob Brown
Initial balance: 500.00
Withdraw limit: 300.00

Enter amount for withdraw: 400.00
Withdraw error: The amount exceeds withdraw limit

Example 2
Enter account data
Number: 8021
Holder: Bob Brown
Initial balance: 500.00
Withdraw limit: 300.00

Enter amount for withdraw: 800.00
Withdraw error: The amount exceeds withdraw limit

Enter account data
Number: 8021
Holder: Bob Brown
Initial balance: 200.00
Withdraw limit: 300.00
Enter amount for withdraw: 250.00
Withdraw error: Not enough balance

https://github.com/acenelio/exceptions2-java

 */
public class ProgramFix {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();


        AccountFix acc = new AccountFix(number, holder, balance, withdrawLimit);

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        double amount = sc.nextDouble();

        try {
            acc.withdraw(amount);
            System.out.println("New balance: " + String.format("%.2f", + acc.getBalance()));
        }
        catch (DomainFixException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();

    }
}
