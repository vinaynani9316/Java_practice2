class SwapDemo
{
	void swap(int x,int y)
	{
		int z;
		z=x;
		x=y;
		y=z;
	}
}
class Demo_1
	{
  public static void main(String[] args) 
	{
		SwapDemo sd;
		sd=new SwapDemo();
		int a,b;
		a=10;
		b=20;
		System.out.println("before swapping");
		System.out.println(a);
		System.out.println(b);
		sd.swap(a,b);
		System.out.println("after swapping");
		System.out.println(a);
		System.out.println(b);
		
		
	}

  }
