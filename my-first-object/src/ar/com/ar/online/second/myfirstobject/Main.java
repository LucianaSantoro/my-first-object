package ar.com.ar.online.second.myfirstobject;

public class Main {

    public static void main(String[] args) {

        // creación de objeto de clase Person
        Person personOne = new Person();
        Person personTwo = new Person();
        Person personThree = new Person();

        //Establecimiento del valor de los atributos
        personOne.name = "Lu";
        personOne.lastName = "Santorto";

        personTwo.name = "Atelela";
        personTwo.lastName = "Gaseosa";

        personThree.name = "Farol";
        personThree.lastName = "of Glory";

        personOne.showAttributesValues();
        personTwo.showAttributesValues();
        personThree.showAttributesValues();

        // creación de objeto de clase Calculator
        Calculator myCalculator = new Calculator();

        myCalculator.numberA = 10;
        myCalculator.numberB = 2;

        // Ejecución de atributos
        // con captura del resultado en una variable.
        Integer resultSum = myCalculator.sumAttributes();
        Integer resultMultiplication = myCalculator.multiplyAttributes();

        // el método no tiene indicaciones de impresión, por eso se solicita la impresión desde Main
        System.out.println("El resultado de la suma de los tributos es " + resultSum);
        System.out.println("El resultado de la multiplicación es " + resultMultiplication);
    }


}
