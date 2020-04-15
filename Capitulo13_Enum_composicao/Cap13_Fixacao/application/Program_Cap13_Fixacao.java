package ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Fixacao.application;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Fixacao.model.entities.Client;
import ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Fixacao.model.entities.Order;
import ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Fixacao.model.entities.OrderItem;
import ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Fixacao.model.entities.Product;
import ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Fixacao.model.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/*
Exercício de fixação
http://educandoweb.com.br
Prof. Dr. Nelio Alves

Ler os dados de um pedido com N itens (N fornecido pelo usuário).
 Depois, mostrar um sumário do pedido conforme exemplo (próxima
  página). Nota: o instante do pedido deve ser o instante do
  sistema: new Date()

Exemplo
Enter cliente data:
Name: Alex Green
Email: alex@gmail.com
Birth date (DD/MM/YYYY): 15/03/1985
Enter order data:
Status: PROCESSING
How many items to this order? 2
Enter #1 item data:
Product name: TV
Product price: 1000.00
Quantity: 1
Enter #2 item data:
Product name: Mouse
Product price: 40.00
Quantity: 2

ORDER SUMMARY:
Order moment: 20/04/2018 11:25:09
Order status: PROCESSING
Client: Alex Green (15/03/1985) - alex@gmail.com
Order items:
TV, $1000.00, Quantity: 1, Subtotal: $1000.00
Mouse, $40.00, Quantity: 2, Subtotal: $80.00
Total price: $1080.00

Você deverá instanciar os objetos em memória da seguinte forma:

Order,
Client
Order Item (2 itens)
Product (2 itens)

https://github.com/acenelio/composition3-java

 */
public class Program_Cap13_Fixacao {

    /*
inclusao da excessao
     */
    public static void main(String[] args) throws ParseException, ParseException {

/*
configuracao basica
 */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
declaracao e instanciacao do simpldeDateFormate
         */
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

/*
entrada de dados pelo usuario
 */

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
/*
entrada de dados usando o simpledateformat
 */
        Date birthDate = sdf.parse(sc.next());
/*
instanciar a classe cliente
 */
        Client client = new Client(name, email, birthDate);
        System.out.println("Enter order data:");
        System.out.print("Status: ");
/*
instanciando o enum para reber o status de string pra enum
 */
        OrderStatus status = OrderStatus.valueOf(sc.next());
        Order order = new Order(new Date(), status, client);
        /*
entrada de dos para novos itens
         */
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        /*
        for para entrada do produto e preco e quantidade
         */

        for (int i=1; i<=n; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            Product product = new Product(productName, productPrice);
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
/*
instanciar um novo item e adiciona-lo
 */
            OrderItem orderItem = new OrderItem(quantity, productPrice, product);
            order.addItem(orderItem);
        }
/*
impressao do resumo da ordem
 */
        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

        sc.close();

    }

}
