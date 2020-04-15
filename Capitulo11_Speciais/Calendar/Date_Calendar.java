package ProgramacaoOrientadaObjetos_Parte1.Capitulo11_Speciais.Calendar;


import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;


/*

Manipulando uma data com Calendar
http://educandoweb.com.br
Prof. Dr. Nelio Alves

Calender muito usado em sistemas legados

Caso 1 :
Somando ou subtrai uma unidade de tempo

Caso 2:
Obtendo uma unidade de tempo


 */
public class Date_Calendar {
    public static void main(String[] args) {
/*
Caso 1 - Somando uma unidade de tempo
 */

/*
Instanciacao da data no formato UTC- impressao com 3 horas de diferenca
GMT: Greenwich MeanTime (time zone)
• UTC: CoordinatedUniversal Time (time standard)
 Esta funcao .parse recebe um date em formato de string e converte em data.
 */

SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

System.out.println("Impressão com formato UTC");
System.out.println(sdf.format(d));

        System.out.println("Impressão sem formato");
        System.out.println(d);
/*
como faço para acrescentar 4horas na data acima
Podemos fazer usando o objeto Calendar
Iniciar o objeto
 */
Calendar cal = Calendar.getInstance();

/*
chamar a varival call e a operacao set.time passando a data
com nome de d do nosso Date acima.
Com isso tenho um calendario q esta instanciado dentro dele
a partir dai posso acrescentar , diminiur o qaunto eu quiser.
 */
cal.setTime(d);
/*
exemplo de adicao
informo o nome do objeto.add
insiro o comando Calendar. e escolho o que quero fazer logo depois
vrigula e o montante que quero add ou diminiur.
 */

cal.add(Calendar.HOUR_OF_DAY, 4);

/*
para atualizar a nova hora no meu calendario fazemos:

 */
d = cal.getTime();

        System.out.println("-----------------------------------------");
        System.out.println("impressao com formato 4 horas adiantados");
        System.out.println(sdf.format(d));
        System.out.println("impressao sem formato 4 horas adiantados");
        System.out.println(sdf.format(d));


/*
Caso 1 - Obtendo uma unidade de tempo
Como pegar por exemplo o '42 a partir de uma data tipo Date
eg. "2018-06-25T15:42:07Z"

criar uma variavel int chamada minutes e chamar a funcao Calendar.get
e nela posso escolher o que quero pegar.
 */

int minutes = cal.get(Calendar.MINUTE);

System.out.println("-----------------------------------------");
System.out.println("Minutos da nossa hora: '2018-06-25T15:42:07Z' ");
System.out.println("Minutes: " + minutes);

/*
criar uma variavel int chamada month e chamar a funcao Calendar.get
e nela posso escolher o que quero pegar.
Note que para o mês temos que considerar colocar 1+ na frente do cal.get
isso porque o java considera os meses iniciando por 0.
 */

int month = 1 + cal.get(Calendar.MONTH);
System.out.println("-----------------------------------------");
System.out.println("Mês da nossa hora: '2018-06-25T15:42:07Z' ");
System.out.println("Month: " + month);

//int month = 1 + cal.get(Calendar.MONTH);
    }
}
