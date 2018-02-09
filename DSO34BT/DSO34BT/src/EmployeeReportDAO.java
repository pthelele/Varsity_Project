
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class EmployeeReportDAO {
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
    
    public String getFuelID(String fuelType) throws SQLException
    {
        String fuel_id = "";
        String qry = "SELECT fuel_id FROM fuel_table WHERE fuel_type = '" +fuelType+"'";
        ResultSet result = statement.executeQuery(qry);
        if(result.next())
        {
            fuel_id = result.getString(1);
        }
        return fuel_id;
    }
    
    public ArrayList<EmployeeReport> getReportAll(String date, String emp_id, String fueltype) throws SQLException
    {
        ArrayList<EmployeeReport> empList = new ArrayList<EmployeeReport>();
        EmployeeReport empRep = new EmployeeReport();
        //String emp_id, String emp_lname, String emp_fname, String fuelType, double fuel_cost, double fuelDispensed, String serviceDate)
        String qry = "SELECT employee.emp_id, employee.emp_lname, employee.emp_fname, fuel_table.fuel_type, services.fuel_cost, services.fuel_dispensed, services.service_date FROM services, employee, fuel_table WHERE services.emp_id = employee.emp_id AND services.fuel_id = fuel_table.fuel_id AND DATE_FORMAT(services.service_date, '%Y-%m-%d') LIKE '%"+  date + "%' AND services.emp_id = '" + emp_id + "' AND services.fuel_id = '" + getFuelID(fueltype) + "'";
        ResultSet rs = statement.executeQuery(qry);
        
        while(rs.next())
        {
            empRep = new EmployeeReport(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5), rs.getDouble(6), rs.getString(7));
            empList.add(empRep);
        }
        
    return empList;
    }
    
    
    public ArrayList<EmployeeReport> getReportByIdDate(String date, String empId) throws SQLException
    {
        ArrayList<EmployeeReport> empList = new ArrayList<EmployeeReport>();
        EmployeeReport empRep = new EmployeeReport();
        
        String qry = "SELECT employee.emp_id, employee.emp_lname, employee.emp_fname, fuel_table.fuel_type, services.fuel_cost, services.fuel_dispensed, services.service_date FROM services, employee, fuel_table WHERE services.emp_id = employee.emp_id AND services.fuel_id = fuel_table.fuel_id AND DATE_FORMAT(services.service_date, '%Y-%m-%d') LIKE '%"+  date + "%' AND services.emp_id = '" + empId + "'"; // AND services.fuel_id = '" ; + getFuelID(fueltype) + "'";
        ResultSet rs = statement.executeQuery(qry);
        
        while(rs.next())
        {
            empRep = new EmployeeReport(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5), rs.getDouble(6), rs.getString(7));
            empList.add(empRep);
        }
        
    return empList;
        
    }
    
     public ArrayList<EmployeeReport> getReportByDate(String date) throws SQLException
    {
        ArrayList<EmployeeReport> empList = new ArrayList<EmployeeReport>();
        EmployeeReport empRep = new EmployeeReport();
        //String emp_id, String emp_lname, String emp_fname, String fuelType, double fuel_cost, double fuelDispensed, String serviceDate)
        String qry = "SELECT employee.emp_id, employee.emp_lname, employee.emp_fname, fuel_table.fuel_type, services.fuel_cost, services.fuel_dispensed, services.service_date FROM services, employee, fuel_table WHERE services.emp_id = employee.emp_id AND services.fuel_id = fuel_table.fuel_id AND DATE_FORMAT(services.service_date, '%Y-%m-%d') LIKE '%"+  date + "%'"; // AND services.emp_id = '" + empId + "'"; // AND services.fuel_id = '" ; + getFuelID(fueltype) + "'";
        ResultSet rs = statement.executeQuery(qry);
        
        while(rs.next())
        {
            empRep = new EmployeeReport(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5), rs.getDouble(6), rs.getString(7));
            empList.add(empRep);
        }
        
    return empList;
        
    }
     
     
        public ArrayList<EmployeeReport> getReportByID(String emp_id) throws SQLException
    {
        ArrayList<EmployeeReport> empList = new ArrayList<EmployeeReport>();
        EmployeeReport empRep = new EmployeeReport();
        //String emp_id, String emp_lname, String emp_fname, String fuelType, double fuel_cost, double fuelDispensed, String serviceDate)
        String qry = "SELECT employee.emp_id, employee.emp_lname, employee.emp_fname, fuel_table.fuel_type, services.fuel_cost, services.fuel_dispensed, services.service_date FROM services, employee, fuel_table WHERE services.emp_id = employee.emp_id AND services.fuel_id = fuel_table.fuel_id AND services.emp_id LIKE '%"+  emp_id + "%'"; // AND services.emp_id = '" + empId + "'"; // AND services.fuel_id = '" ; + getFuelID(fueltype) + "'";
        ResultSet rs = statement.executeQuery(qry);
        
        while(rs.next())
        {
            empRep = new EmployeeReport(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5), rs.getDouble(6), rs.getString(7));
            empList.add(empRep);
        }
        
    return empList;
        
    }
        
        
          public ArrayList<EmployeeReport> getReportByFtypeID(String emp_id, String fuelType) throws SQLException
    {
        ArrayList<EmployeeReport> empList = new ArrayList<EmployeeReport>();
        EmployeeReport empRep = new EmployeeReport();
        //String emp_id, String emp_lname, String emp_fname, String fuelType, double fuel_cost, double fuelDispensed, String serviceDate)
        String qry = "SELECT employee.emp_id, employee.emp_lname, employee.emp_fname, fuel_table.fuel_type, services.fuel_cost, services.fuel_dispensed, services.service_date FROM services, employee, fuel_table WHERE services.emp_id = employee.emp_id AND services.fuel_id = fuel_table.fuel_id AND services.emp_id LIKE '%"+  emp_id + "%' AND services.fuel_id = '" + getfuelId(fuelType).trim() + "'"; // AND services.emp_id = '" + empId + "'"; // AND services.fuel_id = '" ; + getFuelID(fueltype) + "'";
        ResultSet rs = statement.executeQuery(qry);
        
        while(rs.next())
        {
            empRep = new EmployeeReport(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5), rs.getDouble(6), rs.getString(7));
            empList.add(empRep);
        }
        
    return empList;
        
    }
          
     
     public String getfuelId(String fuelType) throws SQLException
    {
        String f_id = "";
        
        String qery = "SELECT fuel_id FROM fuel_table WHERE fuel_type = '" + fuelType + "'";
        ResultSet rs = statement.executeQuery(qery);
        
        if(rs.next())
        {
            f_id = rs.getString(1);
        }
       
        return f_id;
    }
     
     public ArrayList<EmployeeReport> getReportByFtypeDate(String date, String fuelType) throws SQLException
    {
        ArrayList<EmployeeReport> empList = new ArrayList<EmployeeReport>();
        EmployeeReport empRep = new EmployeeReport();
        //String emp_id, String emp_lname, String emp_fname, String fuelType, double fuel_cost, double fuelDispensed, String serviceDate)
        String qry = "SELECT employee.emp_id, employee.emp_lname, employee.emp_fname, fuel_table.fuel_type, services.fuel_cost, services.fuel_dispensed, services.service_date FROM services, employee, fuel_table WHERE services.emp_id = employee.emp_id AND services.fuel_id = fuel_table.fuel_id AND DATE_FORMAT(services.service_date) LIKE '%"+  date + "%' AND services.fuel_id = '" + getfuelId(fuelType).trim() + "'"; // AND services.emp_id = '" + empId + "'"; // AND services.fuel_id = '" ; + getFuelID(fueltype) + "'";
        ResultSet rs = statement.executeQuery(qry);
        
        while(rs.next())
        {
            empRep = new EmployeeReport(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5), rs.getDouble(6), rs.getString(7));
            empList.add(empRep);
        }
        
    return empList;
        
    }
     
     
     
      public ArrayList<EmployeeReport> getReportByFtype(String ftype) throws SQLException
    {
        ArrayList<EmployeeReport> empList = new ArrayList<EmployeeReport>();
        EmployeeReport empRep = new EmployeeReport();
        //String emp_id, String emp_lname, String emp_fname, String fuelType, double fuel_cost, double fuelDispensed, String serviceDate)
        String qry = "SELECT employee.emp_id, employee.emp_lname, employee.emp_fname, fuel_table.fuel_type, services.fuel_cost, services.fuel_dispensed, services.service_date FROM services, employee, fuel_table WHERE services.emp_id = employee.emp_id AND services.fuel_id = fuel_table.fuel_id AND services.fuel_id LIKE '%"+  getfuelId(ftype) + "%'"; // AND services.emp_id = '" + empId + "'"; // AND services.fuel_id = '" ; + getFuelID(fueltype) + "'";
        ResultSet rs = statement.executeQuery(qry);
        
        while(rs.next())
        {
            empRep = new EmployeeReport(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5), rs.getDouble(6), rs.getString(7));
            empList.add(empRep);
        }
        
    return empList;
        
    }
     
  
     
     
}
