package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.ClassesMetodosAbstratos.ClassesAbstratas.Case1.application;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.ClassesMetodosAbstratos.ClassesAbstratas.Case1.entities.AccountClassesAbstratas;
import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.ClassesMetodosAbstratos.ClassesAbstratas.Case1.entities.BusinessAcountClassesAbstratas;
import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.ClassesMetodosAbstratos.ClassesAbstratas.Case1.entities.SavingsAccountClassesAbstratas;

/*
Classes abstratas
• São classes que não podem ser instanciadas
• É uma forma de garantir herança total: somente subclasses não abstratas
podem ser instanciadas, mas nunca a superclasse abstrata


Exemplo
Suponha que em um negócio relacionado a banco, apenas contas poupança e
contas para empresas são permitidas. Não existe conta comum.
Para garantir que contas comuns não possam ser instanciadas,
basta acrescentarmos a palavra "abstract" na declaraçãoda classe.
eg.
public abstract class Account { (...)

Vamos partir da implementação em:
https://github.com/acenelio/inheritance3-java

Questionamento • Se a classe Account não pode ser instanciada, por que simplesmente
não criar somente SavingsAccount e BusinessAccount?
• Resposta:
• Reuso
• Polimorfismo:a superclasse classe genérica nos permite tratar de forma fácil e
uniforme todos os tipos de conta, inclusive com polimorfismo se for o caso
(como fizemos nos últimos exercícios).
Por exemplo, você pode colocar todos tipos de contas em uma mesma coleção.

 */
public class ProgramClassesAbstratas {
    /*
criar uma classe noraml acc1 recebendo new Account
Neste exemplo vamos ver que o saque esta sujeito a taxa mencionada no metodo de withdraw
 */
    public static void main(String[] args) {

/*
criado 3 variaveis com tipos account e instanciando com tipos diferentes,
fazendo polimorfismo e upcasting.
agora vamos na classe account e vamos colocar abstract com isso vai gerar
um erro nesta parte do programa pois nao se pode instanciar uma classe abstrata.

 */
        AccountClassesAbstratas acc1 = new AccountClassesAbstratas(
                1001, "Alex", 1000.0);
        AccountClassesAbstratas acc2 = new SavingsAccountClassesAbstratas(
                1002, "Maria", 1000.0, 0.01);
        AccountClassesAbstratas acc3 = new BusinessAcountClassesAbstratas(
                1003, "Bob", 1000.0, 500.0);


    }
}
