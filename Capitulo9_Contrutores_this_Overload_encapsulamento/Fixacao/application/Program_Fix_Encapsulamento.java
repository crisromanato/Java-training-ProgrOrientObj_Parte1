package ProgramacaoOrientadaObjetos_Parte1.Capitulo9_Contrutores_this_Overload_encapsulamento.Fixacao.application;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo9_Contrutores_this_Overload_encapsulamento.Fixacao.entities.Account1;

import java.util.Locale;
import java.util.Scanner;

public class Program_Fix_Encapsulamento {
    public static void main(String[] args) {
        /*
        iniciar config basicas : locale + scanner
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

         /*
        Declarar variavel para ser usada no programa.

         */
        Account1 account;

         /*
         entrada para o usuario colocar o numero da conta
         */

        System.out.print("Enter account number: ");
        int number = sc.nextInt(); // variavel temporaria

        /*
         entrada para o usuario colocar o titular da conta
         nota considerar o nextline para consumir a quebra de
         linha devido termos uma entrada do tipo int
         anteriormente.
         aprendemos em algoritmos.
         */

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine(); // variavel temporaria

        /*
         entrada para o usuario informar se a conta é inicial
         e adicionar deposito dependendo da resposta
         */

        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0); // ler o caracter
        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble(); // variavel temporaria
            account = new Account1(number, holder, initialDeposit);  // instanciada a conta utilizando o construtor de
                                                                    // 3 argumentos (sobrecarga)
        }
        else {
            account = new Account1(number, holder); // instanciamento de 2 argumentos - sobrecarga
        }

         /*
          Nota: neste ponto é importante ter o toString, para que a impressao do accont seja feita com os valores
          correto, do contratio vai imprimir valores desconexos.
          Para isso dentro do account foi inserido um metodo para formatar o resultado da variavel "account"para
          toString
         */

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        /*
         entrada para novo deposito
        */

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble(); // depositValue recebe o valor depositado - variavel temporaria
        account.deposit(depositValue); // operacao que realiza o deposito na conta

        /*
         saida de update
         */
        System.out.println("Updated account data:");
        System.out.println(account);

        /*
         entrada para o saque
         */
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble(); // withdrawValue recebe o valor do saque - variavel temporaria
        account.withdraw(withdrawValue); // operacao que realiza o saque na conta

        /*
         saida para update
         */
        System.out.println("Updated account data:");
        System.out.println(account);

         /*
        fim
         */

        sc.close();

    }
}
