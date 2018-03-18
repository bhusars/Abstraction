package com.partialabstraction;

abstract public class Banking {
private int accno;
private String accholder_Name;
private float balance;
public int getAccNo(){
	System.out.println("getAccNo");
	return 0;	
}//end of getAccNo()

public String getaccholder_Name(){
	System.out.println("accholder_name");
	return "accholder_Name";	
}//end of getaccholder_Name

public float getbalance(){
	System.out.println("balance");
	return 0.0f;
}//end of getbalance()
abstract public void creditcard();
}//end of banking class
 



/*
 * 1. 0-100% abstraction
 * 2. Abstract classes cannot be instantiated.
 * 3. Abstract class can have both abstract and non-abstract methods.
 * 4. An Abstract class may not have any abstract methods.
 * 5. If we declare a method as abstract inside a class, then that class should be declared abstract. Otherwise
 *    we will get a compile time error.
 *    
 * */
 

 