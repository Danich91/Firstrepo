package abstraction;

public class AbstractionEg2Child extends AbstractionEg2{
	
	

	public static void main(String[] args) {
		
		AbstractionEg2Child obj=new AbstractionEg2Child();
		obj.add();
		obj.sub();
		// TODO Auto-generated method stub

	}

	@Override
	public void sub() 
	{
		
		int a=80;
		int b=70;
		int c=a-b;
		System.out.println("Substraction result is: "+c);
		// TODO Auto-generated method stub
		
	}

}
