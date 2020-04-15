package ProgramacaoOrientadaObjetos_Parte1.Capitulo15_Tratamento_excecoes.ExcecoesPersonalizadas.BadSolution_GitHub.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ReservationBD_git {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    /*
    Declarar um SDF para ser usado no toString
    ele foi declarado como static para nao ser instanciado um
    novo SDF para cada objeto reservation que minha aplicacao
    tiver

     */
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    /*
    construtor com argumentos
     */
    public ReservationBD_git(Integer roomNumber, Date checkin, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkin;
        this.checkOut = checkOut;
    }

    /*
    getters and setters
     */
    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkIn;
    }


    public Date getCheckOut() {
        return checkOut;
    }

    /*
    set checkin e checkou sera controlado pelos metodos update.
    No metodo duration valos usar o tipo long pois precisamos
    de um tipo mais longo.
    Vamos usar um calculo de diferenca entre datas que requer
    este tipo.

    Metodo duration descrito abaixo.
     */
    public long duration() {
        /*
        calcular em milesegundos getTime devolve este valor.
         */
        long diff = checkOut.getTime() - checkIn.getTime();
/*
como converter milesegundos em dias.
usar: TimeUnit que é um tipo enumerado complexo que tem algumas
operações
 */
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    /*
    Metodo update:
     */
    public String updateDates(Date checkIn, Date checkOut) {
        /*
        copiado o metodo abaixo do program, mudando alguns dados
         */
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            return ("Reservation dates " +
                    "for update must be future dates.");
        }
        if (!checkOut.after(checkIn)) {
            return ("Check-out date must be " +
                    "after check-in date");
        }
        /*
        check do objeto recebe o check do argumento
         */
            this.checkIn = checkIn;
            this.checkOut = checkOut;
/*
retorna nulo se nao deu nenhum erro
 */
            return null;
        }

    /*
    implementar o toString para imprimir no formato que o
    exercicio pede.
    O toString é uma sobreposicao
     */

        @Override
        public String toString () {
            return "Room "
                    + roomNumber
                    + ", check-in: "
            /*
            concatenar a data via sdf.format
             */
                    + sdf.format(checkIn)
                    + ", check-out: "
                    + sdf.format(checkOut)
                    + ", "
            /*
            chamada do metodo duration criado acima
             */
                    + duration()
                    + " nights";
        }
    }

