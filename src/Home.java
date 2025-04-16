import java.util.Scanner;

public class Home implements Menu {
    static Scanner in = new Scanner(System.in);

    public Home() {
    }

    @Override
    public void Menu() {
        System.out.println("Welcome to bank system\n (1)Login\n (2)Creat New Account \n(3) Exite");

        int chois = in.nextInt();

        while (chois != 3) {
            switch (chois) {
                case 1:
                    new Login().Menu();
                    break;
                case 2:
                    new CrearAccount().Menu();
                    break;
                default:
                    break;
            }
        } ;

    };

}
