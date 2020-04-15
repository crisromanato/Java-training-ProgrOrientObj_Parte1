package ProgramacaoOrientadaObjetos_Parte1.Capitulo10_Memoria_arrays_listas.Vetor1.entities1;
/*
Problema exemplo 1: - VETOR COM TIPO REFERENCIA
 */


public class Product_Vetor1 {
    private String name;
    private double price;

    public Product_Vetor1(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
