interface Calcu
{
	void add();
	void sub();
}
class Add1 implements Calcu
{
	public void add()
	{
		int a,b,c;
		a=8;
	    b=9;
	    c=a+b;
	    System.out.println(c);
	}
	public void sub()
	{
		int a,b,c;
		a=50;
		b=-9;
		c=a-b;
		System.out.println(c);
	}
	void mul()                               //default access specifier
	{
		int a,b,c;
		a=6;
		b=9;
		c=a*b;
		System.out.println(c);
	}
}
public interface Interfaces 
{
	public static void main(String[] args) 
	{
		Add1 a=new Add1();            //class implements object
		Calcu cal;                   //interface reference
		cal=a;
		cal.add();
		cal.sub();
		// ptr.mul();             specialized() can't invoke through interface reference
		((Add1)(cal)).mul();      //down casting of specialized()
		
	}

}
