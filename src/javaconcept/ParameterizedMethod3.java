package javaconcept;

public class ParameterizedMethod3 {

	public static void main(String[] args) {


		ParameterizedMethod3 pm = new ParameterizedMethod3();
			pm.add();// parameter method 1 example
		    pm.add(30,40);// parameter method 2 example
		    pm.createContact();
		        
			}
			
			public void add() 
			{
			int a = 50;
			int b = 30;
			int c = a + b;
			System.out.println("Addition of a and b is : " +c);
			}
			
			public void add(int num1, int num2)
			{
				int a = num1;
				int b = num2;
				int c = a + b;
				System.out.println("Additoion ofa and b is :" +c);
				
			}
			public void createContact()
			{
				
				String name = "Ankita ashish Soundale ";
				String address= "Ambajogai";
				int mobNum = 123456789;
			    System.out.println(name);
			    System.out.println(address);
			    System.out.println(mobNum);
			}
			

}
		
			
			
		

	


