
package com.driver;

import com.main.PersonDetails;

public class DriverClass {
    public PersonDetails driver;
    public VehicleDetails vehicle;
    public Location location;
    public boolean status = true;
    
    DriverClass(PersonDetails driver, VehicleDetails vehicle, Location location){
        this.driver = driver;
        this.vehicle = vehicle;
        this.location = location;
    }
    
}
