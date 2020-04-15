package ProgramacaoOrientadaObjetos_Parte1.Capitulo13_Enum_composicao.Cap13_Fixacao.model.entities;

public class OrderItem {

/*
atributos
 */
    private Integer quantity;
    private Double price;


/*
construtor padrao e com argumentos
 */
    private Product product;



    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }


/*
getters and settes
 */
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
       this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

/*
metodos adicionais
 */

    public double subTotal() {
        return price * quantity;

    }

/*
metodo toString para produto
 */

    @Override

    public String toString() {

        return product.getName()
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity +
                ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }
}
