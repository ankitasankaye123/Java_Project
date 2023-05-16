package javaconcept;

public class MethodConcept2 {

	public static void main(String[] args) {

		MethodConcept2 mc2 = new MethodConcept2();
		mc2.login();
		mc2.selectProduct();
		mc2.selectProduct();
		mc2.selectProduct();
		mc2.payment();
		mc2.deliver();

	}
	
	public void login() {
		System.out.println("Logged in successfully");
	}
	
	public void selectProduct() {
		System.out.println("Product has been add in Cart");
	
	}
	public void payment() {
		System.out.println("payment completed successfully");
	
	}

	public void deliver() {
		System.out.println("product deliver to user successfully");
	}
}
