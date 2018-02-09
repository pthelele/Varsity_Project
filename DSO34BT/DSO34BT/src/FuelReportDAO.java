
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WILBUR
 */
public class FuelReportDAO {
    
       private Connection conn;
    private Statement stat;
    private Connection_Class connObj;
    
    
    public void openConnection() throws ClassNotFoundException, SQLException
    {
        
        connObj = new Connection_Class();
         
        Class.forName(connObj.getClassFor());
        conn = DriverManager.getConnection(connObj.getConnString(),connObj.getUser() ,connObj.getPassword());
        stat= conn.createStatement();
    }
    
    public void closeConnection() throws SQLException
    {
        conn.close();
        stat.close();
    }
    /*method needs to be functional
    public synchronized void getFuelReport(String date) throws SQLException
    {
        String qry = "SELECT fuel.fuel_type, SUM(service.fuel_dispensed), SUM(service.fuel_cost) FROM fuel_table fuel, services service WHERE service.fuel_id = fuel.fuel_id"
    }*/ 
    
}
