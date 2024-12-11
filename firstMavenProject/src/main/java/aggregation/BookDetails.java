package aggregation;

public class BookDetails {
	String bookname;
	int id;
	AuthorDetails ref;
public BookDetails(String bookname, int id,AuthorDetails ref)
{
	this.bookname=bookname;
	this.id=id;
	this.ref=ref;
	
}

public void display()
{
	System.out.println(ref.name+" "+ref.age );
	System.out.println(bookname +" "+ id);
}
	public static void main(String[] args) {
		AuthorDetails obj=new AuthorDetails("Dani",32);
		BookDetails obj1=new BookDetails("My Book",1122,obj);
		obj1.display();
		// TODO Auto-generated method stub

	}

}
