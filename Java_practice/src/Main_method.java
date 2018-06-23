public class Main_method 
{
	void non_static_disp()
	{
		System.out.println("non static() executed");
	}
	static void static_disp()
	{
		System.out.println("static() executed");
	}
	public static void main(String[] args) 
	{
		Main_method m=new Main_method();
		m.non_static_disp();
		m.static_disp();
		
	}
	

	

}
