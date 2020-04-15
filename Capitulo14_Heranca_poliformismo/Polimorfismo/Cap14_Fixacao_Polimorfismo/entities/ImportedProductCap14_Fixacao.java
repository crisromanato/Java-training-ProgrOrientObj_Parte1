package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Polimorfismo.Polimorfismo.Cap14_Fixacao_Polimorfismo.entities;

public class ImportedProductCap14_Fixacao extends ProductCap14_Fixacao {
/*
atributos
 */
    private Double customsFee;

/*
construtor
 */

    public ImportedProductCap14_Fixacao(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

/*
  getters and setters
   */


    public Double getCustomsFee() {
        return customsFee;
    }
    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }


/*
metodos adicionais
 */
    public Double totalPrice() {
        return getPrice() + customsFee;
    }

/*
toString - override
ou sobreposicao do toString?
 */

    @Override
    public String priceTag() {

        return getName()
                + " $ "
                + String.format("%.2f", totalPrice())
                + " (Customs fee: $ "
                + String.format("%.2f", customsFee)
                + ")";

    }
}
