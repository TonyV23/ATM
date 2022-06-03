package Actors;

public class Person {
    private static String name;
    private static String surname;

    // the constructor
    public Person(String name, String surname){
        this.name= name;
        this.surname = surname;
    }

    // the empty constructor
    public Person(){}


    // getters and setters
    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Person.name = name;
    }

    public static String getSurname() {
        return surname;
    }

    public static void setSurname(String surname) {
        Person.surname = surname;
    }

}
