
public class Connection_Class {
    
    private String connString;
    private String user;
    private String password;
    private String classFor;

    public Connection_Class() {
        this.connString = "jdbc:mysql://www.fuelmanza.co.za/fuelmdbd_base";
        //this.connString = "jdbc:mysql://localhost:3306/fuelmdb_base";
        //this.user = "root";
        this.user = "fuelmdbd_root";
        this.password = "Xaya4087";
        this.classFor = "com.mysql.jdbc.Driver";
    }

    public String getConnString() {
        return connString;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getClassFor() {
        return classFor;
    }
    
}
