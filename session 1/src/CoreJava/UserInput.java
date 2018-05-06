package CoreJava;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for String
	Scanner reader=new Scanner(System.in);
	System.out.println("What is your Name");
	String name=reader.next();
	System.out.println("Your name is "+name);
	
	Scanner reader1=new Scanner(System.in);
	System.out.println("How old are you");
	int age=reader.nextInt();
	System.out.println("My age is "+age);
	
	
	}

}
