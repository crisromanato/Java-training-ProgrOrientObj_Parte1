package ProgramacaoOrientadaObjetos_Parte1.Capitulo9_Contrutores_this_Overload_encapsulamento.Encapsulamento.Case_Product.application;


import ProgramacaoOrientadaObjetos_Parte1.Capitulo9_Contrutores_this_Overload_encapsulamento.Encapsulamento.Case_Product.entities.Product_Cap9_Encapsulamento;

import java.util.Locale;
    import java.util.Scanner;

    public class Program_Encapsulamento {
        public static void main(String[] args) {



            /*
                        Encapsulamento
• É um princípio que consiste em esconder detalhes de implementação de uma classe, expondo
apenas operações seguras e que mantenham os objetos em um estado consistente.
• Regra de ouro: o objeto deve sempre estar em um estado consistente, e a própria classe
deve garantir isso.

Regra geral básica
• Um objeto NÃOdeve expor nenhum atributo (modificador de acesso private)
• Os atributos devem ser acessados por meio de métodos get e set
• Padrão JavaBeans: https://en.wikipedia.org/wiki/JavaBeans

Padrão para implementação de getters e setters
private String name;
private double price;

* get + nome do atributo em Camel case
public String getName() {
return name;
 }
 * set + nome do atributo em Camel case
 ** metodo set nao retorna nada (void) e recebe o valor do atributo por isso (this.name = name)
public void setName(String name) {
this.name = name;
 }
public double getPrice() {
 return price;
  }
public void setPrice(double price) {
 this.price = price;
 }

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
Encapsular os dados e usar os getters e setters

Steps:
* Quando criamos um construtor na outra classe, mudamos as variaveis que irao receber os dados
ao inves de receber via product, iniciamos a variavel com seu tipo e depois inciamos o construtor

             1. tratar o atributo name

             */

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter product data: ");
            System.out.print("Name: ");
            String name = sc.nextLine(); //*
            System.out.print("Price: ");
            double price = sc.nextDouble(); //*
            //System.out.print("Quantity in stock: ");
            //int quantity = sc.nextInt(); //*
            Product_Cap9_Encapsulamento product = new Product_Cap9_Encapsulamento(name, price); //*

            //product.name = "Y"; exemplo para teste atributo private.

            product.setName("Computer");
            System.out.println("Updated name: " + product.getName());

            product.setPrice(1200.0);
            System.out.println("Updated price: " + product.getPrice());

            System.out.println();
            System.out.println("Product data: " + product);

            System.out.println();

            System.out.println("Enter the number of produts to be added in stock: ");
            int quantity = sc.nextInt();
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
