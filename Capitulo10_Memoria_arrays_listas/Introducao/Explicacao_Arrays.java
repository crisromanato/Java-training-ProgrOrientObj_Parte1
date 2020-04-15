package ProgramacaoOrientadaObjetos_Parte1.Capitulo10_Memoria_arrays_listas;

public class Explicacao_Arrays {
    /*
    ************** Classes são tipos referência
Variáveis cujo tipo são classes não devem ser entendidas como caixas,
mas sim “tentáculos” (ponteiros) para caixas
Product p1, p2;
p1 = new Product("TV", 900.00, 0);
p1 = fica na stack da memoria (somente endereço)
new Product("TV", 900.00, 0); - fica na heap da memoria

p2 = p1;


p2 = p1; "p2 passa a apontar para onde p1 aponta"
Também como endereço


    ***************** Valor "null"
Tipos referência aceitam o valor "null", que indica que a variável aponta pra ninguém.
Product p1, p2;
p1 = new Product("TV", 900.00, 0);
p2 = null;
*
* pode ser iniciado assim sem nenhum problema
*

    ****************** Tipos primitivos são tipos valor
Em Java, tipos primitivos são tipos valor. Tipos valor são CAIXAS e não ponteiros.
lembrando que os tipos valores ficam armazenados na stack da memoria como valor e nao como ponteiro

temos 8 tipos primitivos
boollean - true or false
char - unicode character
byte, short, int, long - Signed integer
float, double. - IEEE 754 floating point

double x, y;
x = 10;
y = x;
y = x; "y recebe uma CÓPIA de x"]

nota: para imprimir uma variavel valor, temos que sempre inicializa-la, nao podemos só declara-la
do contrario o compilador do java da um erro, pois a mesma nao foi inicializada.


    ***************Valores padrão
• Quando alocamos (new) qualquer tipo estruturado (classe ou array),
são atribuídos valores padrão aos seus elementos
    • números: 0
    • boolean: false
    • char: caractere código 0
    • objeto: null

 Product p = new Product();


Memória:
p fica como: null  0.0  0 para os atributos : name price quantity por exemplo

***************** RESUMO

**************** Tipos referência vs. tipos valor
CLASSE                                              TIPO PRIMITIVO
Vantagem:usufrui de todos recursos OO               Vantagem:é mais simples e mais performático
pode ter heranca, encaps, polimorf, etc)            (eg. imagem) economica memoria em bites
                                                    porém nao usufrui dos recursos OO.
------------------------------------------------------------------------------------------------
Variáveis são ponteiros                             Variáveis são caixas
------------------------------------------------------------------------------------------------
Objetos precisam ser instanciados usando new,       Não instancia. Uma vez declarados, estão prontos
ou apontar para um objeto já existente.             para uso.
------------------------------------------------------------------------------------------------
Aceita valor null                                   Não aceita valor null Y= X;
------------------------------------------------------------------------------------------------
"Y passa a apontar para onde X aponta" Y = X;       "Y recebe uma cópia de X"
Objetos instanciados no heap (tempo de execucao)   "Objetos" - variavel com caixinha com valor
                                                    - instanciados no stack
 ------------------------------------------------------------------------------------------------
Objetos não utilizados são desalocadosem um         "Objetos"são desalocados imediatamente quando
momento próximo pelo garbage collector              seu escopo de execução é finalizado
------------------------------------------------------------------------------------------------

****************** Desalocação de memória garbagecollector e escopo local
Garbage collector
• É um processo que automatiza o gerenciamento de memória de um programa em execução
• O garbage collector monitora os objetos alocados dinamicamente pelo programa (no heap),
 desalocando aqueles que não estão mais sendo utilizados.


Product p1, p2;
p1 = new Product("TV", 900.00, 0);
p2 = new Product("Mouse", 30.00, 0);

p1 = p2

quando fazemos p1 recebe p2 = o garbage collector desaloca a memoria do heap usada pelo p1 e aloca
no p2.


***************** VETORES

Checklist
• Revisão do conceito de vetor
• Declaração e instanciação
• Manipulação de vetor de elementos tipo valor (tipo primitivo)
• Manipulação de vetor de elementos tipo referência (classe)
• Acesso aos elementos
• Propriedade length


Vetores
• Em programação, "vetor" é o nome dado a arranjos unidimensionais

• Arranjo (array) é uma estrutura de dados:
    • Homogênea (dados do mesmo tipo)
    • Ordenada (elementos acessados por meio de posições)
    • Alocada de uma vez só, em um bloco contíguo de memória

• Vantagens:
   • Acesso imediato aos elementos pela sua posição (se eu informar que quero
   ir na posicao 500, ele vai direto, sem percorrer a lista inteira
• Desvantagens:
    • Tamanho fixo
    • Dificuldade para se realizar inserções e deleções

     */
}
