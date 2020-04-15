    package ProgramacaoOrientadaObjetos_Parte1.Capitulo8_Introducao.Case_Product.application;

    import ProgramacaoOrientadaObjetos_Parte1.Capitulo8_Introducao.Case_Product.entities.Product_Cap8;

    import java.util.Locale;
    import java.util.Scanner;

    public class Program_Case_Product {
        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            /*
            Declarar variavel do tipo product.
            Product maiusculo = o tipo da variavel
            product minusculo = nome da variavel
            = é o recebe
            new Product () é o instanciamento da variavel.
             */

            Product_Cap8 product = new Product_Cap8();

            /*
            Fazer a interacao com o usuario inserindo a msg para add produto
             */
            System.out.println("Enter product data: ");
            System.out.print("Name: ");

            /*
            para incluir o name dentro da variavel product vamos criar uma variavel
             */
            product.name = sc.nextLine(); // com isso vou armazenar o campo name na variavel prod.
            System.out.print("Price: ");
            product.price = sc.nextDouble();
            System.out.print("Quantity in stock: ");
            product.quantity = sc.nextInt();


            System.out.println("\nfields: name, price and qt - sem toString - :\n" + product.name + ", " + product.price + ", " + product.quantity);

              /*
            O metodo abaixo serve para permitir que eu faça a impressao com os valores em String
            caso nao faça isso quando faço a impressao da variavel product. a impressao
            vem com informacao desconexa.
            Note que tanto colocando o println somente com a variavel ou com o nome da funcao
            o java reconhece que foi criado uma funcao para transformar o dado.
             */
            System.out.println("Impressao com funcao toString:");
            System.out.println(product.toString());

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
