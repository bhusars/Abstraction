package com.partialabstraction;

public class Chrysler implements SwiftInterface, MarutiInterface{
public void run(){
 System.out.println("run");	
}
public void powersteering(){
System.out.println("powersteering");
}
public void backcam(){
System.out.println("backcam");
}

public static void main(String []args){
	Chrysler c=new Chrysler();
	c.run();
}
	
}
