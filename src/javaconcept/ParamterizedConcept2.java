package javaconcept;

public class ParamterizedConcept2 {

	int empNumber = 4444;
	
	public static void main(String[] args) {
		
		ParamterizedConcept2 pc = new ParamterizedConcept2();
		int status = pc.add(5,10);
		
		System.out.println(status);

	}
	
	public int add (int a, int b)
	{
		return a+b;
		
	}
	
	public String deposit()
	{
		System.out.println("deposit transaction failed");
		
		return "fail";
	}
	

}
