package constructorProgramme;

public class Developed {

	// Creating non-parameterized constructor.
	   Developed() 
	   { 
	     System.out.println("Java was developed by James Gosling"); 
	   }
	// Creating one paramterized constructor. 
	  Developed(int year) 
	  { 
	// Declaration of this keyword with two parameters list. It must be the first line. 
	   this("Java" , 1995); // It will call two parameters constructor within the same class. 
	   System.out.println("James Gosling is known as Father of Java programming language."); 
	 } 
	// Creating two parameters constructor.
	  Developed(String name, int year) 
	  { 
	// Declaration of this keyword without the parameter. 
	    this(); // It will call default constructor due to no parameter in this() keyword. 
	    System.out.println("at Sun Microsystem and released in 1995"); 
	 } 
	// Instance method declaration. 
	   void display() 
	   { 
	     System.out.println("The Java compiler is written in Java but Java runtime in ANSI C."); 
	   } 
	// Static method or main method. 
	  public static void main(String[] args) 
	  { 
	// Create an object of class Developed using the new keyword and passes the int value. 
	   Developed obj = new Developed(1995); // It will call one parameter constructor. 

	// Call display method using object reference variable obj. 
	    obj.display(); 
	  } 
	}