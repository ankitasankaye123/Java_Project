package javaconcept;

public class ConstructorConcept {

	String orgName = "SpeedwayTech";
	
	public ConstructorConcept()
	
	{
		System.out.println("We are learing constructor concept");
	}
	
	public static void main(String[] args) 
	{
	
		
		ConstructorConcept cc = new ConstructorConcept();
		
		System.out.println(cc.orgName);
		
		cc.demo();
		

	}
	 public void demo()
	 {
		 System.out.println("this is demo method");
		 
	 }

}
