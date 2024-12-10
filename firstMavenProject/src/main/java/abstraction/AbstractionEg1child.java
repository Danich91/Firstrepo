package abstraction;

public class AbstractionEg1child  extends AbstractionEg1{

	public static void main(String[] args) {
		
		AbstractionEg1child obj=new AbstractionEg1child();
		obj.display();
		obj.display2();
		obj.add();
		// TODO Auto-generated method stub

	}

	@Override
	public void display2() {
		
		System.out.println("It was an abstract method");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add() {
		
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Addition Result is: "+c);
		// TODO Auto-generated method stub
		
	}
	
	

	
	
}
