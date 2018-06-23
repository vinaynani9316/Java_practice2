import java.util.*;
public class Demo10 
{
	private static Scanner scan;

	public static void main(String[] args) 
	{
		String s1;
		scan = new Scanner(System.in);
		System.out.println("enter a number");
		s1=scan.next();
		int i;
		for (i=0;i<=s1.length()-1;i++)
		{
			if(s1.charAt(i)=='1')
			{
				System.out.println("one");
			}
			else if(s1.charAt(i)=='2')
			{
					System.out.println("two");
			}
			else if(s1.charAt(i)=='3') 
			{
					System.out.println("three");
			}
			else if(s1.charAt(i)=='9')
			{
				System.out.println("nine");
			}
			else if(s1.charAt(i)=='0')
			{
				System.out.println("zero");
			}
		     System.out.println();
	}
	}
	
}
