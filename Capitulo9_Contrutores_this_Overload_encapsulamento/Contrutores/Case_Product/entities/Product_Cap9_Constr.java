package ProgramacaoOrientadaObjetos_Parte1.Capitulo9_Contrutores_this_Overload_encapsulamento.Contrutores.Case_Product.entities;

public class Product_Cap9_Constr {

        /*
        Atributos
         */
        public String name;
        public double price;
        public int quantity;

        /*
    PROPOSTA DE MELHORIA
Quando executamos o comando abaixo, instanciamos um produto "product" com seus atributos “vazios” :
product=newProduct();
name = null
price = 0.0
quantity = 0

Entretanto,faz sentido umproduto que não tem nome?
Faz sentido um produto que não tem preço?
Com o intuito de evitar a existência de produtos sem nome e sem preço, é possível fazer com que
seja “obrigatória” a iniciação desses valores? Como = via definicao no construtor

ex. de impressao
  System.out.println("Ex valores instanciados como valores vazios na classe product : ");
            System.out.println(product.name); // null
            System.out.println(product.price); // 0.0
            System.out.println(product.quantity); // 0


Steps:
1. Adicionar um construtor logo abaixo dos atributos
         */
public Product_Cap9_Constr(){

}



    public Product_Cap9_Constr(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
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
