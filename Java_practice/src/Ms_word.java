class Ms_app extends Thread     // extending from same class on independent activities from same application
{
	Ms_app(String name)
	{
		super(name);
	}
	public void run()       //common run() for all functions it will decide when to active thread for a same application based on the name
	{
		if(getName().equals("typing"))
		{
			typing();
		}
		else if(getName().equals("spell_cHeck"))
		{
			spell_check();
		}
		else
		{
			auto_save();
		}
	}
	void typing()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("typing is in progress");
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	void spell_check()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("spell_check is in progress");
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	void auto_save()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("auto_saving is in progress");
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
public class Ms_word 
{
	public static void main(String[] args) 
	{
		Ms_app m1=new Ms_app("typing");
		Ms_app m2=new Ms_app("spell_check");
		Ms_app m3=new Ms_app("auto_saving");
		m1.start();
		m2.start();
		m3.start();
	}

}
