package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.ClassesMetodosAbstratos.Cap14_FixacaoClassesMetodosAbst.application;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.ClassesMetodosAbstratos.Cap14_FixacaoClassesMetodosAbst.entities.CompanyFixClassesMetodosAbstr;
import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.ClassesMetodosAbstratos.Cap14_FixacaoClassesMetodosAbst.entities.IndividualFixClassesMetodosAbstr;
import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.ClassesMetodosAbstratos.Cap14_FixacaoClassesMetodosAbst.entities.TaxPayerFixClassesMetodosAbstr;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/*

Exercício de fixação
http://educandoweb.com.br
Prof. Dr. Nelio Alves

Fazer um programa para ler os dados de N contribuintes
(N fornecido pelo usuário), os quais podem ser pessoa
física ou pessoa jurídica, e depois mostrar o valor do
imposto pago por cada um, bem como o total de imposto arrecadado.

Os dados de pessoa física são: nome, renda anual e gastos com saúde.
Os dados de pessoa jurídica são nome, renda anual e número de
funcionários. As regras para cálculo de imposto são as seguintes:

Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15%
 de imposto. Pessoas com renda de 20000.00 em diante pagam 25% de
  imposto. Se a pessoa teve gastos com saúde, 50% destes gastos
  são abatidos no imposto.

Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos
 com saúde, o imposto fica: (50000 * 25%) -(2000 * 50%) = 11500.00


Pessoa jurídica: pessoas jurídicas pagam 16% de imposto.
Porém, se a empresa possuir mais de 10 funcionários, ela paga 14%
 de imposto.

 Exemplo: uma  empresa  cuja  renda foi 400000.00 e possui 25
 funcionários, o imposto fica: 400000 * 14% = 56000.00

 Enter the number of tax payers: 3
 Tax payer #1 data:
 Individual or company (i/c)? i
 Name: Alex
 Anual income: 50000.00
 Health expenditures: 2000.00

 Tax payer #2 data:
 Individual or company (i/c)? c
 Name: SoftTech
 Anual income: 400000.00
 Number of employees: 25

 Tax payer #3 data:
 Individual or company (i/c)? i
 Name: Bob
 Anual income: 120000.00
 Health expenditures: 1000.00

TAXES PAID:
Alex: $ 11500.00
SoftTech: $ 56000.00
Bob: $ 29500.00

TOTAL TAXES: $ 97000.00

Correção

https://github.com/acenelio/inheritance8-java


 */
public class ProgramFixClassesMetodosAbstratos {

    public static void main(String[] args) throws ParseException {

/*
configuração basica
 */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
/*

 */


        List<TaxPayerFixClassesMetodosAbstr> list = new ArrayList<>();

/*

 */

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double income = sc.nextDouble();

            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new IndividualFixClassesMetodosAbstr(name, income, healthExpenditures));
            }
            else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new CompanyFixClassesMetodosAbstr(name, income, numberOfEmployees));
            }
        }

        double sum = 0.0;

        System.out.println();

        System.out.println("TAXES PAID:");

        for (TaxPayerFixClassesMetodosAbstr tp : list) {
            double tax = tp.tax();
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));

            sum += tax;
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();

    }
}
