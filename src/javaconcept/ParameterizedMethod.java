package javaconcept;

import java.util.Scanner;

public class ParameterizedMethod {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter first number: ");
		int n1 = scan.nextInt();
		
		System.out.println("Please enter second number:");
		int n2 = scan.nextInt();
		

		ParameterizedMethod pm = new ParameterizedMethod();
		pm.add (n1, n2 );


	}

	public void add(int num1, int num2) {
		
		int a = num1;
		int b = num2;
		int c = a + b;
		System.out.println("Addition of a and b is : "+c );
	}
	public void createContact(String name, String address,int mobNum)
	{
		
		
	}
	
}


