abstract public class Users implements Menu{

 private String  FirstName;
 private String  LastName;
 private String  password;
 private int Balanc  ;
 private int accid  ;

 public Users() {
}
public String getFirstName() {
    return FirstName;
}
public void setFirstName(String firstName) {
    FirstName = firstName;
}
public String getPassword() {
    return password;
}
public void setPassword(String password) {
    this.password = password;
}
public String getLastName() {
    return LastName;
}

public void setLastName(String lastName) {
    LastName = lastName;
}
public int getBalanc() {
    return Balanc;
}
public void setBalanc(int balanc) {
    Balanc = balanc;
}
public int getAccid() {
    return accid;
}
public void setAccid(int  accid) {
    this.accid = accid;
}



    
}
