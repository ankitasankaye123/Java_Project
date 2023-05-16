package javaflowcontrolstatement;

public class ElseIfLadder {

	public static void main(String[] args) {
		
		String browser ="firefox";
		
		if (browser.equals("chrome"))

		{
			System.out.println("We are usering chrome browser for testing");
		}
		else if (browser.equals("firefox")) {
			System.out.println("We are using firefox browser for testing");
		}
		
		else if (browser.equals("edge")) {
			System.out.println("We are using edge browser for testing");
		}
		
		
		else if (browser.equals("safari")) {
			System.out.println("We are using safari browser for testing");
		}
		
		else {
			System.out.println("Please select valid browser");
		}
		
		
	}


}
