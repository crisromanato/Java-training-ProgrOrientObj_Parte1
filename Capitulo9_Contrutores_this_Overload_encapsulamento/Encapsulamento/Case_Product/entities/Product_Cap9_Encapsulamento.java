package ProgramacaoOrientadaObjetos_Parte1.Capitulo9_Contrutores_this_Overload_encapsulamento.Encapsulamento.Case_Product.entities;

public class Product_Cap9_Encapsulamento {
    /*
PROPOSTA DE MELHORIA
Encapsular os dados e usar os getters e setters


Steps:
1. mudar os atributos de public para private
    Quando faço isso se eu por exemplo fizer uma entrada na classe programa para mudar o
    o nome do produto de X para Y ele vai dar um erro dizendo que o atributo e private e
    nao pode ser usado.
    eg. a ser inserido para teste na classe program:
    product.name = "Y";
    após tratar o atributo name criando o set and get
2. price - fazer o mesmo do name
    2. qtt
    O qt iremos criar somente o get, pois o set é feito pelo metodo add e remove
    nao posso ir direto e alterar a qt do produto em estoque, regra de negocio
    que protege a integridade do produto, por isso, fazemos somente via metodo e nao
    via set.
       */

        private String name; //1
        private double price; //1
        private int quantity; //1


public Product_Cap9_Encapsulamento(){

}

    public Product_Cap9_Encapsulamento(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product_Cap9_Encapsulamento(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
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
