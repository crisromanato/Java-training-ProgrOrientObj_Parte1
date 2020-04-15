package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Polimorfismo.Polimorfismo.Cap14_Fixacao_Polimorfismo.application;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Polimorfismo.Polimorfismo.Cap14_Fixacao_Polimorfismo.entities.ImportedProductCap14_Fixacao;
import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Polimorfismo.Polimorfismo.Cap14_Fixacao_Polimorfismo.entities.ProductCap14_Fixacao;
import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Polimorfismo.Polimorfismo.Cap14_Fixacao_Polimorfismo.entities.UsedProductCap14_Fixacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Exercício de fixação - Polimorfismo

Fazer um programa para ler os dados de N produtos
(N fornecido pelo usuário).
Ao final, mostrar a etiqueta de preço de cada
produto na mesma ordem em que foram digitados.
Todo produto possui nome e preço. Produtos
 importados possuem uma taxa de alfândega, e
 produtos usados possuem data de fabricação.
 Estes dados específicos devem ser acrescentados
 na etiqueta de preço conforme exemplo (próxima
 página). Para produtos importados, a taxa e
 alfândega deve ser acrescentada ao preço final
 do produto.

 Favor implementar o programa conforme projeto:
 Classe produto (super)
    - name e price (metodo +price tag)
 ImportedProduct (sub)
    - customsFee (metodo + price tag + total price)
 UsedProduct (sub)
    - manufatured date (Metodo + price tag)

Exemplo:
 Enter the number of products: 3
 Product #1 data:
 Common, used or imported (c/u/i)? i
 Name: Tablet
 Price: 260.00
 Customs fee: 20.00

 Product #2 data:
 Common, used or imported (c/u/i)? c
 Name: Notebook
 Price: 1100.00

 Product #3 data:
 Common, used or imported (c/u/i)? u
 Name: Iphone
 Price: 400.00
 Manufacture date (DD/MM/YYYY): 15/03/2017

PRICE TAGS:
Tablet $ 280.00 (Customs fee: $ 20.00)
Notebook $ 1100.00
Iphone (used) $ 400.00 (Manufacture date: 15/03/2017)

https://github.com/acenelio/inheritance5-java

 */
public class ProgramCap14_Fixacao {
    public static void main(String[] args) throws ParseException, ParseException {

/*
configuracao basica
 */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*

         */

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

/*

 */

        List<ProductCap14_Fixacao> list = new ArrayList<>();

/*

 */

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

/*

 */
        for (int i=1; i<=n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
/*

 */
            if (type == 'c') {
                list.add(new ProductCap14_Fixacao(name, price));
            }
            else if (type == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.next());
                list.add(new UsedProductCap14_Fixacao(name, price, date));
            }
            else {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProductCap14_Fixacao(
                        name, price, customsFee));
            }
        }


        System.out.println();
        System.out.println("PRICE TAGS:");

        /*
        laco for each
         */
        for (ProductCap14_Fixacao prod : list) {
            System.out.println(prod.priceTag());
        }


        sc.close();

    }
}

