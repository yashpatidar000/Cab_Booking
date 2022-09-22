
package com.driver;

import com.main.PersonDetails;
import java.util.ArrayList;

public class Driver {
    
    ArrayList<DriverClass> list = new ArrayList<>();
    
    public void add_driver(PersonDetails driver, VehicleDetails vehicle, Location location){
        DriverClass newDriver = new DriverClass(driver,vehicle,location);
        list.add(newDriver);
    }
    
    public ArrayList<DriverClass> getDrivers(){
        return list;
    }
    
    public void update_driverLocation(String name, Location location){
        for(int i=0;i<list.size();i++){
            DriverClass person = list.get(i);
            if(person.driver.name.equals(name)){
                person.location = location;
                break;
            }
        }
    }
    
    public void change_driver_status(String name, boolean flag){
        for(int i=0;i<list.size();i++){
            DriverClass person = list.get(i);
            person.status = flag;
        }
    }


}


