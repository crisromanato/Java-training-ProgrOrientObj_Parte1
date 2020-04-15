package ProgramacaoOrientadaObjetos_Parte1.Capitulo14_Heranca_poliformismo.Polimorfismo.Polimorfismo.Cap14_Fixacao_Polimorfismo.entities;

public class ProductCap14_Fixacao {
    /*
    atributos
     */
    private String name;
    private Double price;

/*
construtor com argumento
 */

    public ProductCap14_Fixacao(String name, Double price) {
        this.name = name;
        this.price = price;
    }

/*
getters and setters
 */

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }


/*
metodos adicionais - to String ?
 */
    public String priceTag() {
        return name
                + " $ "
                + String.format("%.2f", price);
    }
}
