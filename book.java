import java.util.*;
class book
{
  public string name;
  public string author;
  public int price;
  public int num_page;
  
  book()
  {
  }
   book(String n,String a,int p,int np)
   {
     name=n;
     author=a;
     price=p;
     num_price=np;
   }
   public void set()
   {
	scanner s=new scanner(System.in);
        System.out.print("Ener name of book:");
        name=s.nextLine();
        System.out.print("Enter author of book:");
	author=s.nextLine();
	System.out.print("Enter price of book:");
	price=s.nextInt();
	System.out.print("Enter number of pages of book:");
	num_page=s.nextInt();
   }
   public void get()
   {
	System.out.print("Name of book:"+name);
	System.out.print("Author of book:"+author);
	System.out.print("Price of book:"+price);
	System.out.print("Number of pages of book:"+num_page);
   }
   public int get_obj(int n)
   {
	System.out.print("Enter book number");
	int a=s.nextInt();
	if(a>=n)
	     System.out.println("Invalid book number");
	else
	     return a;
   }
   public String toString()
   {
	System.out.print("Name of book:"+name);
	System.out.print("Author of book:"+author);
	System.out.print("Price of book:"+price);
	System.out.print("Number of pages of book:"+num_page);
   }
}
class book_demo
{
   public static void main(String args[])
   {
	int n,a,c;
	book obj[]=new book[n];
	
	Scanner o=new Scanner(System.in);
	System.out.print("Enter number of books");
        n=s.nextInt();
	
	while(1)
	{
		
		System.out.println("Choose an option");
		System.out.println("1.Set data and display data\n2.display object.content\n3.exit);
	        c=s.nextInt();
		switch(c)
		{
			case 1:obj[a]=set();
			       onj[a]=get();
				break;

			case 2:System.out.println(obj[a]);
			       break;

			case 3:exit(0);

			default:System.out.println("invalid input");
		}
	}
}		










	 






























