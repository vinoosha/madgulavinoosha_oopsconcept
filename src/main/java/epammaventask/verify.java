package epammaventask;
import java.util.ArrayList;
import java.util.Scanner;

public class verify 
{
	static ArrayList<giftpack> al=new ArrayList<giftpack>();
	public static void mian(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of gifts");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the choice \n 1.chocolates \n 2.sweets");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1: inputchoc();
			break;
			case 2:inputSweet();
			break;
			default:System.out.println("Enter the number between  1 and 2");
			break;
			}
		}
		System.out.println(al);
	}
	public static void inputSweet() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sweet name");
		String name=sc.next();
		System.out.println("Enter sweet price");
		int price=sc.nextInt();
		System.out.println("enter the sweet weight");
		int weight=sc.nextInt();
		if (name.contentEquals("gulabjamun"))
		{
			gulabjamun gj=new gulabjamun(name,price,weight);
			al.add(gj);
		}
		
	}
	public static void inputchoc() 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter choci name");
		String name=s1.next();
		System.out.println("Enter choci price");
		int price=s1.nextInt();
		System.out.println("enter the choci weight");
		int weight=s1.nextInt();
		if (name.contentEquals("kikat"))
		{
			kitkat kt=new kitkat(name,price,weight);
			al.add(kt);
		}
	
	
	
	
	
}
}