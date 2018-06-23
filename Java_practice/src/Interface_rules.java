interface Compute                 //create interface
{
	void add();
	void sub();
}
class Calc implements Compute
{
	public void add()
	{
		int a,b,c;
		a=10;
		b=70;
		c=a*b;
		System.out.println(c);
	}
	public void sub()
	{
		int a,b,c;
		a=-20;
		b=10;
		c=a+b;
		System.out.println(c);
	}
}
public interface Interface_rules 
{
	public static void main(String[] args) 
	{ 
		Calc c=new Calc();            //object of interface can't be created
		Compute ptr;                  //reference of interface can be created
		ptr=c;                        //assign interface reference to implements object
		ptr.add();
		ptr.sub();
		
	}

}
