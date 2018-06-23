class Object3
{
	public boolean equals(Object obj) //taking reference of the object.
	{
		return false;    // we can write either true or false for boolean return type.
	}
}
class Personp
{
	int age;
	Personp(int x)
	{
		age=x;
	}
}
public class Person_demo 
{
	public static void main(String[] args) 
	{
		Personp p1=new Personp(10);
		Personp p2=new Personp(10);  //it will print references of the object
		if(p1.equals(p2))
		{
			System.out.println("p1 & p2 are ponting to same object");
		}
		else
		{
			System.out.println("p1 & p2 are not pointing to same object ");
		}
		
	}

}
