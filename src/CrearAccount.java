import java.util.Scanner;

import javax.xml.crypto.Data;

public class CrearAccount implements Menu{
static DataBase DataBase = new DataBase();
static Scanner in = new Scanner(System.in);
 static int lastid=0;

    @Override
    public void Menu() {
        CrearAccount();
    }


    public void CrearAccount()
    {
    int id = 100;

    Users User = new User();
    System.out.println("pleas enter your first name ");
    String Firstname = in.next();
    User.setFirstName(Firstname);
    System.out.println("pleas enter your Last name ");
    String Lastname = in.next();
    User.setLastName(Lastname);
    System.out.println("pleas enter your Balance");
    int balance = in.nextInt();
    User.setBalanc(balance);
    System.out.println("pleas enter your Password");
    String pass = in.next();
    System.out.println("pleas Confirm Password");
    String cPass = in.next();
    if(pass.equals(cPass))
    {
        User.setPassword(pass);
    }else{
        System.out.println("Not Matching ");
        return;
    }
    int UserId = id+lastid;
    User.setAccid(UserId);
    lastid++;
    System.out.println("Your Id Is :"+"{"+UserId+"}");
    DataBase.setUsers(User);
    System.out.println("Your Id Added Succesfully");
    // new Login().Menu();;
    DataBase.SaveUserData();
    Home h= new Home();
    h.Menu();


    }
    
}
