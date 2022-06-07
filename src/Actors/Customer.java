package Actors;

import java.util.ArrayList;

public class Customer extends Person{
    private static int card_number;
    private static String user_password;

    // the constructor
    public Customer(String name, String user_name, int card_number, String user_password){
        super(name, user_name);
        this.card_number = card_number;
        this.user_password = user_password;
        list_of_all_customers.add(this);
    }
    public static ArrayList<Customer> list_of_all_customers = new ArrayList<>();
    // the empty constructor
    public Customer(){}

    // getters and setters

    public static int getCard_number() {
        return card_number;
    }

    public static void setCard_number(int card_number) {
        Customer.card_number = card_number;
    }

    public static String getUser_password() {
        return user_password;
    }

    public static void setUser_password(String user_password) {
        Customer.user_password = user_password;
    }
}
