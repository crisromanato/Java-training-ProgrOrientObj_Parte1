package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Classes_Metodos_final.Final_Metodos;

/*
Vamos fazer a heranca do saving account.
 */


public class SavingAccountPlus_Final1 extends SavingsAcount_final1 {


    /*
    Exemplo -método final
Suponha que você não queira que o método Withdraw de
SavingsAccount seja sobreposto

VAmos testar inserindo o metodo withdraw (sobreposicao com
outros calculos dentro.

Pra quê?
• Segurança: dependendo das regras do negócio, às vezes
 é desejável garantir que uma classe não seja herdada,
 ou que um método não seja sobreposto.
 Importante:
 • Geralmente convém acrescentar final em métodos
 sobrepostos, pois sobreposições múltiplas podem ser
 uma porta de entrada para inconsistências


• Performance: atributos de tipo de uma classe final são
analisados de forma mais rápida em tempo de execução.
• Exemplo clássico: String



     */

//@Override
    //public void withdraw(double amount) {

       // balance -= amount = 2;
    }
//}
