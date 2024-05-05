//General class that build the all the common that is being read by employee class 
public class Person {
	//declare variables 
	private String firstName;
	private String lastName;
	private String email;
	private long phoneNumber;
	
	//empty Constructor/*
	/*public Person() {
		
	}
	*/
	
	//Arguments Constructor
	public Person(String firstName,String lastName,String email,long phoneNumber) {
		
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
		this.phoneNumber=phoneNumber;
	}
	
	//get full name from two variables firstName and lastName
	public String getFullName() {
		return firstName+" "+lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	//get long phoneNumber
	public long getPhoneNumber() {
		return phoneNumber;
	}
	
	

}
