
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WILBUR
 */
public class EmployeeReport {
    
    private String emp_id;
    private String emp_lname;
    private String emp_fname;
    private String fuelType;
    private double fuel_cost;
    private double fuelDispensed;
    private String serviceDate;

    public EmployeeReport() {
    }

    public EmployeeReport(String emp_id, String emp_lname, String emp_fname, String fuelType, double fuel_cost, double fuelDispensed, String serviceDate) {
        this.emp_id = emp_id;
        this.emp_lname = emp_lname;
        this.emp_fname = emp_fname;
        this.fuelType = fuelType;
        this.fuel_cost = fuel_cost;
        this.fuelDispensed = fuelDispensed;
        this.serviceDate = serviceDate;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public String getEmp_lname() {
        return emp_lname;
    }

    public String getEmp_fname() {
        return emp_fname;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getFuel_cost() {
        return fuel_cost;
    }

    public double getFuelDispensed() {
        return fuelDispensed;
    }

    public String getServiceDate() {
        return serviceDate;
    }
    
    
   
    
    
    
    
    
    
}
