package com.upskill.java_4;

public class Constructor {
	
	/*Constructor is instance of class, method same as class name, java will execute constructor first
	- 	Constructor cannot be static or override nor void or return type.
	- 	Default Constructor : No constructor is initialized
	- 	Parameterized Constructor : Add different signature
	-	Constructor overloading : Different signature
	*/
	
	String studentName;
	int studentAge;
	
	public Constructor(String name, int age){   // method 
		studentName = name;
		studentAge = age;
	}
	
	public Constructor(String name){    // method 
		studentName = name;
	}
	
	public Constructor(int age){    // integer/ Method 
		studentAge = age;
	}

	public static void main(String[] args) {
		// Constructor obj = new Constructor();  default constructor 
		Constructor obj1 = new Constructor("Rasel", 30);
		
		
		System.out.println(obj1.studentName);              //24, 25 line 
		System.out.println(obj1.studentAge);
		
		Constructor obj2 = new Constructor("Nazmul");
		System.out.println(obj2.studentName);
		
		Constructor obj3 = new Constructor(35);
		System.out.println(obj3.studentAge);
	}
}


