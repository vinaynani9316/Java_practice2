class Object4
{
	public boolean equals(Object4 obj)
	{
		 return false;
	}
}
class Persona
{
	int age;
	Persona(int x)
	{
		age=x;
	}
     public boolean equals(Persona obj)  // it is pointing to contents of object rather than references
     {
    	 Persona temp;
    	 temp=(Persona)obj;  //type casting persona object
    	 if(this.age==temp.age)  
    	 {
    		 return true;
    	 }
    	 else
    	 {
    		 return false;
    	 }
     }
}
public class PersonAppcontentequals 
{
	public static void main(String[] args) 
	{
		Persona p1=new Persona(10);
		Persona p2=new Persona(10);  // if you give different number then it will print contents are not same
		if(p1.equals(p2))
		{
			System.out.println("contents are same");
		}
		else
		{
			System.out.println("contents are not same");
		}
		
	}

}
