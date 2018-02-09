
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ServiceDAO {
    private Statement stat;
    private Connection conn;
    private Connection_Class connObj;
    
    //
    
    public void openConnection() throws ClassNotFoundException, SQLException
    {
        connObj = new Connection_Class();
         
        Class.forName(connObj.getClassFor());
        conn = DriverManager.getConnection(connObj.getConnString(),connObj.getUser() ,connObj.getPassword());
        stat= conn.createStatement();
    }
    
    public void closeConnetion() throws SQLException
    {
        conn.close();
        stat.close();
    }
    
    public synchronized int insertService(ServiceClass service) throws SQLException
    {
        int row = 0;
       String qry = "INSERT INTO services( service_date, fuel_dispensed, fuel_cost, fuel_id, emp_id, dispenser_id, tank_id) VALUES('" + service.getServiceDate()+ "'," + service.getFuelDispened() + "," + service.getFuel_cost() + ", '" + service.getFuelId() + "' , '" + service.getEmpId() + "', '" + service.getDispenserId() + "', '" + service.getTankId() + "')";
       row = stat.executeUpdate(qry);
        
        return row;
    }
    
   public synchronized ArrayList<ServiceClass> getServiceByDay(String day) throws SQLException{
   ArrayList<ServiceClass> service = new ArrayList<ServiceClass>();
   
   String sql ="SELECT  service_date,fuel_dispensed, fuel_type,emp_fname,emp_lname, tank_id FROM services, employee,fuel_table WHERE service_date like '%" + day + "%' AND services.fuel_id = fuel_table.fuel_id AND services.emp_id = employee.emp_id";
   
   ResultSet rs = stat.executeQuery(sql);
   while(rs.next()){
   ServiceClass s = new ServiceClass();
   s.setServiceDate(rs.getString(1));
   s.setEmp_fname(rs.getString(4));
   s.setFuel_type(rs.getString(3));
   s.setEmp_lname(rs.getString(5));
   s.setTankId(rs.getString(6));
   s.setFuelDispened(rs.getDouble(2));
   service.add(s);
   }
   return service;
   }
    
    public synchronized ArrayList<ServiceClass> getServiceByMonth(String day) throws SQLException
    {
        ArrayList<ServiceClass> service = new ArrayList<ServiceClass>();

          String sql ="SELECT  service_date,fuel_dispensed, fuel_type,emp_fname,emp_lname, tank_id FROM services, employee,fuel_table WHERE DATE_FORMAT(services.service_date, '%M') like '%" + day + "%' AND services.fuel_id = fuel_table.fuel_id AND services.emp_id = employee.emp_id";
          ResultSet rs = stat.executeQuery(sql);
        while(rs.next())
            {
                ServiceClass s = new ServiceClass();
                s.setServiceDate(rs.getString(1));
                s.setEmp_fname(rs.getString(4));
                s.setFuel_type(rs.getString(3));
                s.setEmp_lname(rs.getString(5));
                s.setTankId(rs.getString(6));
                s.setFuelDispened(rs.getDouble(2));
                service.add(s);
           }
        return service;
   }
    
    public ArrayList<ServiceClass> getServicebyWeek(int weekNum) throws SQLException
    {
        ArrayList<ServiceClass> serviceList = new ArrayList<ServiceClass>();
         String sql ="SELECT  service_date,fuel_dispensed, fuel_type,emp_fname,emp_lname, tank_id FROM services, employee,fuel_table WHERE WEEK(service_date) = " + weekNum + " AND services.fuel_id = fuel_table.fuel_id AND services.emp_id = employee.emp_id";
   
       ResultSet rs = stat.executeQuery(sql);
            while(rs.next())
            {
                ServiceClass s = new ServiceClass();
                s.setServiceDate(rs.getString(1));
                s.setEmp_fname(rs.getString(4));
                s.setFuel_type(rs.getString(3));
                s.setEmp_lname(rs.getString(5));
                s.setTankId(rs.getString(6));
                s.setFuelDispened(rs.getDouble(2));
                serviceList.add(s);
            }
            return serviceList;
    }
    
    public ArrayList<ServiceClass> getPerformance(String emp_id) throws SQLException
    {
        ArrayList<ServiceClass> list = new ArrayList<ServiceClass>();
        ServiceClass serviceObj = new ServiceClass();
        String query = "SELECT service.emp_id, employee.emp_fname, employee.emp_lname, fuel.fuel_type, service.fuel_dispensed, service.fuel_cost FROM services service, fuel_table fuel, employee WHERE service.emp_id = employee.emp_id AND service.fuel_id = fuel.fuel_id AND service.emp_id = '" + emp_id + "' ORDER BY services.emp_id";
        ResultSet rs = stat.executeQuery(query);
        
        while(rs.next())
        {
            //public ServiceClass(double fuelDispened, double fuel_cost, String fuel_type, String empId, String emp_lname, String emp_fname) {
    
            serviceObj = new ServiceClass(rs.getDouble(5), rs.getDouble(6), rs.getString(4), rs.getString(1), rs.getString(3), rs.getString(2));
            list.add(serviceObj);
        }
        
        return list;
    }
    
    public ArrayList<ServiceClass> getEmpReport(String date) throws SQLException
    {
        ArrayList<ServiceClass> empReport = new ArrayList<ServiceClass>();
        ServiceClass serviceInfo = null;
        String query = "SELECT employee.emp_fname, employee.emp_lname, services.emp_id, DATE_FORMAT(services.service_date, '%Y-%m-%d'), fuel_table.fuel_type, services.fuel_dispensed, services.fuel_cost FROM services, fuel_table, employee WHERE services.emp_id = employee.emp_id AND services.fuel_id = fuel_table.fuel_id AND DATE_(services.service_date, '%Y-%m-%d') = '" + date + "' ORDER BY services.emp_id";
        ResultSet result = stat.executeQuery(query);
        
        while(result.next())
        {
            //(double fuelDispened, double fuel_cost, String fuel_type, String empId, String emp_lname, String emp_fname) {
        
            serviceInfo = new ServiceClass(result.getDouble(6), result.getDouble(7), result.getString(5), result.getString(3), result.getString(1), result.getString(2), result.getString(4));
            empReport.add(serviceInfo);
        }

        return empReport;
    }
     
    public ArrayList<ServiceClass> getPerfReport(String date, String emp_id) throws SQLException
    {
        //Daily
        ArrayList<ServiceClass> reList = new ArrayList<>();
         ServiceClass servClass = new ServiceClass();
        String sequel = "SELECT services.emp_id, employee.emp_fname, employee.emp_lname, fuel_table.fuel_type, services.fuel_dispensed, services.fuel_cost FROM services, employee, fuel_table WHERE services.emp_id = employee.emp_id AND services.fuel_id = fuel_table.fuel_id AND DATE_FORMAT(services.service_date, '%Y-%m-%d') = '" + date + "'AND services.emp_id = '" + emp_id + "' ORDER BY services.emp_id";
        ResultSet rs = stat.executeQuery(sequel);
        
        while(rs.next())
        {
            //public ServiceClass(double fuelDispened, double fuel_cost, String fuel_type, String empId, String emp_lname, String emp_fname)
            servClass = new ServiceClass(rs.getDouble(5), rs.getDouble(6), rs.getString(4), rs.getString(1), rs.getString(3), rs.getString(2));
            reList.add(servClass);
        }
        
        return reList;
    }
    
     public ArrayList<ServiceClass> getPerfReportWeek(int week, String emp_id) throws SQLException
    {
        ArrayList<ServiceClass> reList = new ArrayList<>();
         ServiceClass servClass = new ServiceClass();
        String sequel = "SELECT services.emp_id, employee.emp_fname, employee.emp_lname, fuel_table.fuel_type, services.fuel_dispensed, services.fuel_cost FROM services, employee, fuel_table WHERE services.emp_id = employee.emp_id AND services.fuel_id = fuel_table.fuel_id AND week(services.service_date) = " + week + " AND services.emp_id = '" + emp_id + "' ORDER BY services.emp_id";
        ResultSet rs = stat.executeQuery(sequel);
        
        while(rs.next())
        {
            //public ServiceClass(double fuelDispened, double fuel_cost, String fuel_type, String empId, String emp_lname, String emp_fname)
            servClass = new ServiceClass(rs.getDouble(5), rs.getDouble(6), rs.getString(4), rs.getString(1), rs.getString(3), rs.getString(2));
            reList.add(servClass);
        }
        
        return reList;
    }
     
      public ArrayList<ServiceClass> getPerfReportWeek(int week) throws SQLException
    {
        ArrayList<ServiceClass> reList = new ArrayList<>();
         ServiceClass servClass = new ServiceClass();
        String sequel = "SELECT services.emp_id, employee.emp_fname, employee.emp_lname, fuel_table.fuel_type, services.fuel_dispensed, services.fuel_cost FROM services, employee, fuel_table WHERE services.emp_id = employee.emp_id AND services.fuel_id = fuel_table.fuel_id AND week(services.service_date) = " + week + " ORDER BY services.emp_id";
        ResultSet rs = stat.executeQuery(sequel);
        
        while(rs.next())
        {
            //public ServiceClass(double fuelDispened, double fuel_cost, String fuel_type, String empId, String emp_lname, String emp_fname)
            servClass = new ServiceClass(rs.getDouble(5), rs.getDouble(6), rs.getString(4), rs.getString(1), rs.getString(3), rs.getString(2));
            reList.add(servClass);
        }
        
        return reList;
    }
     
      public ArrayList<ServiceClass> getPerfReportMonth(String month, String emp_id) throws SQLException
    {
        ArrayList<ServiceClass> reList = new ArrayList<>();
         ServiceClass servClass = new ServiceClass();
        String sequel = "SELECT services.emp_id, employee.emp_fname, employee.emp_lname, fuel_table.fuel_type, services.fuel_dispensed, services.fuel_cost FROM services, employee, fuel_table WHERE services.emp_id = employee.emp_id AND services.fuel_id = fuel_table.fuel_id AND DATE_FORMAT(services.service_date, '%M-') LIKE '%" + month + "%'AND services.emp_id = '" + emp_id + "' ORDER BY services.emp_id";
        ResultSet rs = stat.executeQuery(sequel);
        
        while(rs.next())
        {
            //public ServiceClass(double fuelDispened, double fuel_cost, String fuel_type, String empId, String emp_lname, String emp_fname)
            servClass = new ServiceClass(rs.getDouble(5), rs.getDouble(6), rs.getString(4), rs.getString(1), rs.getString(3), rs.getString(2));
            reList.add(servClass);
        }
        
        return reList;
    }
      
        public ArrayList<ServiceClass> getPerfReportMonth(String month) throws SQLException
    {
        ArrayList<ServiceClass> reList = new ArrayList<>();
         ServiceClass servClass = new ServiceClass();
        String sequel = "SELECT services.emp_id, employee.emp_fname, employee.emp_lname, fuel_table.fuel_type, services.fuel_dispensed, services.fuel_cost FROM services, employee, fuel_table WHERE services.emp_id = employee.emp_id AND services.fuel_id = fuel_table.fuel_id AND DATE_FORMAT(services.service_date, '%M-') like '%" + month + "%' ORDER BY services.emp_id";
        ResultSet rs = stat.executeQuery(sequel);
        
        while(rs.next())
        {
            //public ServiceClass(double fuelDispened, double fuel_cost, String fuel_type, String empId, String emp_lname, String emp_fname)
            servClass = new ServiceClass(rs.getDouble(5), rs.getDouble(6), rs.getString(4), rs.getString(1), rs.getString(3), rs.getString(2));
            reList.add(servClass);
        }
        
        return reList;
    }
        
        
     public ArrayList<ServiceClass> getPerfReportId(String emp_id) throws SQLException
    {
        ArrayList<ServiceClass> reList = new ArrayList<>();
         ServiceClass servClass = new ServiceClass();
        String sequel = "SELECT services.emp_id, employee.emp_fname, employee.emp_lname, fuel_table.fuel_type, services.fuel_dispensed, services.fuel_cost FROM services, employee, fuel_table WHERE services.emp_id = employee.emp_id AND services.fuel_id = fuel_table.fuel_id AND services.emp_id = '" + emp_id + "'ORDER BY services.emp_id";
        ResultSet rs = stat.executeQuery(sequel);
        
        while(rs.next())
        {
            //public ServiceClass(double fuelDispened, double fuel_cost, String fuel_type, String empId, String emp_lname, String emp_fname)
            servClass = new ServiceClass(rs.getDouble(5), rs.getDouble(6), rs.getString(4), rs.getString(1), rs.getString(3), rs.getString(2));
            reList.add(servClass);
        }
        
        return reList;
    }
      
         public ArrayList<ServiceClass> getPerfReportByDay(String day) throws SQLException
    {
        ArrayList<ServiceClass> reList = new ArrayList<>();
         ServiceClass servClass = new ServiceClass();
        String sequel = "SELECT services.emp_id, employee.emp_fname, employee.emp_lname, fuel_table.fuel_type, services.fuel_dispensed, services.fuel_cost FROM services, employee, fuel_table WHERE services.emp_id = employee.emp_id AND services.fuel_id = fuel_table.fuel_id AND DATE_FORMAT(services.service_date, '%Y-%m-%d') = '" + day + "' ORDER BY services.emp_id";
        ResultSet rs = stat.executeQuery(sequel);
        
        while(rs.next())
        {
            //public ServiceClass(double fuelDispened, double fuel_cost, String fuel_type, String empId, String emp_lname, String emp_fname)
            servClass = new ServiceClass(rs.getDouble(5), rs.getDouble(6), rs.getString(4), rs.getString(1), rs.getString(3), rs.getString(2));
            reList.add(servClass);
        }
        
        return reList;
    }
        
      
}
