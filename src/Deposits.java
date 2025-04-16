import java.util.Scanner;

import javax.xml.crypto.Data;

public class Deposits implements Menu {
static DataBase DataBase = new DataBase();
static Scanner in = new Scanner(System.in);
    @Override
    public void Menu() {
        System.out.println("Enter Your Mount");
        int Mount = in.nextInt();
        System.out.println("Pleas Enter Your Password:");
        String password = in.next();
        System.out.println("Pleas Enter Your id:");
        int id = in.nextInt();
        boolean done=false;
        for (Users User : DataBase.getUsers()) {
            if(User.getPassword().equals(password)&& User.getAccid() ==id)
            {
                done = true;
                User.setBalanc(User.getBalanc() + Mount);
            System.out.println("the operation was completed !");
            DataBase.SaveUserData();
                User.Menu();

                break;
            }
        }
     
        
    }
    
}
