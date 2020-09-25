package ar.com.ar.online.second.exerciseabstractclassesandmethods;

public abstract class Product {

    protected Double listPrice;

    protected Double calculatePrice() {

    }

    public Product() {
    }

    public Product(Double listPrice) {
        this.listPrice = listPrice;
    }

    public Double getListPrice() {
        return listPrice;
    }

}
