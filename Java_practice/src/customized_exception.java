import java.util.*;
@SuppressWarnings("serial")
class A_Less_Than_B_Exception extends Exception                       //class should extend Exception
{
	A_Less_Than_B_Exception()
	{
		System.out.println("error in input");
	}
}
class customized_exception
{
	public static void main(String[] args) 
	{
		int a,b,c;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a");
		a=sc.nextInt();
		System.out.println("enter b");
		b=sc.nextInt();
		try
		{
			if(a>b)
			{
				c=a-b;
				System.out.println(c);
			}
			else
			{
				throw new A_Less_Than_B_Exception();     //directly or indirectly related to throwable class should create throw new object 
			}
		}
		catch(A_Less_Than_B_Exception e)
		{
			System.out.println("substraction is not possible because___a<b");     //non standard form
		}
		
	}
}
