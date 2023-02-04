package com.upskill.java_4;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
	private String name = "upskill";			//write & read
	private int ssn = 45213678;					//write only
	private String username = "raselalam";	    //read only
	
	private int age;
	private String city;
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("Rasel");
		System.out.println(obj.getName());
		obj.setSSN(56845214);
		System.out.println(obj.getUsername());
		
		obj.setAge(40);
		System.out.println(obj.getAge());
		
		obj.setCity("NYC");
		System.out.println(obj.getCity());
		
	}
	
	//Setter Method - name						//set the data, Write
	public void setName(String value){
		name = value;
	}
	
	//Getter Method - name						//get the data, Read
	public String getName(){
		return name;
	}
	
	//Setter Method - ssn						//set the data, Write only
	public void setSSN(int value){
		ssn = value;
	}
	
	//Getter Method - username		 			//get the data, Read only
	public String getUsername(){
		return username;
	}
	
	// get age 
	
	public int getAge () {
	    return age;
		
	}
	//  Set age 
	public void setAge (int value) {
		age = value;
	}
	
	// get city
	public String getCity () {
	    return city;
	}
	    
	    //Set City
	    
	    public void setCity (String value) {
			city = value;
	    
}}
	    
	    

