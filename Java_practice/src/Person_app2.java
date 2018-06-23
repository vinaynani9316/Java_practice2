class Object2
{
	public boolean equals(Object2 obj)
	{
		return false;
    }
}
class Person2
{ 
	int age;
	Person2(int x)
	{
		age=x;
	}
}
public class Person_app2 
{
	public static void main(String[] args) 
	{
		Person2 p2=new Person2(10);
		Person2 p3;
		p3=p2;               //it will reference of the object 
		if(p2.equals(p3))
		{
			System.out.println("P3 & p2 are pointing to same objet");
		}
		else
		{
			System.out.println("p3 & p2 are not pointing to same object");
		}
		
	}

}
