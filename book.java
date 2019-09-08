import java.util.*;
class book
{
	string name;
	string author;
	int price;
	int num_pages;
	book(){}
	book(String NAME,String AUTHOR,int PRICE,int NUM_PAGES)
	{
		name=NAME;
		author=AUTHOR;
		price=PRICE;
		num_pages=NUM_PAGES;
	}
	void accept(String NAME,String AUTHOR,int PRICE,int NUM_PAGES)
	{
		name=NAME;
		author=AUTHOR;
		price=PRICE;
		num_pages=NUM_PAGES;
	}
	void display()
	{
		System.out.println("the name of the book is"+name);
		System.out.println("the author of the book is"+author);
		System.out.println("the price of the book is"+price);
		System.out.println("the no of pages "+num_pages);
	}
}
class books
{
	public static void main(String args[])
	{
		System.out.println("Enter the number of objects");
		Scanner o=new Scanner(System.in);
		int r=o.nextInt();
		book d[]=new book[r];
		for(int i=0;i<=r;i++)
		{
			d[i]=new book();
			System.out.println("Enter book name,author,price,no. of pages");
			String s1=o.next();
			String s2=o.next();
			int s3=o.next();
			int s4=o.next();
			d[i].accept(s1,s2,s3,s4);
			d[i].display();
		}
	}
}












	