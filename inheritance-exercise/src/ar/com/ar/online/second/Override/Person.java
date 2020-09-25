package ar.com.ar.online.second.Override;

import java.util.Objects;

public class Person {

    // atributos
    private String name;
    private String lastName;

    // CONSTRUCTORES
    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return String.format(
                "Person = { name = %s, lastName = %s }",
                this.name,
                this.lastName
        );
    }

    @Override
    public int hashCode() {
        return -42 * Objects.hash (this.name, this.lastName) ;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null ||this.getClass() != obj.getClass())return false;
        Person that = (Person) obj;
        return this.getName().equals(that.getName()) &&
                this.getLastName().equals(that.getLastName());
    }
}
