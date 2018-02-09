
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Pale
 */
public class Summary_ReportDAO {
    
        
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
    
    public Summary_ReportClass getSummaryInfo(String fuelID, double fuelPrice, String fuelType, String day) throws SQLException
    {
        Summary_ReportClass summarReport = null;
         //String query = "SELECT SUM(fuel_cost), SUM(fuel_dispensed) FROM services WHERE fuel_id = '" + fuelID + "' AND service_date like '%" + day + "%'";
         String query = "SELECT SUM(fuel_cost), SUM(fuel_dispensed) FROM services WHERE fuel_id = '01' AND service_date like '%2016-11-08%'";
        ResultSet rs = stat.executeQuery(query);
        
        if(rs.next())
        {
            summarReport = new Summary_ReportClass(fuelType, fuelPrice, rs.getDouble(1), rs.getDouble(1));
        }
        
        return summarReport;
    }
    
    public Summary_ReportClass getSummaryInfo(String fuelID, double fuelPrice, String fuelType) throws SQLException
    {
        Summary_ReportClass summarReport = null;
         //String query = "SELECT SUM(fuel_cost), SUM(fuel_dispensed) FROM services WHERE fuel_id = '" + fuelID + "' AND service_date like '%" + day + "%'";
         String query = "SELECT SUM(fuel_cost), SUM(fuel_dispensed) FROM services WHERE fuel_id = '01'";
        ResultSet rs = stat.executeQuery(query);
        
        if(rs.next())
        {
            summarReport = new Summary_ReportClass(fuelType, fuelPrice, rs.getDouble(1), rs.getDouble(1));
        }
        
        return summarReport;
    }
    
    public Summary_ReportClass getInfo() throws SQLException
    {
        Summary_ReportClass summarReport = null;
         //String query = "SELECT SUM(fuel_cost), SUM(fuel_dispensed) FROM services WHERE fuel_id = '" + fuelID + "' AND service_date like '%" + day + "%'";
         String query = "SELECT fuel_cost, fuel_dispensed dispensed FROM services WHERE fuel_id = 01";
        ResultSet rs = stat.executeQuery(query);
        if(rs.next())
        {
            summarReport = new Summary_ReportClass(rs.getDouble(2), rs.getDouble(1));
        }
        
        return summarReport;
    }
    
    
    public Summary_ReportClass comulatedVals(String fType, double price, String id, String date) throws SQLException
    {
        Summary_ReportClass vals = new Summary_ReportClass();
       
        String qry = "SELECT fuel_cost, fuel_dispensed FROM services WHERE fuel_id = '" + id + "' AND DATE_FORMAT( service_date,  '%Y-%m-%d' ) = '"+ date + "'";
        double fuelCost = 0.0;
        double fuelDispensed = 0.0;
        ResultSet rs = stat.executeQuery(qry);
        
        while(rs.next())
        {
           fuelCost = fuelCost + rs.getDouble(1);
           fuelDispensed = fuelDispensed + rs.getDouble(2);
        }
        
        vals = new Summary_ReportClass(fType, price, fuelDispensed, fuelCost);
        return vals;
    }
    
    public Summary_ReportClass comulatedWeekVals(String fType, double price, String id, int week) throws SQLException
    {
        Summary_ReportClass vals = new Summary_ReportClass();
       
        String qry = "SELECT fuel_cost, fuel_dispensed FROM services WHERE fuel_id = '" + id + "' AND WEEK(service_date) = "+ week + "";
        double fuelCost = 0.0;
        double fuelDispensed = 0.0;
        ResultSet rs = stat.executeQuery(qry);
        
        while(rs.next())
        {
           fuelCost = fuelCost + rs.getDouble(1);
           fuelDispensed = fuelDispensed + rs.getDouble(2);
        }
        
        vals = new Summary_ReportClass(fType, price, fuelDispensed, fuelCost);
        return vals;
    }
    
    
    public Summary_ReportClass summaryMonth(String fType, double price, String id, String month) throws SQLException
    {
        Summary_ReportClass vals = new Summary_ReportClass(); 
        String qry = "SELECT fuel_cost, fuel_dispensed FROM services WHERE fuel_id = '" + id + "' AND DATE_FORMAT(service_date, '%M') = '"+ month.trim() + "'";
        double fuelCost = 0.0;
        double fuelDispensed = 0.0;
        ResultSet rs = stat.executeQuery(qry);
        
        while(rs.next())
        {
           fuelCost = fuelCost + rs.getDouble(1);
           fuelDispensed = fuelDispensed + rs.getDouble(2);
        }
        
        vals = new Summary_ReportClass(fType, price, fuelDispensed, fuelCost);
        return vals;
    }
}
