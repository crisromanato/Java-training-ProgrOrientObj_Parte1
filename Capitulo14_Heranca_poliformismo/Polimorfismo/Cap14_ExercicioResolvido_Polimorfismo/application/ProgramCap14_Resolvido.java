package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Polimorfismo.Polimorfismo.Cap14_ExercicioResolvido_Polimorfismo.application;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Polimorfismo.Polimorfismo.Cap14_ExercicioResolvido_Polimorfismo.entities.EmployeeResolvido;
import ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Polimorfismo.Polimorfismo.Cap14_ExercicioResolvido_Polimorfismo.entities.OutsourcedEmployeeResolvido;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/*
Exercício resolvido envolvendo polimorfismo

Uma empresa possui funcionários próprios e terceirizados.
Para cada funcionário, deseja-se registrar nome, horas
trabalhadas e valor por hora. Funcionários terceirizado
possuem ainda uma despesa adicional.

- Vamos criar uma classe employee com nome, horas e vl por h
- na classe funcionario teremos o pagamento como metodo

- vamos criar uma classe para funcionario terceirizado com
calculo para despesa adional. E estara ligado a classe
funcionario.
Ja na classe funcionario terceirizado tera o bonus.

O pagamento dos funcionários corresponde ao valor da hora
 multiplicado pelas horas trabalhadas, sendo que os
 funcionários terceirizados ainda recebem um bônus
 correspondente a 110% de sua despesa adicional.



Fazer um programa para ler os dados de N funcionários
 (N fornecidopelousuário)e armazená-los em uma lista.
 Depois de ler todos os dados, mostrar nome e pagamento
 de cada funcionário na mesma ordem em que foram digitados.
Construa o programa conforme projeto ao lado.


Enter the number of employees: 3
Employee #1 data:
Outsourced (y/n)? n
Name: Alex
Hours: 50
Value per hour: 20.00

Employee #2 data:
Outsourced (y/n)? y
Name: Bob
Hours: 100
Value per hour: 15.00
Additional charge: 200.00

Employee #3 data:
Outsourced (y/n)? n
Name: Maria
Hours: 60
Value per hour: 20.00

PAYMENTS: Alex - $ 1000.00
Bob - $ 1720.00
Maria - $ 1200.00

Os funcionarios serao armazenados numa lista
no exemplo acima sao 3, teremos uma lista c/ 3 posicoes

Quando for funcionario teremos:
a Lista na stack com Heap (Nome, horas e valor hora)

Quando for terceirizado teremos:
a Lista na stack com Heap (Nome, horas e valor hora e bonus)

Note que a lista tera obj diferentes porem com o tipo igual
tendo herança

https://github.com/acenelio/inheritance4-java



 */
public class ProgramCap14_Resolvido {
    public static void main(String[] args) {



    /*
    configuracao basica
     */

     Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);


/*
3. agora vou ter que ler a qt n de funcionarios e armazenar
    numa lista. Declarar a lista no começo do programa.
 */
    List<EmployeeResolvido> list = new ArrayList<>();


/*
entrada de dados
1. o programa começa perguntando a qt de funcionarios
 */
		System.out.print("Enter the number of employees: ");
		/*
		2. ler a qt de funcionarios e guardar numa variavel n.
		 */
    int n = sc.nextInt();

    /*
    4. fazer um for para ler repetidamente a qt de funcionarios
     */

		for (int i=1; i<=n; i++) {
		    /*
		    5. escrever a primeira msg
		     */
        System.out.println("Employee #" + i + " data:");
        /*
        6. perguntar se ele é terceirizado ou nao
         */
        System.out.print("Outsourced (y/n)? ");
        /*
        7. criar a varivavel para receber o sim ou nao
         */
        char ch = sc.next().charAt(0);
        /*
        8.perguntar o nome nao esquecendo de consumir a quebra de
        linha pendente do processo anterior.
         */
        System.out.print("Name: ");
        sc.nextLine();
        /*
        9. armanzenar o nome
        */
        String name = sc.nextLine();
        /*
        10. perguntar o total de horas
         */
        System.out.print("Hours: ");
        /*
        11. armanezar o total de horas
         */
        int hours = sc.nextInt();
        /*
        12. perguntar o valor por hora
         */
        System.out.print("Value per hour: ");
        /*
        13. armazenar o valor por hora
         */
        double valuePerHour = sc.nextDouble();

        /*
        14. tomada de decisao para funcionario terceirizado
        se sim, tenho que ler o valor da despesa adicional
        que sera digitado.
                */
        if (ch == 'y') {
            System.out.print("Additional charge: ");
            double additionalCharge = sc.nextDouble();
            /*
         15. Neste momento ja temos todos os dados para popular
        a lista, assim se tiver taxa adicional add no primeiro
        list.add. dos OutsourcedEmployeeResolvido
        Posso entao declarar a variavel do employee terceirizado e
        instancia-lo.
             */
        EmployeeResolvido emp = new OutsourcedEmployeeResolvido(
                name, hours, valuePerHour, additionalCharge);
        /*
        16. adicionar na lista
         */
            list.add(emp);

            /*
           15 e 16 --  forma resumida de ser fazer também pode ser :
            adicionando o new direto dentro do list.add conforme segue.
               list.add(new OutsourcedEmployeeResolvido(
                    name, hours, valuePerHour, additionalCharge));
              */

        }
        /*
       17. Caso seja um else - ou seja - nao tem adicional -
         add no segundo add.lista na lista dos EmployeeResolvido .
         Posso entao declarar a variavel do employee e
        instancia-lo.
         */
        else {
            EmployeeResolvido emp = new EmployeeResolvido(
                    name, hours, valuePerHour)
                    ;
             /*
        18. adicionar na lista
         */
            list.add(emp);

             /*
           17 e 18 -- forma resumida de ser fazer também pode ser :
            adicionando o new direto dentro do list.add conforme segue.
            list.add(new EmployeeResolvido(name, hours, valuePerHour));
                          */
        }
    }

		/*
impressao dos nomes e payments de cada um.
		 */

		System.out.println();
		System.out.println("PAYMENTS:");

		/*
		faremos um laco for each da lista
		 */

		for (EmployeeResolvido emp : list) {
        System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
    }

		sc.close();
}
}
