import java.util.Scanner;
interface Connection
{
	void add();
	void sub();
}
class Oracle implements Connection
{
	public void add()
	{
	   int a,b,c;
	   a=10;
	   b=20;
	   c=a+b;
	   System.out.println(c);
	}
	public void sub()
	{
		int a,b,c;
		a=90;
		b=-60;
		c=a-b;
		System.out.println(c);
	}
}
class Sybase implements Connection
{
	public void add()
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a");
		a=sc.nextInt();
		System.out.println("enter b");
		b=sc.nextInt();
		c=a+b;
		System.out.println("sum is:" +c);
	}
	public void sub()
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a");
		a=sc.nextInt();
		System.out.println("enter b");
		b=sc.nextInt();
		c=a-b;
		System.out.println("diff is:" +c);
	}
}
class Connection_app
{
	void allow_connection(Connection ref)                          //run time polymorphism using reference
	{
		ref.add();
		ref.sub();
	}
}
public class DB 
{
	public static void main(String[] args)
	{
		Oracle o=new Oracle();                         //reference of interface
		Sybase s=new Sybase();
		Connection_app con=new Connection_app();           
		con.allow_connection(o);
		con.allow_connection(s);
	}
}
