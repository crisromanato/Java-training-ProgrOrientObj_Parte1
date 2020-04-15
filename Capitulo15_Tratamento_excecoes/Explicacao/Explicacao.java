package ProgramacaoOrientadaObjetos_Parte1.Capitulo15_Tratamento_excecoes.Explicacao;
/*
Exceções
• Uma exceção é qualquer condição de erro ou comportamento inesperado
encontrado por um programa em execução

• Em Java, uma exceção é um objeto herdado da classe:
• java.lang.Exception-o compilador obriga a tratar ou propagar
• java.lang.RuntimeException-o compilador não obriga a tratar ou propagar

• Quando lançada, uma exceção é propagada na pilha de chamadas
de métodos em execução, até que seja capturada (tratada) ou o
programa seja encerrado.

Hierarquia de exceções do Java

https://docs.oracle.com/javase/10/docs/api/java/lang/package-tree.html

Throwable (superclasse)

Error (sao erros que o programador nao vai tratar)
    OutOfMemoryError
        - estouro de memoria. o programa quebra e nao tem
            como tratar
    VirtualMachineError
        - erro inexperado que o programa nao tem como tratar


Exception (classe principal)
    IOException
        - erro de entrada e saida no programa
    RuntimeException
        - nao necessariamente tem q tratar eg:
            IndexOutOfBoundsException - quando seu Array tenta
                acessar uma posicao que nao existe.
            NullPointerException
                - quando tenta acessar uma variavel que esta valendo
                nulo.

Pequena amostra acima. Existem outras

Por que exceções?
• O modelo de tratamento de exceções permite que erros sejam tratados
de forma consistente e flexível, usando boas práticas

• Vantagens:
• Delega a lógica do erro para a classe responsável por conhecer as
regras que podem ocasionar o erro
    e. saque conta bancaria, somente se tiver saldo, assim a classe
    responsavel trata o erro.
• Trata de forma organizada (inclusive hierárquica) exceções de
tipos diferentes
    Podemos ordenar as excecoes
• A exceção pode carregar dados quaisquer





 */
public class Explicacao {
}
