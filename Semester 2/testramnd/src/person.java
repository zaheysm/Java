

public abstract class person {//abstract class functions as base class which can be extended by subclasses
	protected String firstName; //instance variables
	protected String lastName;
	protected String emailId;
	protected long phoneNumber; //Here protected modifier is used, we can skip using access modifiers as these all will belong to same package that is created
	
	//do not need no-arg constuctor because we have access to default constructor
	abstract void readInfo();//declarling a method header for an abstract class
	abstract void printInfo();

}
