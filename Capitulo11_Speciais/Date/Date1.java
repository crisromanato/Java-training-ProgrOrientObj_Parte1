package ProgramacaoOrientadaObjetos_Parte1.Capitulo11_Speciais.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.TimeZone;

/*
  SimpleDateFormat
• https://docs.oracle.com/javase/10/docs/api/java/text/SimpleDateFormat.html
• Define formatos para conversão entre Date e String
• dd/MM/yyyy -> 23/07/2018 • dd/MM/yyyy HH:mm:ss -> 23/07/2018 15:42:07


Padrão ISO 8601 e classe Instant
• Formato: yyyy-MM-ddTHH:mm:ssZ
• Exemplo: "2018-06-25T15:42:07Z"
• Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

Demo:
Criacao e impressao de datas.
   */
public class Date1 {
    public static void main(String[] args) throws ParseException {
        /*
        instanciacao do objeto SimpleDateFormat e incluir os parametros no
        formato que queremos.
         */
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        /*
        time zone com GMT
        GMT: Greenwich MeanTime (time zone)
        • UTC: CoordinatedUniversal Time (time standard)

       instanciar objeto para impressao em formato UTC sem o atraso que mostra
       devido a nossa maq ser no Brazil
       E fazer um set time zome para pegar o time zone GMT.

         */
       SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

         /*
        variavel y1 recebe sdf1.parse
        Esta funcao .parse recebe um date em formato de string e converte em data.
        Nota1: ajustar o date também para o java.util.
        Nota2: adicionar a exception para a funcao parse por enquanto
         */
        java.util.Date y1 = sdf1.parse("25/06/2018");
        java.util.Date y2 = sdf2.parse("25/06/2018 15:42:07");

        /*
instanciar uma data com horario atual
 */
        java.util.Date x1 = new java.util.Date();

            /*
instanciar uma data com horario atual de outra forma
o sistema pega o instante do meu sistema converte para milisegundos
e cria a data com esse valor
 */
        java.util.Date x2 = new java.util.Date(System.currentTimeMillis());

          /*
instanciar uma data passando 0 milisegundos
o sistema pega o instante do meu sistema converte para milisegundos
e cria a data com esse valor
o L mostra que o formato é long.
 */
        java.util.Date x3 = new java.util.Date(0L);

         /*
instanciar uma data passando 5 horas -  x4
o sistema pega o instante do meu sistema converte para milisegundos
e cria a data com esse valor
1 segundo tem 1000milisegundos = 1000l
multiplicamos 1 segundo por 60L para dar um minuot e por 60 novamente
para dar uma hora e multiplicado por 5 novamente da 5 horas.
Como isso criou uma data as 5hs da manha de 1970. quando começou a contagem.
*/

        java.util.Date x4 = new java.util.Date(1000L * 60L * 60L *5);


  /*
instanciar uma data formato ISO 8601 e classe instant usando padrao UTC
a letra z no final indica formato UTC - como por padrao a impressao é feita
com a hora da maquian esta com 3 horas de atraso.
Padrão ISO 8601 e classe Instant
• Formato: yyyy-MM-ddTHH:mm:ssZ
• Exemplo: "2018-06-25T15:42:07Z"
• Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

 */
  java.util.Date y3 = java.util.Date.from((Instant.parse("2018-06-25T15:42:07Z")));

         /*
**************** Impressões************************

        imprimir o dados
        exemplo da impressao: formato padrao java
        como no primeiro nao especifiquei horario ele imprime 0 e o BRT
        do horario Brasil e no final o ano.
        y1: Mon Jun 25 00:00:00 BRT 2018
        y2: Mon Jun 25 15:42:07 BRT 2018
         */
        System.out.println("impressao formato padrao java");
        System.out.println("y1: " + (y1));
        System.out.println("y2: " + (y2));
        System.out.println();

        System.out.println("impressao formato padrao sdf2");
        System.out.println("y1: " + sdf2.format(y1));
        System.out.println("y2: " + sdf2.format(y2));
        System.out.println();

/*
imprimir uma data com horario atual
 */
        System.out.println("impressao variavel - horario atual");
        System.out.println("x1: " + sdf2.format(x1));
        System.out.println();
        /*
imprimir uma data com horario atual em milisegundos
 */
        System.out.println("impressao variavel - horario atual em milisegundos");
        System.out.println("x2: " + sdf2.format(x1));
        System.out.println();

             /*
imprimir uma data com 0 milisegundos
 */
        System.out.println("impressao variavel - 0 milisegundos");
        System.out.println("x3: " + sdf2.format(x1));
        System.out.println();
/*

        imprimir uma data com 5 horas da manha de 1970
                */
        System.out.println("impressao variavel - 5hs da manha de 1970");
        System.out.println("x4: " + sdf2.format(x4));
        System.out.println();

/*
        imprimir uma data com ISO 8601 format
                */
        System.out.println("impressao variavel - formato ISO 8601");
        System.out.println("y3: " + sdf2.format(y3));
        System.out.println();

         /*
        imprimir uma data sem formato - formato JAVA
                */
        System.out.println("-------------");
        System.out.println("impressao variavel - sem formato - formato java");
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
        System.out.println("x3: " + x3);
        System.out.println("x4: " + x4);
        System.out.println("y1: " + y1);
        System.out.println("y2: " + y2);
        System.out.println("y3: " + y3);

        /*
        imprimir uma data com formato horario Brazil
                */
        System.out.println("-------------");
        System.out.println("impressao variavel - formato horario do Brazil");
        System.out.println("x1: " + sdf2.format(x1));
        System.out.println("x2: " + sdf2.format(x2));
        System.out.println("x3: " + sdf2.format(x3));
        System.out.println("x4: " + sdf2.format(x4));
        System.out.println("y1: " + sdf2.format(y1));
        System.out.println("y2: " + sdf2.format(y2));
        System.out.println("y3: " + sdf2.format(y3));

       /*
        imprimir uma data com formato GMT
                */
        System.out.println("-------------");
        System.out.println("impressao variavel - formato GMT");
        System.out.println("x1: " + sdf3.format(x1));
        System.out.println("x2: " + sdf3.format(x2));
        System.out.println("x3: " + sdf3.format(x3));
        System.out.println("x4: " + sdf3.format(x4));
        System.out.println("y1: " + sdf3.format(y1));
        System.out.println("y2: " + sdf3.format(y2));
        System.out.println("y3: " + sdf3.format(y3));

    }
}
