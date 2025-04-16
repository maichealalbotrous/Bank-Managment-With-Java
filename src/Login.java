import java.util.Scanner;

public class Login implements Menu {
static DataBase DataBase = new DataBase();
static Scanner in = new Scanner(System.in);


    @Override
    public void Menu() {
        Login();
    }


    public void Login()
    {
        System.out.println("pleas enter your password:");
        String password =in.next();
        System.out.println("Pleas enter your id:");
        int id = in.nextInt();
        int i=-1;
        for (Users user : DataBase.getUsers()) {
            if(user.getAccid()==id && user.getPassword().equals(password))
            {
                i = DataBase.UsersList.indexOf(user);
              Users  UserMenu=  DataBase.UsersList.get(i);
              UserMenu.Menu();
              break;
              
            }
        }
        if(i==-1)
        {
            System.out.println("the user not found");
            Home h = new Home();
            h.Menu();
        }
    } 
    
}
