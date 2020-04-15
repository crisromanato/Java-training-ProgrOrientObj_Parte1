package ProgramacaoOrientadaObjetos_Parte1.Capitulo9_Contrutores_this_Overload_encapsulamento.Sobrecarga.Case_Product.entities;

public class Product_Sobrecarga {

        /*
        Atributos
         */
        public String name;
        public double price;
        public int quantity;

        /*
      Proposta de melhoria
• Vamos criar um construtor opcional, o qual recebe apenas nome e preço do produto.
A quantidade em estoque deste novo produto, por padrão, deverá então ser iniciada com
 o valor zero.
• Nota: é possível também incluir um construtor padrão


Steps:
1. Adicionar um construtor padrao
2. construtor ja existente com 3 atributos
3. consturor com dois atributos
         */
public Product_Sobrecarga(){ //1

}



    public Product_Sobrecarga(String name, double price, int quantity) { // 2
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product_Sobrecarga(String name, double price) { //1 este é o construtor para o valor 0 na qt.
        this.name = name;
        this.price = price;
        // this.quantity = 0; isto nao e necesario - o java inicia numeros e arrays com 0
    }

        /*
        criar os metodos / operacoes
         */

        public double totalValueInStock(){
            return price * quantity;
        }
    /*
    A operacao add nao vai retornar nada, só vai acumular o valor
    esse metodo recebe um valor entao temos que declarar o qeu vai ser recebido
    no caso dentro do parametros colocamos (int quantity)
     */

        public void addProducts(int quantity){
            /*
            implementar a a operacao
            note que eu tenho que acumular a quantidade, mas eu tenho o "quantity"
            como atributo e também como parametro, neste caso temos uma ambiguidade
            ambiguidade = que pode ter mais de um significado.
            para diferenciar isto usamos em java a palavra this.
            com isto o programa entende que estamos referenciando o atributo e nao
            o parametro em si.

           Entao criamos a implementacao dizendo
           this.quantity = (recebe) que já tinha nele + o quantity que chegou como
           parametro.

             */
        this.quantity += quantity; // ou  this.quantity = quantity + quantity;
        }

        public void removeProducts(int quantity){
            /*
            implementar a a operacao

             */
            this.quantity -= quantity; // ou  this.quantity = quantity - quantity;
        }

        /*
        O metodo abaixo serve para permitir que eu faça a impressao com os valores em String
        caso nao faça isso quando faço a impressao da variavel product. a impressao
        vem com informacao desconexa.

         */
        public String toString() {
            return name
                    + ",  $ "
                    + String.format("%.2f", price)
                    + ", "
                    + quantity
                    + " units, Total: $ "
                    + String.format("%.2f", totalValueInStock());

        }

    }
