class Demo15
{
	int add1(int x,int y)
	{
		return x+y;
	}
	float add2(float x,float y)
	{
		return x+y;
	}
	float add3(int x, float y)
	{
		return x+y;
	}
	double add4(int x, float y, double z)
	{
		return x+y+z;
	}
	float add5(int x,int y, float z)
	{
		return x+y+z;
	}
	float add6(float x, int y)
	{
		return x+y;
	}
	int add7(int x, int y, int z)
	{
		return x+y+z;
	}
}
 class MethodOverloadingex 
  {
	public static void main(String[] args) 
	{
		int a=4,b=5,c=6;
		float m=4.5f, n=5.5f, o=6.5f;
		double p=7.5, q=8.5, r=9.5;
		Demo15 d1=new Demo15();
		System.out.println(d1.add4(a,m,p));
		System.out.println(d1.add5(a,b,m));
		System.out.println(d1.add6(n,b));
		
	}

}

