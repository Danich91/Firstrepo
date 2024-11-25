package inheritance;

public class SingleChild2 extends SingleParent2{
	
	public void totalMarks(float a,float b)
	{
		float c=a+b;
		System.out.println("Total Marks is " +c);
	}

	public static void main(String[] args) {
		
		SingleChild2 obj=new SingleChild2();
		obj.getname();
		obj.totalMarks(56.5f,89.6f);
		
		// TODO Auto-generated method stub

	}

}
