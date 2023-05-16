package javaflowcontrolstatement;

public class NestedForLoop {

	public static void main(String[] args) {


		/*
		 
		 * 
		 ** 
		 ***
		 ****
		 *****
		 
		 
		 A
		 BB
		 CCC
		 DDDD
		 EEEEE
		 
		 
		 1
		 22
		 333
		 4444
		 55555
		 
		 
		 for(int i= 1; i<=5; i++)
		{
			for(int j =1; j<=i; j++)
			{	
			System.out.print("*");
			}
			System.out.println();
			
			//A B C D Program
			 
			for(int i= 1; i<=5; i++)
		{
			for(int j =1; j<=i; j++)
			{	
			System.out.print(i);
			}
			System.out.println();
			char alph = 'A';
			alph++;
		}
			
		 */
		//1 2 3 4 5 Program
		
		for(int i= 1; i<=5; i++)
		{
			for(int j =1; j<=i; j++)
			{	
			System.out.print(i);
			}
			System.out.println();
			char alph = 'A';
			alph++;
		}
	
	}

		
		
}
