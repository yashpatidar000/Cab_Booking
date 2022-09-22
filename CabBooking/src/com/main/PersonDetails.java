package com.main;
import com.driver.Location;

public class PersonDetails {
    
    public String name;
    public char gender;
    public int age;
    public long contact;        
    public Location location;
    
    PersonDetails(String name,char gender,int age){
    this.name =  name; 
    this.gender =  gender;
    this.age =  age;
    }
}
