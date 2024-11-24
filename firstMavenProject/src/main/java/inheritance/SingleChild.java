package inheritance;

public class SingleChild extends SingleParent {

	
	public void rollno()
	{
		System.out.println("Roll No is 4");
	}

	public static void main(String args[])
	{
		SingleChild obj=new SingleChild();
		obj.name();
		obj.rollno();
	}
}
