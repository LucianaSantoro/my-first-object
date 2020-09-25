package ar.com.ar.online.second.inheritanceexercise;

import ar.com.ar.online.second.Override.Person;


public class Main {

    public static void main(String[] args) {


        Person personOne = new Person("Tu", "Vieja");
        Person personTwo = new Person("Tus", "Viejas");
        Person personThree = new Person("Tu", "Vieja");
        Person personFour = new Person("Aquella", "Vieja");

        System.out.println(personOne.equals(personTwo));
        System.out.println(personOne.equals(personThree));
        System.out.println(personOne.equals(personFour));

        System.out.println("personOne " + personOne + personOne.hashCode());
        System.out.println("personTwo " + personTwo + personTwo.hashCode());
        System.out.println("personThree " + personThree + personThree.hashCode());
        System.out.println("personFour " + personFour + personFour.hashCode());

        System.out.println(personOne.toString());
    }


}
