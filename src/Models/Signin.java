package Models;

import java.io.*;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;

public class Signin {

    // the empty constructor
    public Signin(){}

    public static Hashtable<String,String> hashtable=new Hashtable<String,String>();
    public static ArrayList<String> key=new ArrayList<>();
    private static ArrayList<String> value=new ArrayList<>();
    private static ArrayList<String>key_value=new ArrayList<>();
    private  static LinkedList<String> linkedList=new LinkedList<>();

    public boolean isConnected(String user_name, String user_password){
        try{
            if(Signin.hashtable.get(user_name).contentEquals(user_password)){
                System.out.print("You have been connected successfully");
                return true;
            }
            return false;
        }catch (NullPointerException e){
            System.err.print("Oops credentials entered are not valid please try again !!");
            return false;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    public void separation(){
        for (int i = 0; i < key_value.size(); i++) {
            if(i%2==0){
                key.add(key_value.get(i));
            }
            if(i%2!=0){
                value.add(key_value.get(i));
            }
        }
        for (int i = 0; i < key_value.size()/2; i++) {
            hashtable.put(key.get(i),value.get(i));
        }

    }

    public void read() throws IOException {
        String pathname = "D:\\WORK_SPACE\\PERSONAL\\JAVA\\ATM\\src\\DataBase\\";

        File database_of_customers = new File(pathname+"database_of_customers.txt");
        if(!database_of_customers.exists()){
            database_of_customers.createNewFile();
        }else {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(database_of_customers),"UTF-8"));
            String line = reader.readLine();
            while (line != null){
                if(line.contains("&")){
                    line = line.replaceFirst("&","");
                    key_value.add(line);
                }
                line=reader.readLine();
            }
            reader.close();
        }
    }
}
