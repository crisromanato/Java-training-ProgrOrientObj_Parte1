package ProgramacaoOrientadaObjetos_Parte1.Capitulo15_Tratamento_excecoes.ExcecoesPersonalizadas.GoodSolutionRunTime_GitHub.application;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo15_Tratamento_excecoes.ExcecoesPersonalizadas.SolucaoMuitoRuim.model.entities.Reservation;
        import ProgramacaoOrientadaObjetos_Parte1.Capitulo15_Tratamento_excecoes.ExcecoesPersonalizadas.SolucaoMuitoRuim.model.exceptions.DomainException;

        import java.text.ParseException;
        import java.text.SimpleDateFormat;
        import java.util.Date;
        import java.util.Scanner;

        /*
        solucao boa com  implementacao de excecoes




         */
        public class ProgramGSR {
            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

                /*
                vamos colocar esse codigo dentro de um bloco try
                 */
                try {
                    System.out.print("Room number: ");
                    int number = sc.nextInt();
                    System.out.print("Check-in date (dd/MM/yyyy): ");
                    Date checkIn = sdf.parse(sc.next());
                    System.out.print("Check-out date (dd/MM/yyyy): ");
                    Date checkOut = sdf.parse(sc.next());
                    /*
                    como o construtor ja esta no bloco try nao precisamos
                    ajustar nada pq ele ja trata a excecao que lancamos via
                    reservation. se acontecer algo no construtor o programa
                    vai ser interrompido e caira no bloco catch abaixo.
                     */
                    Reservation reservation = new Reservation(
                            number, checkIn, checkOut);
                    System.out.println("Reservation: " + reservation);

                    System.out.println();
                    System.out.println("Enter data to update the reservation: ");
                    System.out.println("Check-in date (dd/MM/yyyy): ");
                    checkIn = sdf.parse(sc.next());
                    System.out.print("Check-out date (dd/MM/yyyy): ");
                    checkOut = sdf.parse(sc.next());
                /*
                nao vai mais retornar uma string com a msg de erro, ele vai
                lancar uma excecao caso ela ocorra.
                Trocar o IllegalArgumentException pelo DomainException que
                criamos personalida. Com isso tratamos a excecao.
                 */
                    reservation.updateDates(checkIn, checkOut);
                    System.out.println("Reservation: " + reservation);
                }
                /*
                catch pra tratar possivel excecao que possa ocorrer.
                 */
                catch (ParseException e) {
                    System.out.println("Invalid date format");
                                    }

               catch (DomainException e) {
                   System.out.println("Error in reservation: " + e.getMessage());
                }
                /*
                heranca e upcasting para runtime exception
                 */
                catch (RuntimeException e) {
                    System.out.println("Unexpected error");
                }
                    sc.close();
                }
                }


