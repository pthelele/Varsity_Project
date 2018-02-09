
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class TankDAO {
    
     private Connection conn;
    private Statement stat;
    private Connection_Class connObj;

  
    
    public synchronized void openConn() throws ClassNotFoundException, SQLException
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
    
    public ArrayList<Tank_Class> getTankInfo() throws SQLException
    {
        ArrayList<Tank_Class> data = new ArrayList<Tank_Class>();
        Tank_Class tank;
        ResultSet rsSet = null;
        String query = "SELECT * FROM fuelTanks";
        rsSet =stat.executeQuery(query);
        
        while(rsSet.next())
        {
            tank = new Tank_Class(rsSet.getString(1), rsSet.getDouble(2), rsSet.getString(3), rsSet.getDouble(4), rsSet.getString(5));
            data.add(tank);
        }
        return data;
    }
    
    public Tank_Class getTanksById(String tank_id) throws SQLException
    {
        String sequel = "SELECT * FROM fuelTanks WHERE tank_id = '" + tank_id + "'";
        Tank_Class info = null;
        ResultSet rs = null;
        
        rs = stat.executeQuery(sequel);
        
        if(rs.next())
        {
            info = new Tank_Class(rs.getString(1), rs.getDouble(2), rs.getString(3), rs.getDouble(4),rs.getString(5));
        }
        
        return info;
    }
    
    
        public  ArrayList<Tank_Class> getIdFuelType() throws SQLException
        {
            ArrayList<Tank_Class> vals = new ArrayList<Tank_Class>();
            
            Tank_Class data = new Tank_Class();
            String sql = "SELECT tank.tank_id, tank.fuel_id, IFNULL(fuel.fuel_type, 'Fuel Not Assigned') FROM fuelTanks tank LEFT JOIN fuel_table fuel ON tank.fuel_id = fuel.fuel_id";
            ResultSet rs = stat.executeQuery(sql);
            
            while(rs.next())
            {
                data = new Tank_Class(rs.getString(1), rs.getString(2), rs.getString(3));
                vals.add(data);
            }
            
            return vals;
        }
        
        public int AddTank(String tankName, double volume) throws SQLException
        {
            int row = 0;
            
            String query = "INSERT INTO fuelTanks(tank_id, tank_name, fuel_level, tank_volume) VALUES('" +tankIdIncrease()+"', '"+tankName + "',"+0+","+volume+")";
            row = stat.executeUpdate(query);
            return row;
        }
        
        public synchronized int AddTank(String tankName, String volume, String fuel_id) throws SQLException
        {
            int addFuel = 0;
            String query = "INSERT INTO fuelTanks(tank_id, tank_name, fuel_level, tank_volume, fuel_id) VALUES('" +tankIdIncrease()+"', '"+tankName + "',"+0+","+volume+")";
            
            return addFuel;
        }
        
        public synchronized int updateLitres(String fuel_type, double litres) throws SQLException
        {
          
            String qry = "UPDATE fuelTanks SET fuel_level = fuel_level - "+ litres + " WHERE fuel_id = '" + getFuelId(fuel_type) + "'";
            int row = 0;
            
            row = stat.executeUpdate(qry);
            return row;
        }
        
        public synchronized int addFuelTotoTank(String id, double litres) throws SQLException
        {
            
           
            String qry = "UPDATE fuelTanks SET fuel_level = fuel_level + "+ litres + " WHERE tank_id = '" + id + "'";
            int row = 0;
            
            row = stat.executeUpdate(qry);
            return row;
        }
        
        public String tankIdIncrease() throws SQLException
        {
            int emp = 0;
            String emp_num = "";
            String qry = "SELECT MAX(tank_id) FROM fuelTanks";
             ResultSet rs= null;
             rs = stat.executeQuery(qry);
             
             if (rs.next())
            {
                 emp_num = rs.getString(1);
                if(emp_num != null)
                {
                    emp = Integer.parseInt(rs.getString(1));
                    emp = emp + 1;
                    if(String.valueOf(emp).length() < 2)
                    {
                         emp_num = "0" + String.valueOf(emp);
                    }
                    else
                    {
                        emp_num = String.valueOf(emp);
                    }
                   
                }
                else
                {
                    emp_num = "01";
                }
               
                
            }
             
           return  emp_num; 
        }
        
         public ArrayList<Tank_Class> getFuel() throws SQLException
        {
            String qry = "SELECT fuel.fuel_type FROM fuelTanks tank, fuel_table fuel WHERE tank.fuel_id = fuel.fuel_id";
            
            ArrayList<Tank_Class> data = new ArrayList<Tank_Class>();
            Tank_Class fuel;
            ResultSet result = stat.executeQuery(qry);
            
            while(result.next())
            {
                fuel = new Tank_Class(result.getString(1));
                data.add(fuel);
            }
            
            return data;
        }
         
         public Tank_Class getFuelInfoType(String id) throws SQLException
         {
             String qry = "SELECT tank.tank_id, tank.tank_volume, tank.tank_name, tank.fuel_level, IFNULL(fuel.fuel_type, 'Fuel Not Assigned') FROM fuelTanks tank LEFT JOIN fuel_table fuel ON tank.fuel_id = fuel.fuel_id WHERE tank.tank_id = '" + id + "' ORDER BY tank.tank_id ASC";
             
             ResultSet rs = stat.executeQuery(qry);
             Tank_Class details = new Tank_Class();
             
             if(rs.next())
             {
                 details.setFuelType(rs.getString(1), rs.getDouble(2), rs.getString(3), rs.getDouble(4), rs.getString(5));
             }
             
             
             return details;
         }
         
         public  ArrayList<Tank_Class> getAllTankInfo() throws SQLException
         {
             ArrayList<Tank_Class> list = new  ArrayList<Tank_Class>();
             //Tank_Class(String tank_id, double tank_volume, String tank_name, double fuel_level, String fuel_id, String fuel_type)
             String qry = "SELECT tank.tank_id, tank.tank_volume, tank.tank_name, tank.fuel_level, tank.fuel_id, IFNULL(fuel.fuel_type, 'Fuel Not Assigned') FROM fuelTanks tank LEFT JOIN fuel_table fuel ON tank.fuel_id = fuel.fuel_id ORDER BY tank.tank_id ASC ";
             
             ResultSet rs = stat.executeQuery(qry);
             Tank_Class details = new Tank_Class();
             
             while(rs.next())
             {
                 details = new Tank_Class(rs.getString(1), rs.getDouble(2), rs.getString(3), rs.getDouble(4),rs.getString(5), rs.getString(6));
                 list.add(details);
             }
             return list;
         }
         
         public ArrayList<Tank_Class> getAllTanks() throws SQLException
         {
             String qry = "SELECT * FROM fuelTanks ORDER BY tank_id ASC";
             ArrayList<Tank_Class> list = new ArrayList<Tank_Class>();
             Tank_Class tank = null;
             ResultSet rs = stat.executeQuery(qry);
             
             while(rs.next())
             {
                  tank = new Tank_Class(rs.getString(1), rs.getDouble(2), rs.getString(3), rs.getDouble(4), rs.getString(5));
                  list.add(tank);
             }
             
             
             return list;
         }
         
          public ArrayList<Tank_Class> getFuelInfoType() throws SQLException
         {
             String qry = "SELECT tank.tank_id, tank.tank_volume, tank.tank_name, tank.fuel_level, IFNULL(fuel.fuel_type, 'Fuel Not Assigned') FROM fuelTanks tank LEFT JOIN fuel_table fuel ON tank.fuel_id = fuel.fuel_id ORDER BY tank.tank_id";
                            //"SELECT tank.tank_name,tank.tank_id, tank.fuel_id, IFNULL(fuel.fuel_type, 'Fuel Not Assigned') FROM fueltanks tank LEFT JOIN fuel_table fuel ON tank.fuel_id = fuel.fuel_id";
            
             Tank_Class details = new Tank_Class();
             ArrayList<Tank_Class> info = new ArrayList<Tank_Class>();
             ResultSet rs = stat.executeQuery(qry);
             
             while(rs.next())
             {
                 details = new Tank_Class(rs.getString(1), rs.getDouble(2), rs.getString(3), rs.getDouble(4), rs.getString(5));
                 info.add(details);
             }
             
             
             return info;
         }
          
         public synchronized int removeTank(String t_id) throws SQLException
         {
             int del = 0;
             
             String qry =  "DELETE FROM fuelTanks WHERE tank_id = '" + t_id + "'";
             del = stat.executeUpdate(qry);
             
             return del;
         }
         
         public Tank_Class selectMax() throws SQLException
         {
             Tank_Class info = new Tank_Class();
             String query = "SELECT MAX(tank.tank_id), tank.tank_volume, tank.tank_name, tank.fuel_level, tank.fuel_id FROM fuelTanks tank LEFT JOIN  fuel_table fuel ON tank.fuel_id = fuel.fuel_id";
             ResultSet result = stat.executeQuery(query);
             
             if(result.next())
             {
                 info = new Tank_Class(result.getString(1), result.getDouble(2), result.getString(3), result.getDouble(4), result.getString(5));
             }
             
             return info;
         }
         
         public synchronized int addFuelType(String tankName, double volume, String f_id) throws SQLException
         {
             int row = 0;
              
            String query = "INSERT INTO fuelTanks(tank_id, tank_name, fuel_level, tank_volume, fuel_id) VALUES('" + tankIdIncrease() + "', '"+ tankName + "'," + 0 + ", " + volume +", '" + f_id + "')";
            row = stat.executeUpdate(query);
            return row;
         }
         
         
         public synchronized int assignPetrol(String id, String f_type) throws SQLException
         {
             int row = 0;
             String fuelId = getFuelId(f_type);
             
                 String query = "UPDATE  fuelTanks SET fuel_id = '" + fuelId + "' WHERE tank_id = '" + id + "'";
                 row = stat.executeUpdate(query);
             
            return row; 
         }
         
         public synchronized ArrayList<Tank_Class> getNullFuel() throws SQLException 
         {
             ArrayList<Tank_Class> petrol = new ArrayList<Tank_Class>();
             Tank_Class valueCarry = new Tank_Class();
             
             String qry = "SELECT fuel.fuel_type FROM fuel_table fuel JOIN fuelTanks tank ON fuel.fuel_id <> tank.fuel_id";
             ResultSet rs = stat.executeQuery(qry);
             
             while(rs.next())
             {
                 valueCarry = new Tank_Class(rs.getString(1));
                 petrol.add(valueCarry);
             }
             
             return petrol;
         }
         
         
          public  Tank_Class getAllTankInfo(String id) throws SQLException
         {
             Tank_Class list = new  Tank_Class();
             String qry = "SELECT tank.tank_id, tank.tank_volume, tank.tank_name, tank.fuel_level, tank.fuel_id, IFNULL(fuel.fuel_type, 'Fuel Not Assigned') FROM fuelTanks tank LEFT JOIN fuel_table fuel ON tank.fuel_id = fuel.fuel_id WHERE tank.tank_id = '" + id + "' ORDER BY tank.tank_id ASC";
             
             ResultSet rs = stat.executeQuery(qry);
             
             if(rs.next())
             {
                 list = new Tank_Class(rs.getString(1), rs.getDouble(2), rs.getString(3), rs.getDouble(4),rs.getString(5), rs.getString(6));                 
             }
             return list;
         }
          
          
          public synchronized int updateTank(String tank_id, String tank_name, String fuel_type) throws SQLException
          {
              int row = 0;
              String fuel_id = getFuelId(fuel_type);
              
              String query = "UPDATE  fuelTanks SET tank_name = '" + tank_name + "', fuel_id = '" + fuel_id + "' WHERE tank_id = '" + tank_id + "'";
              row = stat.executeUpdate(query);
              
              return row;
          }
          
          public String  getFuelId(String fuelType) throws SQLException
          {
              String fuelId = "";
              String sequel = "SELECT fuel_id FROM fuel_table WHERE fuel_type = '" + fuelType + "'";
             ResultSet rs = stat.executeQuery(sequel);
             if(rs.next())
             {
                 fuelId = rs.getString(1);
             }
              
             return fuelId;
          }
          
        
          public Tank_Class getServiceVals(String fuelType) throws SQLException
          {
                Tank_Class details = null;
                String fuelId = getFuelId(fuelType);
              
                String qry = "SELECT * FROM fuelTanks WHERE fuel_id = '" + fuelId + "'";
                ResultSet result = stat.executeQuery(qry);
                if(result.next())
                {
                    details = new Tank_Class(result.getString(1), result.getDouble(2), result.getString(3), result.getDouble(4), result.getString(5));
                }
              
              
              
              
              return details;
          }
          
          public double getFuelAvail(String ftype) throws SQLException
          {
              double availFuel = 0.0;
              String query = "SELECT fuel_level FROM fuelTanks WHERE fuel_id = '" + getFuelId(ftype) + "'";
              ResultSet result = stat.executeQuery(query);
              
              if(result.next())
              {
                  availFuel = result.getDouble(1);
              }
              return availFuel;
          }
          
          public String getFtype(String tankId) throws SQLException
          {
              String fuel_type = "Fuel Not Assigned";
              String query = "SELECT fuel_table.fuel_type FROM services, fuel_table WHERE services.fuel_id = fuel_table.fuel_id AND services.tank_id = '" + tankId + "'";
              ResultSet rs = stat.executeQuery(query);
              
              if(rs.next())
              {
                 fuel_type = rs.getString(1);
              }
              return fuel_type;
          }
    
}
