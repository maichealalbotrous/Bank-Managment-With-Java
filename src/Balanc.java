import java.util.Scanner;

public class Balanc implements Menu{
static DataBase DataBase = new DataBase();
static Scanner in = new Scanner(System.in);
    @Override
    public void Menu() {
        System.out.println("Pleas Enter Your Password:");
        String password = in.next();
        System.out.println("Pleas Enter Your id:");
        int id = in.nextInt();

        for (Users User : DataBase.getUsers()) {
            if(User.getPassword().equals(password)&& User.getAccid() ==id)
            {
                System.out.println("Your Balanc is : {"+User.getBalanc()+"}" );

                User.Menu();
            }
    }
}
}
