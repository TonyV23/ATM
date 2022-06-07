package Models;

import Actors.Customer;

import java.util.ArrayList;

public class Signup {
    private Customer customer;

    //the constructor
    public Signup(Customer customer){
        this.customer = customer;
        list_of_all_customers.add(customer);
    }

    // the empty constructor
    public Signup(){}

    private static final ArrayList<Customer> list_of_all_customers = new ArrayList<>();

    public static ArrayList<Customer> getList_of_all_customers(){
        return list_of_all_customers;
    }

}
