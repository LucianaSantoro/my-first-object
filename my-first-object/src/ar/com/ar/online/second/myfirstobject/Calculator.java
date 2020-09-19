package ar.com.ar.online.second.myfirstobject;

public class Calculator {

    // atributos de la clase
    Integer numberA;
    Integer numberB;

    // método de la clase con entrega del dato del mismo tipo
    Integer sumAttributes() {
        Integer result = this.numberA + this.numberB;
        return result;
    }

    Integer multiplyAttributes() {
        Integer result = this.numberA * this.numberB;
        return result;
    }

}
