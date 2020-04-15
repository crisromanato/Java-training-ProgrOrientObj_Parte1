package ProgramacaoOrientadaObjetos_Parte1.Capitulo15_Tratamento_excecoes.ExcecoesPersonalizadas.GoodSolutionRunTime_GitHub.model.entities;

import ProgramacaoOrientadaObjetos_Parte1.Capitulo15_Tratamento_excecoes.ExcecoesPersonalizadas.SolucaoMuitoRuim.model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ReservationGSR {
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

    A logica do update que verifica se a data de checkin nao e
    depois da data de checkout também deve ser colocado no construtor
    isso se chama programacao defensiva e deve ser colocada sempre no
    começo do contrutor e informar que ele sera propagada add a
    declaracao thros.
     */
    public ReservationGSR(Integer roomNumber, Date checkIn, Date checkOut)  {
        if (!checkOut.after(checkIn)) {
            throw  new DomainException("Check-out date must be " +
                    "after check-in date");
        }
             this.roomNumber = roomNumber;
        this.checkIn = checkIn;
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
    public Date getCheckIn() {
        return checkIn;
    }
    public Date getCheckOut() {
        return checkOut;
    }

    /*
    set do checkin e checkout sera controlado pelos metodos update.
    Por isso foi deletado.
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
    Metodo update: agora vai lancar uma excecao, para isso
    caso ocorra um erro temos que lancar um throw com a classe
    de excecao que ja vem pronta no java eg. IllegalArgumentException.

    Porém no caso, vamos criar uma excecao personalizada e vamos
    usa-la ao inves da do java.

    Temos que propagar ou criar um tryCatch, no nosso caso, vamos
    propagar porque a excecao sera tratada no programa principal
    no bloco catch
    Agora o metodo UpdateDates pode lancar uma excecao dependendo
    do que ocorrer quando o progrma for executado.

   Com o runtime exception nao precisamos tratar a excecao, vamos apagar
   o throws do cod fonte updateDates e no construtor.
     */
    public void updateDates(Date checkIn, Date checkOut)  {
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            throw new DomainException("Reservation dates for " +
                    "update must be future dates.");}
        if (!checkOut.after(checkIn)) {
            throw  new DomainException("Check-out date must be " +
                    "after check-in date");
        }
        /*
        checkin e out do objeto recebe o checkin e out do argumento
         */
            this.checkIn = checkIn;
            this.checkOut = checkOut;

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

