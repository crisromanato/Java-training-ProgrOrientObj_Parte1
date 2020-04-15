package ProgramacaoOrientadaObjetos_Parte1.Capitulo9_Contrutores_this_Overload_encapsulamento.This;



public class Product_This {
    public static void main(String[] args) {

    }
        /*

         Palavra this
• É uma referência para o próprio objeto
• Usos comuns:
    • Diferenciar atributos de variáveis locais
    • Passar o próprio objeto como argumento na chamada de um método ou construtor


        Atributos
         */
        public String name;
        public double price;
        public int quantity;

        /* quando fazemos essa chamada do new o construtor é chamado.
        E os dados sao copiados dos parametros para a memoria.
        Quando falo name = é a variavel local do construtor - parametro.
        Quando falo this.name = é o name do objeto.

         */
Product_This product = new Product_This(name, price, quantity);

/*
Construtor
 */
    public Product_This(String name, double price, int quantity) {
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


        }

