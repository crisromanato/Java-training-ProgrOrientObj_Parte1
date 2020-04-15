package ProgramacaoOrientadaObjetos_Parte1.Capitulo8_Introducao.Membros_Estaticos1.application;

import java.util.Locale;
import java.util.Scanner;


public class Program_Membros_Estaticos1 {
    public static final double PI = 3.14159; // constante

    public static void main(String[] args) {
        /*
        Membros estáticos
• Também chamados membros de classe •
    Em oposição a membros e instância

 • São membros que fazem sentido independentemente de objetos.
    Não precisam de objeto para serem chamados.
    São chamados a partir do próprio nome da classe.


• Aplicações comuns:
    • Classes utilitárias - > Math.sqrt(double)
    • Declaração de constantes - > quando tem o final antes do tipo
        constantes também sao escritas normalmente com letra maiuscula

  Nota: dentro de um programa estatico (eg. psvm) os metodos tem que ser
  estaticos - nao podem ser somente instanciados.

 • Uma classe que possui somente membros estáticos,
 pode ser uma classe estática também. eg. classe psvm.
 Esta classe não poderá ser instanciada.

 Problema exemplo
Fazer um programa para ler um valor numérico qualquer,
e daí mostrar quanto seria o valor de uma circunferência e
do volume de uma esfera para um raio daquele valor.
Informar também o valor de PI com duas casas decimais.

Exemplo:
Enter radius: 3.0
Circumference: 18.85
Volume: 113.10
PI value: 3.14

Versão 1: métodos na própria classe do programa •
Nota: dentro de um método estático você não pode chamar membros de
 instância da mesma classe.

 Steps:

 0. criar uma constante com o valor de PI antes de iniciar o programa main.
 1. criar locale e scanner dentro do programa main.
 2. imprimir msg pra entrar o valor do raio.
 3. add variaveis pra serem lidas pelo scanner
 4. imprimir as variaveis nos formatos solicitados
 5. criar as funçoes para calculo da circunferencia e volume após o close
 do scanner.

         */


        Locale.setDefault(Locale.US);  //1
        Scanner sc = new Scanner(System.in); //1

        System.out.print("Enter radius: "); //2
        double radius = sc.nextDouble(); //3
        double c = circumference(radius); //3
        double v = volume(radius); //3

        System.out.printf("Circumference: %.2f%n", c); //4
        System.out.printf("Volume: %.2f%n", v); //4
        System.out.printf("PI value: %.2f%n", PI); //4
        sc.close();
    }
    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }
    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;

    }
}
