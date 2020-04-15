package ProgramacaoOrientadaObjetos_Parte1.Capitulo15_Tratamento_excecoes.ExcecoesPersonalizadas.SolucaoBoa.application;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo15_Tratamento_excecoes.ExcecoesPersonalizadas.SolucaoBoa.application.model.entities.Reservation1;
import ProgramacaoOrientadaObjetos_Parte1.Capitulo15_Tratamento_excecoes.ExcecoesPersonalizadas.SolucaoBoa.application.model.exceptions.Domain1Exception1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*


Criando exceções personalizadas


Sugestão de pacotes "model" - model view controler
model1 - dados de sistema e as transformacoes dos dados conf regras de negocio.
    entities
    enums
    exceptions
    services

Problema exemplo
Fazer um programa para ler os dados de uma reserva de hotel
(número do quarto,data de entrada e data de saída)

e mostrar os dados da reserva, inclusive sua duração em dias.

Em seguida, ler novas datas de entrada e  e saída, atualizar a
reserva, e mostrar novamente a reserva com os dados atualizados.

O programa não deve aceitar dados inválidos para a reserva,
conforme as seguintes regras:
  -Alterações de reserva só podem ocorrer para datas futuras
  -A data de saída deve ser maior que a data de entrada

  Classe sera:
  Reservation
  -roomNumber - integer
 - check-in Date
 - check-out Date
 metodos
 + duration - integer
 + update(dates(check-in e check-ou dates: void


Example 1
Room number: 8021
Check-in date (dd/MM/yyyy): 23/09/2019
Check-out date (dd/MM/yyyy): 26/09/2019
Reservation: Room 8021, check-in: 23/09/2019, check-out: 26/09/2019, 3 nights

Enter data to update the reservation:
Check-in date (dd/MM/yyyy): 24/09/2019
Check-out date (dd/MM/yyyy): 29/09/2019
Reservation: Room 8021, check-in: 24/09/2019, check-out: 29/09/2019, 5 nights

Room number: 8021
Check-in date (dd/MM/yyyy): 23/09/2019
Check-out date (dd/MM/yyyy): 21/09/2019
Error in reservation: Check-out date must be after check-in date

Example2
Room number: 8021
Check-in date (dd/MM/yyyy): 23/09/2019
Check-out date (dd/MM/yyyy): 26/09/2019
Reservation: Room 8021, check-in: 23/09/2019, check-out: 26/09/2019, 3 nights

Enter data to update the reservation:
Check-in date (dd/MM/yyyy): 24/09/2015
Check-out date (dd/MM/yyyy): 29/09/2015
Error in reservation: Reservation dates for update must be future dates

Room number: 8021
Check-in date (dd/MM/yyyy): 23/09/2019
Check-out date (dd/MM/yyyy): 26/09/2019
Reservation: Room 8021, check-in: 23/09/2019, check-out: 26/09/2019, 3 nights

Enter data to update the reservation:
Check-in date (dd/MM/yyyy): 24/09/2020
Check-out date (dd/MM/yyyy): 22/09/2020
Error in reservation: Check-out date must be after check-in date

Resumo da aula

• Solução 1 (muito ruim): lógica de validação no programa principal
    • Lógica de validação não delegada à reserva

• Solução 2 (ruim): método retornando string
    • A semântica da operação é prejudicada
        • Retornar stringnão tem nada a ver com atualização de reserva
        • E se a operação tivesse que retornar um string?
        • Ainda não é possível tratar exceções em construtores
        • Ainda não há auxílio do compilador: o programador deve "lembrar"
            de verificar se houve erro
        • A lógica fica estruturada em condicionais aninhadas

• Solução 3 (boa): tratamento de exceções

https://github.com/acenelio/exceptions1-java



 */
public class Program1 {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");



        try {

            System.out.print("Room number: ");

            int number = sc.nextInt();

            System.out.print("Check-in date (dd/MM/yyyy): ");

            Date checkIn = sdf.parse(sc.next());

            System.out.print("Check-out date (dd/MM/yyyy): ");

            Date checkOut = sdf.parse(sc.next());



            Reservation1 reservation = new Reservation1(number, checkIn, checkOut);

            System.out.println("Reservation: " + reservation);



            System.out.println();

            System.out.println("Enter data to update the reservation:");

            System.out.print("Check-in date (dd/MM/yyyy): ");

            checkIn = sdf.parse(sc.next());

            System.out.print("Check-out date (dd/MM/yyyy): ");

            checkOut = sdf.parse(sc.next());



            reservation.updateDates(checkIn, checkOut);

            System.out.println("Reservation: " + reservation);

        }

        catch (ParseException e) {

            System.out.println("Invalid date format");

        }

        catch (Domain1Exception1 e) {

            System.out.println("Error in reservation: " + e.getMessage());

        }

        catch (RuntimeException e) {

            System.out.println("Unexpected error");

        }



        sc.close();

    }
}
