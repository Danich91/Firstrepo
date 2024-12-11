package aggregation;

public class Address {
	
	String address;
	Student ref;
	public Address(String address,Student ref)
	{
		this.address=address;
		this.ref=ref;
	}

	public void display()
	{
		System.out.println(ref.name+" "+ref.rollno);
		System.out.println(address);
	}
	public static void main(String[] args) {
		
		Student obj=new Student("Eliza",16);
		Address obj1=new Address("Naduvathu",obj);
		obj1.display();
		
		// TODO Auto-generated method stub

	}

}
