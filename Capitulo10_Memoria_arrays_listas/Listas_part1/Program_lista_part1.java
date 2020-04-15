package ProgramacaoOrientadaObjetos_Parte1.Capitulo10_Memoria_arrays_listas.Listas_part1.application;

/*
Checklist
• Conceito de lista
• Tipo List-Declaração, instanciação
• Demo
• Referência: https://docs.oracle.com/javase/10/docs/api/java/util/List.html
• Assuntos pendentes: • interfaces • generics • predicados (lambda)

Listas
• Lista é uma estrutura de dados:
    • Homogênea (dados do mesmo tipo) - exemplo (double, produto, etc)
    • Ordenada (elementos acessados por meio de posições)
    • Inicia vazia, e seus elementos são alocados sob demanda
        O vetor era diferente vc tinha q alocar informando quantos elementos
        ele tem. Na lista nao, vc vai alocando.
    • Cada elemento ocupa um "nó" (ou nodo) da lista
        O nodo é a caixinha que o elemento esta alocado, cada nodo tem o
        elemento e um ponteiro para a proxima caixinha.
        Lista encadeada mostra os nodos.

• Tipo (interface): List
    • Classes que implementam: ArrayList, LinkedList, etc.
    Nota: uma interface nao pode ser instanciada, somente implementada
  Interface é um tipo que define apenas as especificações das operações.


• Vantagens: são os pontos fracos do vetor
    • Tamanho variável
    • Facilidade para se realizar inserções e deleções

• Desvantagens:
    • Acesso sequencial aos elementos *

    * Esse ponto é minimizado dependendo da classe implementada.
    A classe ArrayList por exemplo é um mix entre o vetor e a lista, assim
    algumas ações sao permitidas nela.

 */

public class Program_lista_part1 {
    public static void main(String[] args) {

    }
}
