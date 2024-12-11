package encapsulation;

public class Encapseg2 {
	
	private String StudentName;
	private int rollno;
	
	public void setdetails(String StudentName,int rollno)
	{
		this.StudentName=StudentName;
		this.rollno=rollno;
	}

	public void getdetails()
	{
		System.out.println("Student Name is: "+StudentName);
        System.out.println("Student rollno is:"+rollno);
	}
}
