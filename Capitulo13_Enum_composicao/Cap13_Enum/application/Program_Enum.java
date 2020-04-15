package ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Enum.application;

import java.util.Date;

public class Program_Enum {
    public static void main(String[] args) {
/*
declarar um novo obj do tipo order
 */
        ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Enum.application.entities.Order_Cap13_StringBuilder order = new ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Enum.application.entities.Order_Cap13_StringBuilder(1080, new Date(), ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Enum.application.entities.enums.OrderStatusStringBuilder.PENDING_PAYMENT);
/*
ele imprime o status em string
 */
        System.out.println(order);
        /*
        Quando quisermos transformar uma string para enum,
        eg. as vezes o usuario manda a informacao em formulario
        em string e o programa tem que converter o dados.
        para isso usamos o valueOf
         */

        /*
        o comando abaixo instanciou o obj order status com o
        valor delivered.
        o os1 é a decalaracao usando o valor do tipo order
        o os2 é a decalaracao usando o valor via funcao usando
        string.
         */
        ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Enum.application.entities.enums.OrderStatusStringBuilder os1 = ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Enum.application.entities.enums.OrderStatusStringBuilder.DELIVERED;

        ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Enum.application.entities.enums.OrderStatusStringBuilder os2 = ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Enum.application.entities.enums.OrderStatusStringBuilder.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
