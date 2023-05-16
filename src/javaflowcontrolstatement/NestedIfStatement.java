package javaflowcontrolstatement;

public class NestedIfStatement {

	public static void main(String[] args) {
		
		String state = "Karnataka";
		

		int age = 21;
		if (state.equalsIgnoreCase("Maharashrtra"))
		{
			
			if (age>=18)
			{
				System.out.println("You are eligible for voting");
			}
			else
			{
				System.out.println("You are underaged");
			}
		}
		
		else {
			System.out.println("You are not Maharashrian");
			
		}
		System.out.println("Thank You");
	}
	
	

}
