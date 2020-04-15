package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Sobreposicao_Super_Override.application;
/*
Sobreposição, palavra super, anotação @Override
http://educandoweb.com.br
Prof. Dr. Nelio Alves

Sobreposição ou sobrescrita
• É a implementação de um método de uma superclasse na subclasse
• É fortemente recomendável usar a anotação @Overrideem um
método sobrescrito • Facilita a leitura e compreensão do
código
• Avisamos ao compilador (boa prática)

eg. temos o metodo withdraw na superclasse, podemos reimplementar
o mesmo metodo na subclasse para definir um comportamento
diferente. Isso pode ser feito via sobreposicao

Eg.
Temos uam superclasse - account
Duas subclasses - business e savings

Suponha que a operação de saque possui uma taxa no valor de 5.0.
 Entretanto, se a conta for do tipo poupança, esta taxa não
 deve ser cobrada.

Como resolver isso?
Resposta: sobrescrevendo o método withdraw na subclasse
SavingsAccount


https://github.com/acenelio/inheritance3-java

 */

import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Sobreposicao_Super_Override.entities.AccountSobreposicao_Super_Override;
import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Sobreposicao_Super_Override.entities.BusinessAccountSobreposicao_Super_Override;
import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Sobreposicao_Super_Override.entities.SavingsAccountSobreposicao_Super_Override;

public class ProgramSobreposicao_Super_Override {

/*
criar uma classe noraml acc1 recebendo new Account
Neste exemplo vamos ver que o saque esta sujeito a taxa mencionada no metodo de withdraw
 */
    public static void main(String[] args) {

        AccountSobreposicao_Super_Override acc1 = new AccountSobreposicao_Super_Override(
                1001, "Alex", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

/*
Fazer um upcasting - mostrando um exemplo da sobreposicao
A variavel pode ser tanto account quanto saving account.
No caso abaixo podemos ver que a sobreposicao fez o processamento sem a taxa.
 */
        AccountSobreposicao_Super_Override acc2 = new SavingsAccountSobreposicao_Super_Override(
                1002, "Maria", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

/*
A variavel abaixo mostra um exemplo do uso da sobreposicao usando o super
No caso abaixo podemos ver que a sobreposicao utilizando o super fez o processamento
considerando a taxa da classe account e também a taxa da subclasse.
 */
        AccountSobreposicao_Super_Override acc3 = new BusinessAccountSobreposicao_Super_Override(
                1003, "Bob", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());
    }
}
