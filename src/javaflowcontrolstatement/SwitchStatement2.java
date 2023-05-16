package javaflowcontrolstatement;

public class SwitchStatement2 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		String userInput ="addition";
		
		switch(userInput)
		{
		
		case "addition" :
		{
			int c = a + b;
			System.out.println(c);
			break;
		}
		
		case "multiplication" :
		{
			int c = a * b;
			System.out.println(c);
			break;
		}
		
		case "substraction" :
		{
			int c = a - b;
			System.out.println(c);
			break;
		}
		
		
		
		}

	}

}
