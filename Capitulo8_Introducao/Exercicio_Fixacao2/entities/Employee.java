package ProgramacaoOrientadaObjetos_Parte1.Capitulo8_Introducao.Exercicio_Fixacao2.entities;

public class Employee {
        /*
        Fazer um programa para ler os dados de um funcionário
        (nome, salário bruto e imposto). Em seguida, mostrar os
        dados do funcionário (nome e salário líquido).
        Em seguida, aumentar o salário do funcionário com base em
        uma porcentagem dada (somente o salário bruto é afetado pela
        porcentagem) e mostrar novamente os dados do funcionário.
        Use a classe projetada abaixo.

        Exemplo:
        Name: Joao Silva Gross salary: 6000.00 Tax: 1000.00
        Employee: Joao Silva, $ 5000.00
        Which percentage to increase salary? 10.0
        Updated data: Joao Silva, $ 5600.00

1. variaveis (public tipo + nome)
2. funcao para gerar o net salary
3. funcao para calcular o aumento salario (public + tipo + nome + parametro com
o tipo a ser usado no calculo
4. funcao para mostrar os dados funcionario (toString) - public + tipo + funcao

         */

        public String name;
        public double grossSalary;
        public double tax;

        public double netSalary(){
            return grossSalary - tax;
        }

        public void increaseSalary(double percentage){
            grossSalary += grossSalary  * percentage / 100.0;
        }

        public String toString(){
        return name + ", $ " + String.format("%.2f", netSalary());

    }

}
