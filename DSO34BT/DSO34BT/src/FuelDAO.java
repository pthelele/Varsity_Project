import java.sql.*;
import java.util.ArrayList;

public class FuelDAO {
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
    
    public int insertFuels( String type, double price) throws SQLException
    {
        
         int row = 0;
        String emp_number = emp_increment_id2();
      
        
        while(emp_number.length() < 2)
        {
            emp_number = "0" + emp_number;
        }
        String sql = "INSERT INTO fuel_table(fuel_id, fuel_type, fuel_price) VALUES('"+emp_number+"','"+type+"',"+price+")";             
        row = statement.executeUpdate(sql);
        
        return row;
    }
    
    public Fuel searchFuel(String id) throws SQLException
    {
        String sqlSqerch = "SELECT * FROM fuel_type WHERE fuel_id = '"+ id+"'";
        
        Fuel info = null;
        ResultSet rsSet = statement.executeQuery(sqlSqerch);
        
        if(rsSet.next())
        {
            info = new Fuel(rsSet.getString(1), rsSet.getString(2), rsSet.getDouble(3));
        }
        
        return info;
    }
        
    public int updateInfo(String type, double price,String id) throws SQLException
    {
        int row = 0;
        String qry = "UPDATE fuel_table SET fuel_type ='"+type+"',fuel_price = "+price+" WHERE fuel_id='"+id+"'";
        row = statement.executeUpdate(qry);
        return row;
    }
    
    
    public int updateInfo(String type,String id) throws SQLException
    {
        String sequel = "UPDATE fuel_table SET fuel_type = '" + type + "' WHERE fuel_id = '" + id + "'";
        int row = 0;
        
        row = statement.executeUpdate(sequel);
        return row;
    }
    
     public int updateInfo(double price,String id) throws SQLException
    {
        String sequel = "UPDATE fuel_table SET fuel_price = " + price + " WHERE fuel_id = '" + id + "'";
        int row = 0;
        
        row = statement.executeUpdate(sequel);
        return row;
    }
    
        public String emp_increment_id2() throws SQLException
   {
	int emp_number = 1;
	String empNumber = "";
	
	String empQuery = "SELECT  MAX(fuel_id) FROM fuel_table";
        ResultSet rs;
	rs = statement.executeQuery(empQuery );
	
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
        public Fuel getFuel(String id) throws SQLException
        {
            String sql = "SELECT * FROM fuel_table WHERE fuel_id = '"+id+"'";
            ResultSet rs = statement.executeQuery(sql);
            Fuel f = null;
            if(rs.next())
            {
              f = new Fuel(rs.getString(1), rs.getString(2), rs.getDouble(3));
            }
            return f;
            
        }
        
        public ArrayList<Fuel> getFuelType() throws SQLException
    {
        String sequel = "SELECT * FROM fuel_table ORDER BY fuel_id ASC";
        ResultSet rs = null;
        ArrayList<Fuel> info = new ArrayList<Fuel>();
        
        rs = statement.executeQuery(sequel);
        
        while(rs.next())
        {
            Fuel newFuel = new Fuel(rs.getString(1), rs.getString(2), rs.getDouble(3));
            info.add(newFuel);
        }
        
        return info;
    }
        
        public synchronized int removeFuel(String f_id) throws SQLException
        {
            String sequel = "DELETE FROM fuel_table WHERE fuel_id = '" + f_id + "'";
            int row = 0;
            
            row = statement.executeUpdate(sequel);
            return row;
        }
        
        public Fuel getByFuel(String value) throws SQLException
        {
            Fuel data = null;
            String qry = "SELECT * FROM fuel_table WHERE fuel_type = '" + value + "'";
            
            ResultSet rs = null;
            
            rs = statement.executeQuery(qry);
            
            if(rs.next())
            {
                data = new Fuel(rs.getString(1), rs.getString(2), rs.getDouble(3));
            }
            
            
            return data;
        }
        
        public ArrayList<Fuel> getFueltype(String fuelID) throws SQLException
        {
            ArrayList<Fuel> list = new ArrayList<Fuel>();
            Fuel fuel;
            String fuelType = "";
            String qry = "SELECT  fuel.fuel_type "
                    + "   FROM fueltanks tank, fuel_table fuel "
                    + "   WHERE tank.fuel_id = fuel.fuel_id "
                    + "   AND tank.fuel_id = '"+fuelID+"'";
            
            String query = "SELECT * FROM fuel_table WHERE fuel_type <> '" + fuelType +"'";
            ResultSet result = statement.executeQuery(query);
            
            while(result.next())
            {
               fuel = new Fuel(result.getString(1), result.getString(2), result.getDouble(3));
               list.add(fuel);
            }
            
            
            
            return list;
        }
        
      
        
        public ArrayList<Fuel> getFuelInTank() throws SQLException
        {
            ArrayList<Fuel> fuelInTank = new ArrayList<Fuel>();
            Fuel fuel = new Fuel();
            String query = "SELECT fuel.fuel_id, fuel.fuel_type, fuel.fuel_price FROM fuel_table fuel, fuelTanks tank WHERE tank.fuel_id = fuel.fuel_id AND tank.fuel_level > 100";
            ResultSet result = statement.executeQuery(query);
            
            while(result.next())
            {
                fuel = new Fuel(result.getString("fuel_id"), result.getString("fuel_type"), result.getDouble("fuel_price"));
                fuelInTank.add(fuel);
            }
            
            return fuelInTank;
        }
        
        public ArrayList<Fuel> summaryFuels() throws SQLException
        {
            ArrayList<Fuel> fuel = new ArrayList<Fuel>();
            Fuel info = null;
            String sequel = "SELECT * FROM fuel_table";
            ResultSet rs = statement.executeQuery(sequel);
            
            while(rs.next())
            {
               info = new Fuel(rs.getString(1), rs.getString(2), rs.getDouble(3));
                fuel.add(info);
            }
            return fuel;
        }
        
       
}
