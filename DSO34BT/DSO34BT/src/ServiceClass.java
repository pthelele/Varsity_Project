


public class ServiceClass {
    
    private int serviceID;
    private String serviceDate;
    private double fuelDispened;
    private double fuel_cost;
    private String fuelId;
    private String fuel_type;
    private String empId;
    private String emp_lname;
    private String emp_fname;
    private String dispenserId;
    private String tankId;
    private String tankName;
   
    
    public ServiceClass()
    {
        
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public void setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
    }

    public void setFuelDispened(double fuelDispened) {
        this.fuelDispened = fuelDispened;
    }

    public void setFuel_cost(double fuel_cost) {
        this.fuel_cost = fuel_cost;
    }

    public void setFuelId(String fuelId) {
        this.fuelId = fuelId;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public void setEmp_lname(String emp_lname) {
        this.emp_lname = emp_lname;
    }

    public void setEmp_fname(String emp_fname) {
        this.emp_fname = emp_fname;
    }

    public void setDispenserId(String dispenserId) {
        this.dispenserId = dispenserId;
    }

    public void setTankId(String tankId) {
        this.tankId = tankId;
    }

    public void setTankName(String tankName) {
        this.tankName = tankName;
    }
    
    public ServiceClass(int serviceID, String serviceDate, double fuelDispened, double fuel_cost, String fuelId, String fuel_type, String empId, String emp_lname, String emp_fname, String dispenserId, String tankId, String tankName) {
        this.serviceID = serviceID;
        this.serviceDate = serviceDate;
        this.fuelDispened = fuelDispened;
        this.fuel_cost = fuel_cost;
        this.fuelId = fuelId;
        this.fuel_type = fuel_type;
        this.empId = empId;
        this.emp_lname = emp_lname;
        this.emp_fname = emp_fname;
        this.dispenserId = dispenserId;
        this.tankId = tankId;
        this.tankName = tankName;
    }

    public ServiceClass(String serviceDate, double fuelDispened, double fuel_cost, String fuelId, String empId, String dispenserId, String tankId) {
        this.serviceDate = serviceDate;
        this.fuelDispened = fuelDispened;
        this.fuelId = fuelId;
        this.empId = empId;
        this.dispenserId = dispenserId;
        this.tankId = tankId;
        this.fuel_cost = fuel_cost;
    }
    
    //public ServiceClass(String fuel)
    
    

    public ServiceClass(int serviceID, String serviceDate, double fuelDispened, String fuelId, String empId, String dispenserId, String tankId) {
        this.serviceID = serviceID;
        this.serviceDate = serviceDate;
        this.fuelDispened = fuelDispened;
        this.fuelId = fuelId;
        this.empId = empId;
        this.dispenserId = dispenserId;
        this.tankId = tankId;
    }

    public ServiceClass(double fuelDispened, double fuel_cost, String fuel_type, String empId, String emp_lname, String emp_fname) {
        this.fuelDispened = fuelDispened;
        this.fuel_cost = fuel_cost;
        this.fuel_type = fuel_type;
        this.empId = empId;
        this.emp_lname = emp_lname;
        this.emp_fname = emp_fname;
    }
    
     public ServiceClass(double fuelDispened, double fuel_cost, String fuel_type, String empId, String emp_lname, String emp_fname, String service_date) {
        this.fuelDispened = fuelDispened;
        this.fuel_cost = fuel_cost;
        this.fuel_type = fuel_type;
        this.empId = empId;
        this.emp_lname = emp_lname;
        this.emp_fname = emp_fname;
        this.serviceDate = service_date;
    }



  
     
     
    
    

    public int getServiceID() {
        return serviceID;
    }

    public String getServiceDate() {
        return serviceDate;
    }

    public double getFuelDispened() {
        return fuelDispened;
    }
    
     public double getFuel_cost() {
        return fuel_cost;
    }

    public String getFuelId() {
        return fuelId;
    }

    public String getEmpId() {
        return empId;
    }

    public String getDispenserId() {
        return dispenserId;
    }

    public String getTankId() {
        return tankId;
    }

    public String getFuel_type() {
        return fuel_type;
    }

    public String getEmp_lname() {
        return emp_lname;
    }

    public String getEmp_fname() {
        return emp_fname;
    }

    public String getTankName() {
        return tankName;
    }

       
}
