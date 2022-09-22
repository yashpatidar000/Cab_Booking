
package com.user;

import com.driver.Location;
import com.main.PersonDetails;
import java.util.ArrayList;

public class User {
    
    ArrayList<PersonDetails> list = new ArrayList<>();
    
    public void add_user(PersonDetails user){
        list.add(user);
    }
    
    public void update_user(String name,long contact){
        for(int i=0;i<list.size();i++){
            PersonDetails person = list.get(i);
            if(person.name.equals(name)){
                person.contact = contact;
                break;
            }
        }
    }
    
    public void update_userLocation(String name, Location location){
        for(int i=0;i<list.size();i++){
            PersonDetails person = list.get(i);
            if(person.name.equals(name)){
                person.location = location;
                break;
            }
        }
    }
    
}
