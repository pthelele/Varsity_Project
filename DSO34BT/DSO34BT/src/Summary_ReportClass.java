/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pale
 */
public class Summary_ReportClass {
    
    private String fuelType;
    private double fuelPrice;
    private double fuelDispensed;
    private double amtGen;

    public Summary_ReportClass() {
        fuelType = "No Fuel";
        fuelPrice = 0.0;
        fuelDispensed = 0.0;
        amtGen = 0.0;
    }

    public Summary_ReportClass(String fuelType, double fuelPrice, double fuelDispensed, double amtGen) {
        this.fuelType = fuelType;
        this.fuelPrice = fuelPrice;
        this.fuelDispensed = fuelDispensed;
        this.amtGen = amtGen;
    }

    public Summary_ReportClass(double fuelDispensed, double amtGen) {
        this.fuelDispensed = fuelDispensed;
        this.amtGen = amtGen;
    }
    
    

    public String getFuelType() {
        return fuelType;
    }

    public double getFuelPrice() {
        return fuelPrice;
    }

    public double getFuelDispensed() {
        return fuelDispensed;
    }

    public double getAmtGen() {
        return amtGen;
    }
    
    
    
    
    
    
}
