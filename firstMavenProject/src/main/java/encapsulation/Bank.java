package encapsulation;

public class Bank {
	
	private int pin;
	private final int validpins[]= {1001,1234,1212};
	
	
	public void setPin(int pin)
	{
		this.pin=pin;
	}
	 
	public void  getPin()
	{
		System.out.println("The Pin user provided is: " +pin);
	}

	
//Method to validate the pin
	
	public boolean validatepin()
	{
		for(int validpin:validpins)
		{
			if(pin==validpin)
			{
				return true;
			
			}
	
	}
		return false;
	}
	
}
