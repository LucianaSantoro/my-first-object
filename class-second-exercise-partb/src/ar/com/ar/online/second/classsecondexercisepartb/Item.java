package ar.com.ar.online.second.classsecondexercisepartb;

import java.util.Date;

public class Item {

    String name;
    Double price;
    Double tax;
    Date expirationDate;


    void calculateTax() {
        this.tax = 0.21 * price;
    }

    Double getTotalTPay() {
        Double result = this.price + this.tax;
        return result;
    }

    Boolean canItBeSold() {
        // nuevo objeto día de hoy con fecha de hoy
        Date today = new Date();
        // establecimiento por defecto de la variable boolean canItBeSold (mismo nombre método)
        Boolean canItBeSold = true;
        // comparación con fecha antes y después del día de hoy
        if (today.after(this.expirationDate))
            canItBeSold = false;

        return canItBeSold;

        // forma dos: comparación directa
        // Boolean canItBeSold () {
        //      Date today = new Date;
        //      Boolean result = expirationDate.after(today)
        //      return result;
    }
}
