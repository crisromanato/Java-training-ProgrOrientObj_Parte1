package ProgramacaoOrientadaObjetos_Parte1.Capitulo15_Tratamento_excecoes.ExcecoesPersonalizadas.BadSolution_GitHub.application;


import ProgramacaoOrientadaObjetos_Parte1.Capitulo15_Tratamento_excecoes.ExcecoesPersonalizadas.BadSolution_GitHub.model.entities.ReservationBD_git;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
solucao ruim para implementacao de excecoes


• • Solução 2 (ruim):
método retornando string

• A semântica da operação é prejudicada
• Retornar stringnão tem nada a ver com atualização de reserva
• E se a operação tivesse que retornar um string?
• Ainda não é possível tratar exceções em construtores
• Ainda não há auxílio do compilador: o programador deve "lembrar"
de verificar se houve erro
• A lógica fica estruturada em condicionais aninhadas


 */
public class ProgramBD_Domain {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
/*
como vamos trabalhar com data vamos precisar dessa declaracao
 */
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        /*
        logica para ler o numero do quarto - check-in e checkout
                 */

        System.out.print("Room number: ");
        int number = sc.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        /*
        quando vc tem uma excecao ou vc trata a excecao ou vc propaga
        a excecao atraves de throws no metodo que voce esta.
        eventualmente outro metodo q chamar esse main também tem
        que propagar ou tratar o erro.
        Esse é o caso de pilha de chamados que vimos no StackTrace.
         */
        Date checkIn = sdf.parse(sc.next());
        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        /*
        instanciar a reserva
        lembrando que tem uma regra quanto a data posterior
        ao check-in.

        Nota: essa validacao nao tem como tirar porque ela
        teria q ser uma validacao no construtor e o construtor
        nao tem como retornar uma string, entao essa validacao
        na hora de criar o objeto ficara aqui por enquanto.
                 */

        if (!checkOut.after(checkIn)) {
            System.out.println("Error in reservation: Check-out date must be" +
                    "after check-in date");
        } else {
            /*
            posso instanciar apos o if ja no else.
             */
            ReservationBD_git reservation = new ReservationBD_git(
                    number, checkIn, checkOut);
            /*
            mostrar na tela os dados da reserva
             */
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.println("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());
            /*
            validacao para reserva em data futura - maneira muito ruim
            de implementar, porque vou implementar essa logica
            no programa principal
             */

                        /*
            metodo responsavel por atualizar as datas.
            removido o if anterior e colocado na reservation.
            Desta forma fizemos a delegacao à reserva
            Apesar desta alteracao ainda ser ruim.
             */
             String error = reservation.updateDates(checkIn, checkOut);
             /*
             testar
              */
            if (error != null) {
                System.out.println("Error in reservation: " + error);
            }
            else {
            /*
            após atualizar tenho que imprimir de novo os dados
             */
                System.out.println("Reservation: " + reservation);
            }

            sc.close();
        }
    }
}
