
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.util.ArrayList;

//This class ha to be divided into three se[erate classes.
//Tank Class 
//Fuel Class
//employee class


public class ClassDao {
    
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
    
    public synchronized int inserUsers(String lname,  String fname, String idNumber, String cellphone, String email, String password, String jobType, String address, String hire_date) throws SQLException
    {
        int row = 0;
        String emp_number = emp_increment_id();
        String sex = "";
        
        while(emp_number.length() < 5)
        {
            emp_number = "0" + emp_number;
        }
        
        int numChar = Integer.parseInt(idNumber.substring(6,7));
         if(numChar < 5)
         {
             sex = "Female";
         }
         else
         {
           sex = "Male";   
         }
         
         
          int numYear = Integer.parseInt(idNumber.substring(0,2));
         String birth = "";
	if(numYear < 99 && numYear > 16)
	{

		birth = " 19" + idNumber.substring(0,2) +"-"+ idNumber.substring(2,4) +"-"+  idNumber.substring(4,6);
	}
	else
	{
	
		birth = " 20" + idNumber.substring(0,2) +"-"+ idNumber.substring(2,4) +"-"+  idNumber.substring(4,6);
	}  
        
       
       String query = "INSERT INTO employee(emp_id, emp_lname, emp_fname, id_number, cellphone, address, hire_date, gender, password, email, dob, job_type) "
                + "     VALUES('"+ emp_number +"', '" + lname + "','" +fname + "','" + idNumber + "','"+ cellphone+ "','" + address + "','" + hire_date + "','" 
                + sex + "','" + password + "','" + email + "','"+birth + "','" + jobType+ "')";
        
        row = stat.executeUpdate(query);
        return row;
    }
    
    //incomplete
    public synchronized ArrayList<Staff> searchByLName(String name) throws SQLException
    {
          ArrayList<Staff> values = new  ArrayList<Staff>();
          Staff staff;
                
           
        String sqlQuery = "SELECT * FROM employee WHERE emp_lname = '"+name+"'" ;
        
        ResultSet rs;
        rs = stat.executeQuery(sqlQuery);
       
        
        while(rs.next())
        {
             staff = new Staff(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),
                     rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),
                     rs.getString(10),rs.getString(11),rs.getString(12));
             values.add(staff);
        }
        
        
        return values;
    }
    
    //select ALL
       public ArrayList<Staff> sectAll() throws SQLException
    {
       
        ArrayList<Staff> values = new  ArrayList<Staff>();
        Staff staff;
 
        String sqlQuery = "SELECT * FROM employee " ;
        ResultSet rs;
        rs = stat.executeQuery(sqlQuery);
       
        while(rs.next())
        {
             staff = new Staff(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),
                     rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),
                     rs.getString(10),rs.getString(11),rs.getString(12));
             values.add(staff);
        }
       
        return values;
    }
       
    public synchronized int updateMethod(String idNum, String fname, String lname, String email, String cell, String address ) throws SQLException
    {
           
         String qry = "UPDATE employee SET emp_fname = '" + fname + "', emp_lname = ' " + lname + "', cellphone = '" + cell + "'WHERE id_number = '"+idNum+"'" ;
        int row = stat.executeUpdate(qry);
        
        return row;
    }
    
    public  Staff retrieveEmployees(String emp_id) throws SQLException
    {
       
        Staff staffObj = new Staff();
        
       String sqlQuery = "SELECT * FROM employee WHERE emp_id = '" + emp_id + "'";
       ResultSet rs;
        rs = stat.executeQuery(sqlQuery);
    
        if(rs.next())
        {
             staffObj = new Staff(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),
                     rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),
                     rs.getString(10),rs.getString(11),rs.getString(12));
        }
        
        return staffObj;
    }
    
    
    public synchronized ArrayList<Staff> searchByFName(String firstName) throws SQLException
    {
        ArrayList<Staff> list = new ArrayList<Staff>();
        Staff staffObj;
        String sqlQuery = "SELECT * FROM employee where emp_fname = '" + firstName + "'";
        
        ResultSet rs = stat.executeQuery(sqlQuery);
        

        while(rs.next())
        {
             staffObj = new Staff(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),
                     rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),
                     rs.getString(10),rs.getString(11),rs.getString(12));
             list.add(staffObj);
        }
        return list;
    }
    
    public synchronized String emp_increment_id() throws SQLException
   {
	int emp_number = 1;
	String empNumber = "";
	
	String empQuery = "SELECT  MAX(emp_id) FROM employee";
        ResultSet rs;
	rs = stat.executeQuery(empQuery );
	
            if (rs.next())
            {
                String emp_num = rs.getString(1);
                if(emp_num != null)
                {
                    emp_number = Integer.parseInt(rs.getString(1));
                    emp_number = emp_number + 1;
                }
                
            }
            
            empNumber = String.valueOf(emp_number);
            
            
        return  empNumber;
    }
    
    public synchronized String passwordChange(String id_number, String pass,String oldPass) throws SQLException
    {
        String sqlQry = "UPDATE employee SET password = '" + pass + "' WHERE id_number = '"+  id_number + "' AND password = '" + oldPass + "'"; ;
        int row = stat.executeUpdate(sqlQry);
        String msg;
        if(row > 0)
        {
            msg = "Password Updated Succesfully";
        }
        else
        {
           msg = "No Update"; 
        }
        return msg;
    }
    
     public synchronized int passwordChange(String id_number, String pass) throws SQLException
    {
        String sqlQry = "UPDATE employee SET password = '" + pass + "' WHERE id_number = '"+  id_number + "'";
        int row = stat.executeUpdate(sqlQry);
        
       
        return row;
    }
   public synchronized Staff retrieveEmployee(String idNumber) throws SQLException
    {
       
        Staff staffObj = null;
        
       String sqlQuery = "SELECT * FROM employee WHERE id_number = '" + idNumber + "'";
        ResultSet rs = stat.executeQuery(sqlQuery);
    
        if(rs.next())
        {
             staffObj = new Staff(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),
                     rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),
                     rs.getString(10),rs.getString(11),rs.getString(12));
        }
        return staffObj;
    }
   
   public synchronized int removeEmp(String id) throws SQLException
   {
       String query = "DELETE FROM employee WHERE emp_id = '" + id + "'";
       int rowCount = stat.executeUpdate(query);
       
       return rowCount;
   }
    
   public synchronized int insertTank(String tank_name, double tank_volume, String f_type) throws SQLException
   {
       int row = 0;
       
       String sqlFuel = "SELECT fuel_id FROM fuel_table WHERE fuel_type = '" + f_type+"'";
       ResultSet rs = stat.executeQuery(sqlFuel);
       String f_id = null;
       if(rs.next())
       {
            f_id = rs.getString(1);
       }
       
           String tank_id = increment_tank_id();
       
       
               
                while(tank_id.length() < 2)
        {
            tank_id = "0" + tank_id;
        }
       
       String sql = "INSERT INTO fueltanks(tank_id, tank_volume, tank_name, fuel_level, fuel_id) VALUES('"+tank_id+"',"+tank_volume + ",'" + tank_name +"'," + 0 +",'" + f_id + "');";
       row = stat.executeUpdate(sql);
       return row;
   }
   
    public String increment_tank_id() throws SQLException
   {
	int tank_id = 1;
	String tankNumber = "";
	
	String empQuery = "SELECT  MAX(tank_id) FROM fueltanks";
        ResultSet rs;
	rs = stat.executeQuery(empQuery );
	
            if (rs.next())
            {
                String emp_num = rs.getString(1);
                if(emp_num != null)
                {
                    tank_id = Integer.parseInt(rs.getString(1));
                    tank_id = tank_id + 1;
                }
               
                
            }
            
            tankNumber = String.valueOf(tank_id);
            
            
        return  tankNumber;
    }
    
    public Tank_Class getFuelInfo(String tank_id) throws SQLException
    {
        String query = "SELECT * FROM fueltanks WHERE tank_id = '" + tank_id + "'"; 
        ResultSet rs = stat.executeQuery(query);
        
        Tank_Class tank = null;
        
        if(rs.next())
        {
            tank = new Tank_Class(rs.getString(1), rs.getDouble(2), rs.getString(3), rs.getDouble(4), rs.getString(4));
        }
        return tank;
    }
    
    public synchronized int upDateTank(String tank_id, String t_name, String f_type) throws SQLException
    {
        int row = 0;
        String updateQry = "UPDATE fueltanks SET tank_name = '" + t_name + "', '" + f_type + "'";
        row = stat.executeUpdate(updateQry);
        
        return row;
    }
    
    public synchronized Staff loginSearch(String id) throws SQLException
    {
        Staff login = new Staff();
        
        String qry = "SELECT id_number, password, job_type FROM employee WHERE id_number = '" +id+"'";
        ResultSet rs = stat.executeQuery(qry);
        if(rs.next())
        {
          login.setLoginVals(rs.getString(1), rs.getString(2), rs.getString(3));
            
        }
        
        return login;
    }
    
       public synchronized int updateMethodEmp(String idNum, String fname, String lname, String email, String cell, String address ) throws SQLException
    {
        
        String qry = "UPDATE employee SET emp_fname = '" + fname + "', emp_lname = ' " + lname + "', cellphone = '" + cell + "', WHERE id_number = '"+idNum+"'" ;
        int row = stat.executeUpdate(qry);
        
        return row;
    }
       
      
    
}
    
    

