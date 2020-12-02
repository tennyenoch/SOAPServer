package org.soap.example;

public class HelloWorld {
	public String helloWorld(String Name)
	{
		System.out.println("Inside Service Class");
		return "Hello World "+Name;
	}

}
