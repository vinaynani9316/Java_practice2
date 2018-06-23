class Object    //program for printing address of the object with out over riding toString()
{
	public String toString()    //here with out over riding toString()
	{
		return"return the address";
	}
}
class Person
{
	int age;
	Person(int x)
	{
		age=x;
	}
	void disp()
	{
		System.out.println("age is" +age );
	}
}
public class Person_app 
{
	public static void main(String[] args) 
	{
		Person p1=new Person(10);
		p1.disp();
		System.out.println(p1); // p1 address will print
		System.out.println(p1.toString()); //p1.toString() address will print & it only give address of the object not content of the object.
	}

}
