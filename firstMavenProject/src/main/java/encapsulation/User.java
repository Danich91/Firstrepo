package encapsulation;

public class User {

	public static void main(String[] args) {
		
		Bank B=new Bank();
		int pin=1234;
		B.setPin(pin);
		B.getPin();
		
		if (B.validatepin())
		{
			System.out.println("Pin validated Successfully");
		}
		else
		{
			System.out.println("Invalid Pin");
		}
		// TODO Auto-generated method stub

	}

}
