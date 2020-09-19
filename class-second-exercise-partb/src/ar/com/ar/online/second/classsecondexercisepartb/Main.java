package ar.com.ar.online.second.classsecondexercisepartb;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        // Cálculo del vencimiento

        Scanner keyboard = new Scanner(System.in);

        Item productToCheck = new Item();

        System.out.println("Ingrese el nombre del producto.");
        productToCheck.name = keyboard.nextLine();
        //si no es co nextline no toma productos coon dos palabras

        System.out.println("Ingrese el precio del producto.");
        // productToCheck.price = keyboard.nextDouble();
        // si da error porque se pone con coma se puede hacer un wrapper y convertirlo en double
        productToCheck.price = Double.valueOf(keyboard.next())

        System.out.println("Ingrese la fecha de vencimiento en formato dd-MM-yyyy");
        // creación de variable temporal para capturar la fecha que introduce el usuario. La introduce en formato String
        String date = keyboard.next();
        // asignación del valor al método del objeto + conversión a tipo Date del String CON EL FORMATO EXACTO de SDFormat
        productToCheck.expirationDate = dateFormat.parse(date);
        // conversión directa productToCheck.expirationDate = dateFormat.parse(keyboard.next());

        productToCheck.calculateTax();

        if (productToCheck.canItBeSold()){
            System.out.printf("- Nombre: %s\n" + "-Precio: %.2f\n" + "- Impuesto: %.2f\n" + "- Total a pagar: %.2f",
                    productToCheck.name,
                    productToCheck.price,
                    productToCheck.tax,
                    productToCheck.getTotalTPay());
        } else {
            System.out.println("Este producto no está habilitado para la venta.");
        }
    }
}
