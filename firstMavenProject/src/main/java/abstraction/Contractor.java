package abstraction;

public class Contractor extends Employee
{
  int PaymentPerHour;
  int workingHours;
  
  public Contractor(String name,int id,int PaymentPerHour, int workingHours)
  {
	  super(name,id);
	  this.PaymentPerHour=PaymentPerHour;
	  this.workingHours=workingHours;
  }
	@Override
	public double CalcSalary() {
		
		
		// TODO Auto-generated method stub
		return PaymentPerHour* workingHours;
	}

}
