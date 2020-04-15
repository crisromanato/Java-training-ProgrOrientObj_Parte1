package ProgramacaoOrientadaObjetos_Parte1.Capitulo9_Contrutores_this_Overload_encapsulamento.Fixacao;

public class Descritivo_Construtores {
    /*
    Em um banco, para se cadastrar uma conta bancária, é necessário informar:
     **Atributos :
     o número da conta (number), o nome do titular da conta (holder), e o valor de depósito inicial
     (initialDeposit)que o titular depositou ao abrir a conta.

    ** Contrutores: (1 sem deposito inicial e e outro com)
    ** Metodos complementares: (criar metodo para deposit)
    Este valor de depósito inicial, entretanto, é opcional, ou seja: se o titular não
    tiver dinheiro a depositar no momento de abrir sua conta, o depósito inicial não
    será feito e o saldo inicial da conta será, naturalmente, zero.

** Somente get pode ser usado para a conta (number)
Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado.
Já o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento,
 por exemplo).

 ** Somente get pode ser usado para saldo (balance)
Por fim, o saldo da conta não pode ser alterado livremente.
É preciso haver um mecanismo para proteger isso.

** Metodos para deposito e saque
O saldo só aumenta por meio de depósitos, e só diminui por meio de saques.
Para cada saque realizado, o banco cobra uma taxa de $ 5.00.
Nota: a conta pode ficar com saldo negativo se o saldo não for suficiente para realizar o saque
e/ou pagar a taxa.

** criar entrada no programa principal
Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
 informado o valor de depósito inicial.
 Em seguida, realizar um depósito e depois um saque, sempre mostrando os dados da conta após cada
 operação.

 EXAMPLE 1
Enter account number: 8532
Enter account holder: Alex Green
Is there na initial deposit (y/n)? y
Enter initial deposit value: 500.00

Account data:
Account 8532, Holder: Alex Green, Balance: $ 500.00

Enter a deposit value: 200.00
Updated account data:
Account 8532, Holder: Alex Green, Balance: $ 700.00

Enter a withdraw value: 300.00
Updated account data:
Account 8532, Holder: Alex Green, Balance: $ 395.00


EXAMPLE 2
Enter account number: 7801
 Enter account holder: Maria Brown
 Is there na initial deposit (y/n)? n

Account data:
Account 7801, Holder: Maria Brown, Balance: $ 0.00

Enter a deposit value: 200.00
Updated account data:
Account 7801, Holder: Maria Brown, Balance: $ 200.00

Enter a withdraw value: 198.00
Updated account data:
 Account 7801, Holder: Maria Brown, Balance: $ -3.00


 Correcao: https://github.com/acenelio/encapsulation1-java
     */
}
