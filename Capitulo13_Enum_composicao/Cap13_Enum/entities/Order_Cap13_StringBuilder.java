package ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Enum.application.entities;

import java.util.Date;

public class Order_Cap13_StringBuilder {
    /*
    criar os atributos
     */
    private Integer id;
    private Date moment;
    private ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Enum.application.entities.enums.OrderStatusStringBuilder status;

    public Order_Cap13_StringBuilder() {
    }

    /*
    Contrutor
     */
    public Order_Cap13_StringBuilder(Integer id, Date moment, ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Enum.application.entities.enums.OrderStatusStringBuilder status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

/*
getters and setters
 */
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Enum.application.entities.enums.OrderStatusStringBuilder getStatus() {
        return status;
    }
    public void setStatus(ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Enum.application.entities.enums.OrderStatusStringBuilder status) {
        this.status = status;
    }


/*
generate toString
 */
    @Override

    public String toString() {
        return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";

    }
}
