
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WILBUR
 */
public class User {
    
    private static String idLogger;
    private static String userName;
    private static String userSurname;
    
    public User()
    {
        
    }
    
    public User(String id, String userName, String userSurname)
    {
        this.idLogger = id;
        this.userName = userName;
        this.userSurname = userSurname;
        
    }

    public  void setIdLogger(String idLogger) {
        User.idLogger = idLogger;
    }



    public  String getIdLogger() {
        return idLogger;
    }

    public String getUserName(){
        
        return userName;
    }
    
    public String getUserSurname()
    {
        
        return userSurname;
    }
    
    
}
