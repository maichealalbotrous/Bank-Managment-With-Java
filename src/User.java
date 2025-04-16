import java.util.Scanner;

public class User extends Users implements Menu {
    static Scanner in = new Scanner(System.in);

    Menu[] operation = new Menu[] {
            new Deposits(),
            new WithDraw(),
            new Balanc(),
            new Home(),
    };

    @Override
    public String toString() {
        return getFirstName() + "</N>" + getPassword() + "</N>" + getLastName() + "</N>" + getBalanc() + "</N>"
                + getAccid() + "</NewUser>";
    }

    @Override
    public void Menu() {

        System.out.println("(1):Deposits\n (2):WithDraw\n (3):Balanc \n (4):Menu");
        int i = in.nextInt();
        operation[i - 1].Menu();
    }

}
