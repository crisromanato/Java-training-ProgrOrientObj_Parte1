package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Polimorfismo.Polimorfismo.application_polimorfismo;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Polimorfismo.Polimorfismo.entities_polimorfismo.AccountPolimorfismo;
import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Polimorfismo.Polimorfismo.entities_polimorfismo.SavingsAccountPolimorfismo;


public class ProgramPolimorfismo {


    /*
    Polimorfismo
    chamei a mesma operacao em variavies do mesmo tipo
    com objetos diferentes, tendo assim comportamentos
    diferente dependendo do ojeto aos quais elas apontam.

Importante entender:
Importante entender
• A associação do tipo específico com o tipo genérico é feita
 em tempo de execução (upcasting).
• O compilador não sabe para qual tipo específico a chamada
do método Withdraw está sendo feita (ele só sabe que são
duas variáveis tipo Account):

Account x = new Account(1020, "Alex", 1000.0);
 Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

x.withdraw(50.0);
y.withdraw(50.0);

     */
    public static void main(String[] args) {

        AccountPolimorfismo x = new AccountPolimorfismo(1020, "Alex", 1000.0);
        AccountPolimorfismo y = new SavingsAccountPolimorfismo(1023, "Maria", 1000.0, 0.01);


        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
