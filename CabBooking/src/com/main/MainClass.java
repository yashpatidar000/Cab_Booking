
package com.main;

import com.driver.Driver;
import com.driver.Location;
import com.driver.VehicleDetails;
import com.service.AllServices;
import com.user.User;
import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        
        //User details
        PersonDetails newUser1 = new PersonDetails("Abhishek", 'M', 23);
        PersonDetails newUser2 = new PersonDetails("Rahul", 'M', 29);
        PersonDetails newUser3 = new PersonDetails("Nandini", 'F', 22);
        
        User allUsers = new User();
        allUsers.add_user(newUser1);
        allUsers.add_user(newUser2);
        allUsers.add_user(newUser3);
        
        //Driver details
        PersonDetails newUser4 = new PersonDetails("Driver1", 'M', 22);
        VehicleDetails vehicle = new VehicleDetails("Swift","KA-01-12345");
        Location location4 = new Location(10,1);
        
        PersonDetails newUser5 = new PersonDetails("Driver2", 'M', 29);
        Location location5 = new Location(11,10);
        
        PersonDetails newUser6 = new PersonDetails("Driver3", 'M', 24);
        Location location6 = new Location(5,3);
        
        Driver drivers = new Driver();
        drivers.add_driver(newUser4, vehicle, location4);
        drivers.add_driver(newUser5, vehicle, location5);
        drivers.add_driver(newUser6, vehicle, location6);
        
        AllServices services = new AllServices();
        
      services.find_ride("Abhishek",new Location(0,0),new Location(20,1),drivers,allUsers);
      services.find_ride("Rahul",new Location(10,0),new Location(15,3),drivers,allUsers);
      services.find_ride("Nandini",new Location(15,6),new Location(20,4),drivers,allUsers);
    }
}
