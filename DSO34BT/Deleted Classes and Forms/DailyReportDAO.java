
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WILBUR
 */
public class DailyReportDAO {
    
      private Connection connection;
    private Statement statement;
    private Connection_Class conn;
    
    public void openConn() throws ClassNotFoundException, SQLException
    {
        conn = new Connection_Class();
        Class.forName(conn.getClassFor());
        connection = DriverManager.getConnection(conn.getConnString(),conn.getUser() ,conn.getPassword());
        statement = connection.createStatement();
    }
    
    public void closeConn() throws SQLException
    {
        connection.close();
        statement.close();
    }
    
    public ArrayList<DailyReportClass> getDailyReport(String date) throws SQLException
    {
        DailyReportClass reportObj = null;
        ArrayList<DailyReportClass> report = new ArrayList<DailyReportClass>();
        String qry = "SELECT employee.emp_fname, employee.emp_lname , services.service_date, employee.emp_id, services.fuel_dispensed, fuel_table.fuel_type, dispensers.dispenser_id\n" +
                    "FROM employee, dispensers, fuel_table, services\n" +
                    "WHERE employee.emp_id = services.emp_id\n" +
                    "AND fuel_table.fuel_id = services.fuel_id\n" +
                    "AND dispensers.dispenser_id =services.dispenser_id\n" +
                    "AND services.service_date like '%" + date +"%'";
        
        ResultSet rs = statement.executeQuery(qry);
        
        while(rs.next())
        {
             //public DailyReportClass(String fname, String lname, String date, String empId, double fuelDispensed, String fuelType, String dispenserId) {
   
            reportObj = new DailyReportClass(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5), rs.getString(6), rs.getString(7));
            report.add(reportObj);
        }
        
        return report;
    }
    
    public double getDispensed() throws SQLException
    {
        double amount = 0.0;
        String query = "SELECT SUM(fuel_dispensed) FROM services";
        ResultSet rs = statement.executeQuery(query);
        
        if(rs.next())
        {
            amount = rs.getDouble(1);
        }
        
        return amount;
    }
    
}
