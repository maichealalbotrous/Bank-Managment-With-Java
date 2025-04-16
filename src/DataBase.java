import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.crypto.Data;


public class DataBase {
    static List<Users> UsersList = new ArrayList<>();
    File file = new File("Data/Users.txt");

    public void GetUserData() {
        String text = "";
        try {
            BufferedReader bd = new BufferedReader(new FileReader(file));
            String s;
            while ((s = bd.readLine()) != null) {
                text += s;
            }
            String[] array = text.split("</NewUser>");
            for (String h : array) {
                Users User = new User();
                String[] array2 = h.split("</N>");
                if (array2.length > 1) {
                    User.setFirstName(array2[0]);
                    User.setPassword(array2[1]);
                    User.setLastName(array2[2]);
                    User.setBalanc(Integer.parseInt(array2[3]));
                    User.setAccid(Integer.parseInt(array2[4]));
                    UsersList.add(User);
                }

            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void SaveUserData() {
        String text = "";
        for (Users user : UsersList) {
            StringBuilder bd = new StringBuilder();
            bd.append(user.getFirstName()).append("</N>");
            bd.append(user.getPassword()).append("</N>");
            bd.append(user.getLastName()).append("</N>");
            bd.append(user.getBalanc()).append("</N>");
            bd.append(user.getAccid()).append("</N>");
            text += bd.toString();
        }
        File newfile = new File("Data/Users.txt");
        try {
            PrintWriter p = new PrintWriter(new FileWriter(newfile));
            p.print(text);
            p.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public DataBase() {
        GetUserData();
    }

    public List<Users> getUsers() {
        return UsersList;
    }

    public void setUsers(Users user) {
        UsersList.add(user);
    }

}
