package Actors;

public class Person {
    private static String name;
    private static String user_name;

    // the constructor
    public Person(String name, String user_name){
        this.name= name;
        this.user_name = user_name;
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

    public static String getUser_name() {
        return user_name;
    }

    public static void setUser_name(String user_name) {
        Person.user_name = user_name;
    }

}
