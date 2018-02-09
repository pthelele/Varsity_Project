


public class Tank_Class {
    
    private String tank_id;
    private double tank_volume;
    private String tank_name;
    private double fuel_level;
    private String fuel_id;
    private String fuel_type;

    public Tank_Class() {
        this.tank_id = "";
        this.tank_volume = 0;
        this.fuel_id = "";
        this.fuel_level = 0.0;
        this.tank_name = "";
        this.fuel_type = "";
    }
    
    public Tank_Class(String fuel_type)
    {
        this.fuel_type = fuel_type;
        
    }
    
    
    public  Tank_Class(String tank_id, double tank_volume, String tank_name, double fuel_level, String fuel_id) {
        this.tank_id = tank_id;
        this.tank_volume = tank_volume;
        this.tank_name = tank_name;
        this.fuel_level = fuel_level;
        this.fuel_id = fuel_id;
    }
    
     public  Tank_Class(String tank_id, double tank_volume, String tank_name, double fuel_level, String fuel_id, String fuel_type) {
        this.tank_id = tank_id;
        this.tank_volume = tank_volume;
        this.tank_name = tank_name;
        this.fuel_level = fuel_level;
        this.fuel_id = fuel_id;
        this.fuel_type = fuel_type;
    }
     
      public  void setFuelType(String tank_id, double tank_volume, String tank_name, double fuel_level, String fuel_type) {
        this.tank_id = tank_id;
        this.tank_volume = tank_volume;
        this.tank_name = tank_name;
        this.fuel_level = fuel_level;
        this.fuel_type = fuel_type;
    }

    public Tank_Class(String tank_id, String fuel_id, String fuel_type) {
        this.tank_id = tank_id;
        this.fuel_id = fuel_id;
        this.fuel_type = fuel_type;
    }
    
    

    public String getTank_id() {
        return tank_id;
    }

    public double getTank_volume() {
        return tank_volume;
    }

    public String getTank_name() {
        return tank_name;
    }

    public double getFuel_level() {
        return fuel_level;
    }

    public String getFuel_id() {
        return fuel_id;
    }
    
      public String getFuel_type() {
        return fuel_type;
    }
    
    

    
    
   
    
    
}
