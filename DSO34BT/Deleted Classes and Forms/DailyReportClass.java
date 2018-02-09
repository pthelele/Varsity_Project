/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WILBUR
 */
public class DailyReportClass {
    
    private String fname;
    private String lname;
    private String date;
    private String empId;
    private double fuelDispensed;
    private String fuelType;
    private String dispenserId;

    public DailyReportClass() {
    }
    
    

    public DailyReportClass(String fname, String lname, String date, String empId, double fuelDispensed, String fuelType, String dispenserId) {
        this.fname = fname;
        this.lname = lname;
        this.date = date;
        this.empId = empId;
        this.fuelDispensed = fuelDispensed;
        this.fuelType = fuelType;
        this.dispenserId = dispenserId;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public void setFuelDispensed(double fuelDispensed) {
        this.fuelDispensed = fuelDispensed;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setDispenserId(String dispenserId) {
        this.dispenserId = dispenserId;
    }
    
    

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getDate() {
        return date;
    }

    public String getEmpId() {
        return empId;
    }

    public double getFuelDispensed() {
        return fuelDispensed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getDispenserId() {
        return dispenserId;
    }
    
    
    
}
