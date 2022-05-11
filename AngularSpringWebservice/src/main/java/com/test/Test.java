package com.test;

import java.util.ArrayList;
import java.util.TreeSet;

public class Test {

	/*
	 * ArrayList<String> al = new ArrayList<String>(); User user = new
	 * User("test","trst",al); user = new User("1","2",new ArrayList<String>());
	 */
	
}


final class User {
    String firstName;
    String lastName;
    ArrayList<String> addressList;
     
    public User(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public ArrayList<String> getAddress(){
        return new ArrayList<String>();
    }
     
}
