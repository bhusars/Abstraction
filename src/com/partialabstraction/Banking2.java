package com.partialabstraction;

abstract public class Banking2 {
private int accno;
private String accholder_Name;
private float balance;
abstract public int getAccNo();//end of getAccNo()
abstract public String getaccholder_Name();
abstract public float getbalance();
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
 

 