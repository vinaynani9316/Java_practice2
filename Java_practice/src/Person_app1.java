class Object1   //program for printing the contents of the object by over riding toString()
{
	public String toString()
	{
		return"return the address";
	}
}
class Person1
{
	int age;
	Person1(int x)
	{
		age=x;
	}
	void disp()
	{
		System.out.println("age is" +age);
	}
	public String toString()
	{
		return"age is" +age;    //over riding
	}
}
public class Person_app1 
{
	public static void main(String[] args)
	{
		Person1 p1=new Person1(10);
		p1.disp();
		System.out.println(p1);
		System.out.println(p1.toString()); //by overriding toString() it is printing content of the object.
		
		
	}

}
