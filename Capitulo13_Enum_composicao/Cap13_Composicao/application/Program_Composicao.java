package ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Composicao.application;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Composicao.entities.Department;
import ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Composicao.entities.HourContract;
import ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Composicao.entities.Worker;
import ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Composicao.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;



/*
Composicao
Ler os dados de um trabalhador com N contratos (N fornecido pelo
usuario). Depois, solicitar do usuario um mês e mostrar qual foi
o salario do funcionario no mês.

Nome que o worker level vai ser formado por um enum.

Exemplo:
Enter department's name: Design
Enter worker data:
Name: Alex
Level: MID_LEVEL
Base salary: 1200.00
How many contracts to this worker? 3
Enter contract #1 data:
Date (DD/MM/YYYY): 20/08/2018
Value per hour: 50.00
Duration (hours): 20

Enter contract #2 data:
Date (DD/MM/YYYY): 13/06/2018
Value per hour: 30.00
Duration (hours): 18

Enter contract #3 data:
Date (DD/MM/YYYY): 25/08/2018
Value per hour: 80.00
Duration (hours): 10

Enter month and year to calculate income (MM/YYYY): 08/2018
Name: Alex
Department: Design
Income for 08/2018: 3000.00

https://github.com/acenelio/composition1-java

 */



public class Program_Composicao {
    public static void main(String[] args) throws ParseException {

/*
configuracao base
 */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
vai ser usado quando o usaurio informar a data do contrato
para converter o valor
instanciado com a mascara
         */
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

/*
nome do departamento e outros dados + armazenamento dos dados
 entrados
 */
        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

      /*
      associações de objetos
      declarar e instanciar um trabalhador
       - Note que o valueof do worker foi necessario para
     transformar o valor de string para enum - com isso
      criamos uma instancia com valor equivalente ao tipo enum
      - Note que teremos que fazer uma composicao para instanciar
      o departmentName definido acima com nossa classe dept
      e esse departamento estara associado ao nosso worker.

       */

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

/*
varivael n para receber o numero de contratos
 */

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

/*
para ler os dados dos contratos vamos usar um for
 */

        for (int i=1; i<=n; i++) {
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            /*
            nesta parte temos que implementar o simple date
            format que esta descrito acima, junto com a
            declaracao do scanner para que possamos receber
            o valor no formato correto.
            Temos que incluir tambem a excessao que vai sugerir
             */
            Date contractDate = sdf.parse(sc.next());
            /*
            adicao as outras declaracoes que serao armazenados
             */
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();

            /*
            instanciar um contrato para receber os valores
            acima e associar ao worker.
             */

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);

        }
/*
pedir para o usuario entrar com mes e ano

 */
        System.out.println();

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        /*
        criar uma variavel string
        vamos ler e recortar manualmente
         */
        String monthAndYear = sc.next();
/*
nos comandos abaixo vamos recortar os caracteres e guardar nas
variaveis
aprendemos isso em Strings no cap 2.
No metodo .substring temos sempre que informar um a mais eg.
se queremos imprimir o MM do MM/YYYY
temos que informar que queremos do 0 ao 2 e não só do 0 ao 1.
Para converter o valor recebido em inteiro usamos o outro metodo
Integer.parseInt.
No caso do year como quero da posicao 3 em diante, só coloco 3
e o programa ja entende.

 */
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        /*
        impressao dos valores conforme dados coletados.
         */
        System.out.println("Name: " + worker.getName());
        /*
        note que para pegar o departamento fizemos uma composicao
        pegando o dept + o name do worker.
         */
        System.out.println("Department: " + worker.getDepartment().getName());
        /*
        digito o valor Income for, concateno com o mes e ano que o
        trabalhador digitou, concatenado com : e concatenado com o
        valor que ele ganhou neste mes e neste ano.
        para isso chamamos: worker.income(year, month) passando o ano
        e o mês. Fizemos também a formatacao da impressao com 2 digitos
        String.format("%.2f", antes do worker.income.

         */
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));



        sc.close();

    }
}
