package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Polimorfismo.Polimorfismo.Cap14_Fixacao_Polimorfismo.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProductCap14_Fixacao extends ProductCap14_Fixacao{




/*
atributos
 */
    private Date manufactureDate;

    /*
    variavel local
     */
    private static final SimpleDateFormat sdf = new SimpleDateFormat(
            "dd/MM/yyyy");

    /*
    Construtor com argumentos e super
     */

    public UsedProductCap14_Fixacao(String name, Double price,
                                    Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    /*
    getters and setters
     */

    public Date getManufactureDate() {
        return manufactureDate;
    }
    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    /*
    Outros metodos adicionais
    to string?
    sobreposicao?
     */

    @Override

    public String priceTag() {

        return getName()
                + " (used) $ "
                + String.format("%.2f", getPrice())
                + " (Manufacture date: "
                + sdf.format(manufactureDate)
                + ")";

    }
}
