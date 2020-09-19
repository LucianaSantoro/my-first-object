package ar.com.ar.online.second.secondexerciseclasses;

public class Main {

    public static void main(String[] args) {

        // creación de objetos
        Animal perro = new Animal();
        Vehicle corsa = new Vehicle();
        Person lu = new Person();

        // llamado y llenado de atributos
        perro.breed = "Flojo de papeles";
        perro.color = "Negro, marrón y blanco";
        perro.name = "Atenea.";

        corsa.brand = "Chevrolet";
        corsa.color = "Azul";
        corsa.maxSpeed = "LOQUEDE";

        lu.age = 31;
        lu.lastName = "Santorto";
        lu.name = "Lu";

        System.out.println("El perro es un " + perro.breed + " de color " + perro.color + " y se llama " + perro.name);
        perro.sleep();

        System.out.println("El auto es un " + corsa.brand + " de color " + corsa.color + "y su velocidad máxima es " +
                corsa.maxSpeed);
        corsa.brake();

        System.out.println("Mi nombre es " + lu.name + ", mi apellido es " + lu.lastName + " y tengo " + lu.age + " años.");
        lu.play();

    }
}
