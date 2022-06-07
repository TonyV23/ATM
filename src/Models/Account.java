package Models;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class Account {

    // the empty constructor
    public Account(){}

    Date date = new Date();

    public void createNewAccount(ArrayList<String> list_of_customers) throws IOException {
        String pathname = "D:\\WORK_SPACE\\PERSONAL\\JAVA\\ATM\\src\\DataBaseUser\\";
        File database_of_customers = new File(pathname+"database_of_customers");
        if (!database_of_customers.exists()){
            database_of_customers.createNewFile();

        }else{
            FileWriter fileWriter = new FileWriter(database_of_customers,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String [] user_argument = new String [] { "name", "surname", "card number", "userPassword"};
            bufferedWriter.write("**********"+date.getDate()+"/"+Integer.parseInt(String.valueOf(date.getMonth()+1))+"/"+"2022 "+"à "+date.getHours()+":"+ date.getMinutes()+":"+date.getSeconds()+"**********");
            bufferedWriter.newLine();

            for (int i = 0; i < list_of_customers.size(); i++) {
                bufferedWriter.write("&"+list_of_customers.get(i));
                bufferedWriter.newLine();
                if (i+1 ==list_of_customers.size())
                    bufferedWriter.close();
            }
        }
    }


}
