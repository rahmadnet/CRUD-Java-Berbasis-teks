package belajarOOP;

public class main 
{

	public static void main(String[] args) 
	{
//		Account ac = new Account(12345);
//		ac.setBalance(80000);
//		System.out.println(ac);
//		ac.credit(70000);
//		System.out.println(ac);
//		ac.debit(160000);
//		System.out.println(ac);
//		ac.debit(100000);
//		System.out.println(ac);
		
		Author a = new Author("Rahmad Nasution", "rahmadnet@gmail.com", 'M');
		Book b = new Book("Hacktoberfest", a, 100000, 10);
		
		System.out.println(b);
	}

}
