package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Upcasting_Downcasting.application;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Heranca.entities.BusinessAccount_UpDownCasting;
import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Upcasting_Downcasting.entities.AccountUpDownCasting;
import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Upcasting_Downcasting.entities.SavingsAccountUpDownCasting;


/*
Checklist
• Upcasting •
Casting da subclasse para superclasse
• Uso comum: polimorfismo

• Downcasting •
Casting da superclasse para subclasse
• Palavra instanceof •
Uso comum: métodos que recebem parâmetros genéricos (ex: Equals)

Example
https://github.com/acenelio/inheritance2-java

tests
 */


public class Program_UpDownCasting {


    public static void main(String[] args) {
        /*
        declarar variavel
         */
        AccountUpDownCasting acc = new AccountUpDownCasting(1001, "Alex", 0.0);
        BusinessAccount_UpDownCasting bacc = new BusinessAccount_UpDownCasting(1002, "Maria", 0.0, 500.0);

/*
testar upcasting
pegar um objeto do tipo bacc (subclasse) e atribuir para a variavel do tipo
acc (superclasse)
Para isso vou criar uma variavel chamada abaixo.
Isso é possivel porque a heranca é uma relacao é um.
ou seja um bacc é um acc
com isso posso atribuir um objeto do tipo bacc para um obj tipo acc1
 */

AccountUpDownCasting acc1 = bacc;
acc1.getBalance();
/*
outro exemplo
criar uma variavel do tipo acc2
nao deu erro poruqe a bacc é uma conta isso pode ser feito.
 */
AccountUpDownCasting acc2 = new BusinessAccount_UpDownCasting(1003, "Bob", 0.0, 200.0);

/*
outro exemplo
criar uma variavel do tipo acc3 - recebendo os savings
nao deu erro poruqe a bacc é uma conta isso pode ser feito.
Muito usado em Polimorfismo
 */
AccountUpDownCasting acc3 = new SavingsAccountUpDownCasting(1004, "Ana", 0.0, 0.01);


/*
testar Downcasting
pegar um objeto do tipo acc (superclasse) e atribuir para a
variavel do tipo bacc (subclasse)
Para efetuar esse processo temos q forçar via casting.
Note que o loan é do bacc e temos que fazer o downcasting.
 */

BusinessAccount_UpDownCasting acc4 = (BusinessAccount_UpDownCasting) acc2;
acc4.loan(100.0);


//BusinessAccount_UpDownCasting acc5 = (BusinessAccount_UpDownCasting) acc3;

        /*
Para evitar o erro temos que testar fazendo o instanceof
 */
if (acc3 instanceof BusinessAccount_UpDownCasting) {
    BusinessAccount_UpDownCasting acc5 = (BusinessAccount_UpDownCasting) acc3;
    acc5.loan(200.0);
    System.out.println("Loan!");
}
/*
falhou no primeiro if - fizemos um novo para fazer o upcasting
correto.
 */
if (acc3 instanceof SavingsAccountUpDownCasting) {
    SavingsAccountUpDownCasting acc5 = (SavingsAccountUpDownCasting) acc3;
acc5.updateBalance();
System.out.println("Update!");
        }
}
}


