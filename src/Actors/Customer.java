package Actors;

public class Customer extends Person{
    private static int card_number;
    private static String user_password;

    // the constructor
    public Customer(String name, String surname, int card_number, String user_password){
        super(name, surname);
        this.card_number = card_number;
        this.user_password = user_password;
    }

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
