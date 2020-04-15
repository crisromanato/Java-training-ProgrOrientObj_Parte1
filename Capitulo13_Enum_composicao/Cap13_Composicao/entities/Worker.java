package ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Composicao.entities;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Composicao.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    /*
    atributos
     */
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    /*
associaçao dept
 */
    private Department department;

/*
assciacao contract e instanciar a list
 */
    private List<HourContract> contracts = new ArrayList<>();

/*
contrutor padrao e com argumentos
Note que o construtor sera gerado sem a lista
Quando você tiver uma composicao tem muitos (no caso uma lista)
nao se usa o construtor. Só inicia a lista vazia dentro
da associacao da lista (instancia)
 */
    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

/*
getters and setters de todos
Nota: o set contrato nao pode ser usado, visto
que temos um metodo proprio para adicionar e remover
contrato. Por isso removemos o set Contract.

O trabalhador tem um lista vazia via arraylist e vamos
começar add e remover via metodos.
Se deixarmos o set, ele vai trocar a lista e isso nao pode
ocorrer.
 */

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }
    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;

    }

/*
metodos adicionais
 */

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }


    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

/*
O salario base do trabalhador sera o salario base +
os contratos do mes que ele trabalhou
 */
    public double income(int year, int month) {
        /*
        declarar uma varivael sum para receber o baseSalary
         */
        double sum = baseSalary;
        /*
        percorrer os contratos do mes e ano definidos acima
        e se for deste mes e ano tem que entrar na soma também

        vamos fazer um for each
        para cada contrato contido na lista de contratos
        fazer:
         */
        Calendar cal = Calendar.getInstance();
        for (HourContract c : contracts) {
            cal.setTime(c.getDate());
            /*
            variavel para representar o ano e o mes do contrato
            como extrair o ano e o mes da data do contrato c
            vamos usar o Calendar.
            Para isso criamos a variavel Calendar cal acima
            e adicionamos o comando para fazer o setTime logo no
            inicio do for each.
             */
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);

            if (year == c_year && month == c_month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
