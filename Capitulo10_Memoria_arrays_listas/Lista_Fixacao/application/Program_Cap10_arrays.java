package ProgramacaoOrientadaObjetos_Parte1.Capitulo10_Memoria_arrays_listas.Lista_Fixacao.application;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo10_Memoria_arrays_listas.Lista_Fixacao.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program_Cap10_arrays {
    public static void main(String[] args) {

        /*
        criar configuracao inicial locale + scanner
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

/*
instanciar uma lista usando ArrayList
 */
        List<Employee> list = new ArrayList<>();

        // PART 1 - READING DATA:
        System.out.print("How many employees will be registered? ");

        /*
        comando para armazenar o valor inserido pelo usuario
         */
        int n = sc.nextInt();

        /*
        'for' para processar  os dados que serao recebidos na lista
        obter o resultado eg:
        Emplyoee #1:
        Id: 333
        Name: Maria Brown
        Salary: 4000.00
         */
        for (int i=1; i<=n; i++) {
            System.out.println();
            System.out.println("Employee #" + i + ": ");
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            /*
            comando para adicionar na lista
             */
            list.add(new Employee(id, name, salary));
        }

        // PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");

        /*
        comando para armazenar o id inserido pelo usuario
         */
        int id = sc.nextInt();
/*
calculo para obter o id da lista, adicionar o % e incrementar o salario
usando funcoes lambdas.
Possible messages:
This id does not exist!

List of employees:
333, Maria Brown, 4000.00
536, Alex Grey, 3000.00

 */
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }



        // PART 3 - LISTING EMPLOYEES:
/*
        comando para imprimir a lista de usarios usando Laco_for_each
         */
        System.out.println();
        System.out.println("List of employees:");

        for (Employee obj : list) {
            System.out.println(obj);
        }


        sc.close();
    }
}
