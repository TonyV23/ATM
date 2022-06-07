package Models;

import Actors.Customer;
import GiveMe.InputOutput;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class Account {

    // the empty constructor
    public Account(){}

    static Date date = new Date();

    public static void createNewAccount(ArrayList<String> registerCustomer) throws IOException {
        String pathname = "D:\\WORK_SPACE\\PERSONAL\\JAVA\\ATM\\src\\DataBase\\";
        File database_of_customers = new File(pathname+"database_of_customers.txt");
        if (!database_of_customers.exists()){
            database_of_customers.createNewFile();

        }else{
            FileWriter fileWriter = new FileWriter(database_of_customers,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String[] parameters = new String[] {"user_name", "user_password" };
            bufferedWriter.write("-----------"+date.getDate()+"/"+Integer.parseInt(String.valueOf(date.getMonth()+1))+"/"+"2022 "+"à "+date.getHours()+":"+ date.getMinutes()+":"+date.getSeconds()+"------------");
            bufferedWriter.newLine();
            for (int i = 0; i <registerCustomer.size(); i++) {
                bufferedWriter.write("&"+registerCustomer.get(i));
                bufferedWriter.newLine();
                if(i+1==registerCustomer.size()){
                    bufferedWriter.close();}
            }

        }
    }
}
