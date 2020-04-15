package ProgramacaoOrientadaObjetos_Parte1.Capitulo9_Contrutores_this_Overload_encapsulamento.Contrutores.Case_Product.application;


import ProgramacaoOrientadaObjetos_Parte1.Capitulo9_Contrutores_this_Overload_encapsulamento.Contrutores.Case_Product.entities.Product_Cap9_Constr;

import java.util.Locale;
    import java.util.Scanner;

    public class Program_Construtores {
        public static void main(String[] args) {



            /*
                        Construtor
• É uma operação especial da classe, que executa no momento da instanciação do objeto
• Usos comuns:
• Iniciar valores dos atributos
• Permitir ou obrigar que o objeto receba dados / dependências no momento de sua
 instanciação (injeção de dependência)
 • Se um construtor customizado não for especificado, a classe disponibiliza o construtor
 padrão:
 Product p = new Product();
  • É possível especificar mais de um construtor na mesma classe (sobrecarga)

  Problema exemplo:
 Enter product data:
 Name: TV
 Price: 900.00
 Quantity in stock: 10
Product data: TV, $ 900.00, 10 units, Total: $ 9000.00
Enter the number of products to be added in stock: 5
Updated data: TV, $ 900.00, 15 units, Total: $ 13500.00
Enter the number of products to be removed from stock: 3
Updated data: TV, $ 900.00, 12 units, Total: $ 10800.00



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
* Quando criamos um construtor na outra classe, mudamos as variaveis que irao receber os dados
ao inves de receber via product, iniciamos a variavel com seu tipo e depois inciamos o construtor
             */

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter product data: ");
            System.out.print("Name: ");
            String name = sc.nextLine(); //*
            System.out.print("Price: ");
            Double price = sc.nextDouble(); //*
            System.out.print("Quantity in stock: ");
            int quantity = sc.nextInt(); //*
            Product_Cap9_Constr product = new Product_Cap9_Constr(name, price, quantity); //*

            System.out.println();
            System.out.println("Product data: " + product);

            System.out.println();

            System.out.println("Enter the number of produts to be added in stock: ");
            quantity = sc.nextInt();
            product.addProducts(quantity);


            System.out.println("Updated data: " + product);
            System.out.println();

            System.out.println("Enter the number of produts to be removed from stock: ");
            quantity = sc.nextInt();
            product.removeProducts(quantity);


            System.out.println("Updated data: " + product);

            System.out.println();



            sc.close();
        }
    }
