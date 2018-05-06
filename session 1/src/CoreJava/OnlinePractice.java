package CoreJava;

import java.util.Scanner;


public class OnlinePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner user = new Scanner(System.in);
		      
	System.out.print("Enter first number: ");
	int firstNumber = user.nextInt();
	System.out.print("Enter second number: ");
	int secondNumber = user.nextInt();
	int sum = firstNumber + secondNumber;
	sum = sum+1;
	System.out.println("Result " + sum);
		   
	
	
	}

}