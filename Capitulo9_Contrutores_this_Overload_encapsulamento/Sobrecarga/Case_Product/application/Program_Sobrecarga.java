package ProgramacaoOrientadaObjetos_Parte1.Capitulo9_Contrutores_this_Overload_encapsulamento.Sobrecarga.Case_Product.application;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo9_Contrutores_this_Overload_encapsulamento.Sobrecarga.Case_Product.entities.Product_Sobrecarga;

import java.util.Locale;
    import java.util.Scanner;

    public class Program_Sobrecarga {
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

  Sobrecarga
• É um recurso que uma classe possui de oferecer mais de uma operação com o mesmo nome,
 porém com diferentes listas de parâmetros.

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



Proposta de melhoria
• Vamos criar um construtor opcional, o qual recebe apenas nome e preço do produto. A quantidade em estoque deste novo produto, por padrão, deverá então ser iniciada com o valor zero.
• Nota: é possível também incluir um construtor padrão


Steps:
1. vamos apagar a parte que chama a qt no estoque e mudar a parte do quantity no codigo
2. chamar o construtor com dois argumentos apenas.
3. declarar o quantity na adicao de produtos.
             */

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter product data: ");
            System.out.print("Name: ");
            String name = sc.nextLine(); //*
            System.out.print("Price: ");
            double price = sc.nextDouble(); //*
            //System.out.print("Quantity in stock: "); // 1
            //int quantity = sc.nextInt(); //* - //1
            Product_Sobrecarga product = new Product_Sobrecarga(name, price); //* - //2

            //Product prod = new Product(); exemplo para construtor padrao

            System.out.println();
            System.out.println("Product data: " + product);

            System.out.println();

            System.out.println("Enter the number of produts to be added in stock: ");
            int quantity = sc.nextInt();  // 3
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
