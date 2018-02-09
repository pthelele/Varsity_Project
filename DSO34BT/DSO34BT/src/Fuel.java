


public class Fuel {
    
    private String fuel_id;
    private String fuel_type;
    private double fuel_price;

    public Fuel() {
        
    }
    
    

    public Fuel(String fuel_id, String fuel_type, double fuel_price) {
        this.fuel_id = fuel_id;
        this.fuel_type = fuel_type;
        this.fuel_price = fuel_price;
    }
    
    public Fuel(String fuel_type)
    {
        this.fuel_type = fuel_type;
    }

    public String getFuel_id() 
    {
    
        return fuel_id;
    }

    public String getFuel_type() 
    {
        return fuel_type;
    }

    public double getFuel_price() 
    {
        return fuel_price;
    }
    
    
    
    
}
