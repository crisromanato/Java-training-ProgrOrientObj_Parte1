package ProgramacaoOrientadaObjetos_Parte1.Capitulo10_Memoria_arrays_listas.Listas_part2.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/* Listas - parte 2
Demo
• Tamanho da lista: size()
• Obter o elemento de uma posição: get(position)
• Inserir elemento na lista: add(obj), add(int, obj)
• Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
• Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)
• Filtrar lista com base em predicado:
    List<Integer> result = list.stream().filter(x -> x > 4).
    collect(Collectors.toList());
• Encontrar primeira ocorrência com base em predicado:
    Integer result = list.stream().filter(x -> x > 4).
    findFirst().orElse(null);

• Assuntos pendentes:
• interfaces
• generics
• predicados (lambda)



 */
public class Program_lista_part2 {
    public static void main(String[] args) {
/*
Declarar uma lista de numeros inteiros
usar o import java.util.List;

A lista diferente do vetor nao aceita tipos primitivos
Eu tenho que usar o Wrapper e veja que quando eu uso o simbolo <> é o
generics:
que é quando vc pode parametrizar a definicao de um tipo informando
o outro tipo especifico que voce quiser.
Outro ponto importante uma simples declaracao da listanao permite
que a lista seja utilizada ela tem que ser instanciada.
List<Integer> list;

Exemplo de instanciamento abaixo:
Note que o java nao permite que eu instancie uma lista direto, por se tratar
de uma interface, tenho que colocar uma classe que implemente uma interface

Vamos usar o ArrayList e importar essa classe tambem.
A ArrayList pega as melhores caracteristicas do vetor e da list- ela é
otimizada.

Nota: até o JavA 7.0 usava-se colocar a informação do tipo eg. "String" também
dentro do simbolo <> da classe que implementa uma list eg.
List<String> list = new ArrayList<>(String);
Porém após a versão 8.0 isto nao é mais necessário.
 */
        List<String> list = new ArrayList<>();
/*
Adicionar elementos a essa list (usa a operação List.add("elemento"))
 */
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        /*
Adicionar elementos a essa list com posicao definida
(usa a operação List.add(index, elemento)) - trata-se de uma sobrecarga
 */
        list.add(2, "Marco");

          /*
Imprimir o tamanho da lista usamos - list.size()
 */
        System.out.println(list.size());

        /*
        O for each abaixo se le:
        Para cada string x contido na minha lista "List", faça - no caso ler x
         */

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("---------------------");

        /*
Para remover um elemento da lista - eg. elemento "Anna"
list.remove("Anna");
perceba que esta Anna é outra instancia dentro do programa, porém ele
reconhece e remove. Ou seja a lista é capza de comparar dado e remover.

Outro exemplo de remocao - remover com predicado.
Para remover um elemento da lista - eg. elementos iniciados com M

Para remover com predicado usamos: list.removeIf
dentro do parenteses colocamos um predicado.
eg. a minha lista trabalha com string, entao vou ter q montar um predicado
que trabalhe com string.
eg. remover todo string 'x' tal que simbolo '->' x.chartAt(0) seja
             igual a 'M'.
list.removeIf(x -> x.charAt(0) == 'M');
e embaixo eu coloco o for each que devera ser percorrido.
for (String x : list) {
            System.out.println(x);

Nota a parte da funcao: x -> x.charAt(0) == 'M' -- trata-se de uma funcao
Lambda que vamos aprender ainda. Mas esta funcao em particular chama-se
predicado:
É uma funcao que vai retornar em verdadeiro ou falso.

No final estamos falando:
Pega um valor x e me retorna de esse x.charAt(0) == 'M', essa resposta vai
dar verdadeiro ou falso.

         */
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("---------------------");

        /*
 Encontrar a posicao de um elemento  = list.indexOf
 Quando encontra traz o numero da posicao em que o elemento se encontra.
         */
        System.out.println("Index of Bob: " + list.indexOf("Bob"));

         /*
 Encontrar a posicao de um elemento  = list.indexOf
 exemplo de quando nao encontra o elemento - ele retorna -1.
         */

        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("---------------------");

        /*
Quero deixar na lista (filtrar) somente que tem um determinado dado.
eg. filter
filter(x -> x.charAt(0) == 'A')
Para fazer isso tenho que declarar uma nova list e colocar um comando para
filtrar.
Para declarar: vou criar uma nova lista e chamar de result.
List<String> result
Para filtrar:
comando para pegar a lista original, filtrar somente os elementos que
começam por exemplo com A e devolver uma nova lista somente com esses itens.
Vamos pegar a lista com list. e converter ela para um tipo stream.
Esse tipo stream  é um tipo especial do Java 8 em diante que aceita operaçoes
 com expressao lambda.
 A partir do stream(). vamos chamar a funcao filter e o filter recebe um predicado.
 Vamos usar um predicado: entre parenteses.
  (x -> x.charAt(0) == 'A').
  O filter vai devolver um stream filtrado conforme o predicado, porém o stream
  não é compativel com a lista. sendo assim temos que converte-lo para lista.
  Para convertar para lista vamos chamar a funcao . collect(Collectors.toList()

O código é longo, mas é o jeito que o Java 8 encontrou de para manter a
compatibilidade com o List que era um tipo antigo e permitir que eu possa
fazer operações de Lambda com o tipo List.

Primeiro converto pra stream > faço a operaçao de filtro com a Lambda > volto para list.

  Note que sempre ao fim de cada chamada temos um ponto.

         */

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
/*
imprimindo a nova lista result usando o for each
 */
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("---------------------");

        /*
        Abaixo vamos fazer um outro processo
        Encontrar um elemento da lista que atenda um certo predicado.
        eg. quero encontrar o primeiro elemento que comece com a letra (x)
        Cada elemento da minha lista é do tipo string.
        Entao temos que declarar uma variavel do tipo string.
        eg. String name
        Para encontrar esse elemento que comecaç com a letra (x) temos que fazer a
        variavel receber:
        list.stream()
        após o stream vamos chamar o filter (predicado):
        .filter(x -> x.charAt(0) == 'J')
        após o filter vamos chamar a função: findFirst()
        ele vai pegar o primeiro elemento desta stream
        Essa funcao vai retornar um optional String (tema de funcao Lambda que
        vamos ver mais a frente)
        após o findFirst vamos chamar a função: orElse passando null orElse(null);
        ou seja, caso nao encontre retorne null.

         */

        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        String name1 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        /*
testar a impressao da variavel acima:
 */
        System.out.println(name);
        System.out.println(name1);
    }
    }

