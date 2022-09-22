
package com.service;

import com.driver.Driver;
import com.driver.DriverClass;
import com.driver.Location;
import com.user.User;
import java.util.ArrayList;

public class AllServices {
    String userName ;
    String driverName;
    Location finalLocation;
    int amount;
    
    public void find_ride(String name, Location A, Location B, Driver drivers,User user){
        userName = name;
        finalLocation = B;
        
        ArrayList<DriverClass> list = drivers.getDrivers();
        
        int indexDriver=0;
        int min=Integer.MAX_VALUE;
        boolean flag=false;
        
        for(int i=0;i<list.size();i++){
            
            int finalA = Math.abs(list.get(i).location.cordinateA - A.cordinateA);
            int finalB = Math.abs(list.get(i).location.cordinateB - A.cordinateB);
            
            int val = (finalA * finalA) + (finalB * finalB);
            int distance = (int)Math.sqrt(val);
            
            if(distance < 5){
                if(distance < min){
                    min = distance;
                    indexDriver = i;
                }
                flag = true;
            }
        }
        
        if(flag == false){
            System.out.println("No ride found");
            System.out.println();
        }else{
            int finalA = Math.abs(B.cordinateA - A.cordinateA);
            int finalB = Math.abs(B.cordinateB - A.cordinateB);
            int val = (finalA * finalA) + (finalB * finalB);
            amount = (int)Math.sqrt(val);
            
            driverName = list.get(indexDriver).driver.name;
            
            if(list.get(indexDriver).status == false){
                System.out.println("No ride found");
                System.out.println();
                return;
            }
            
            choose_ride(userName, driverName);
            calculateBill(userName);
            updateUserLocation(user);
            updateDriverLocation(drivers);
            changeDriverStatus(drivers);
            totalEarning(driverName,amount);
        }
    }
    
    public void choose_ride(String user, String driver){
        System.out.println("Ride Started");
    }
    
    public void calculateBill(String name){
        System.out.println("Ride Ended bill amount $ " + amount);
    }
    public void updateUserLocation(User user){
        user.update_userLocation(userName, finalLocation);
    }
    
    public void updateDriverLocation(Driver driver){
        driver.update_driverLocation(driverName, finalLocation);
    }
    
    public void changeDriverStatus(Driver driver){
        driver.change_driver_status(driverName, false);
    }
    
    public void totalEarning(String driver,int amount){
        System.out.println(driver + " earn $" + amount);
        System.out.println();
    }
}
