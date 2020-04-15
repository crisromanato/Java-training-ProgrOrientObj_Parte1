package ProgramacaoOrientadaObjetos_Parte1.Capitulo15_Tratamento_excecoes.ExcecoesPersonalizadas.SolucaoBoa.application.model.entities;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo15_Tratamento_excecoes.ExcecoesPersonalizadas.SolucaoBoa.application.model.exceptions.Domain1Exception1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation1 {
    private Integer roomNumber;

    private Date checkIn;
    private Date checkOut;



    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");



    public Reservation1(Integer roomNumber, Date checkIn, Date checkOut) {

        if (!checkOut.after(checkIn)) {

            throw new Domain1Exception1("Check-out date must be after check-in date");

        }

        this.roomNumber = roomNumber;

        this.checkIn = checkIn;

        this.checkOut = checkOut;

    }



    public Integer getRoomNumber() {

        return roomNumber;

    }



    public void setRoomNumber(Integer roomNumber) {

        this.roomNumber = roomNumber;

    }



    public Date getCheckIn() {

        return checkIn;

    }



    public Date getCheckOut() {

        return checkOut;

    }



    public long duration() {

        long diff = checkOut.getTime() - checkIn.getTime();

        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

    }



    public void updateDates(Date checkIn, Date checkOut) {

        Date now = new Date();

        if (checkIn.before(now) || checkOut.before(now)) {

            throw new Domain1Exception1("Reservation dates for update must be future dates");

        }

        if (!checkOut.after(checkIn)) {

            throw new Domain1Exception1("Check-out date must be after check-in date");

        }

        this.checkIn = checkIn;

        this.checkOut = checkOut;

    }



    @Override

    public String toString() {

        return "Room "

                + roomNumber

                + ", check-in: "

                + sdf.format(checkIn)

                + ", check-out: "

                + sdf.format(checkOut)

                + ", "

                + duration()

                + " nights";

    }
}
