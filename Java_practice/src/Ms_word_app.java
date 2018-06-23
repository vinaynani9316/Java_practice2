class Msword extends Thread
{
	Msword(String name)
	{
		super(name);                        
	}
	public void run()
	{
		if(getName().equals("typing"))      //equals() will check contents are equal or not
		{
			typing();
		}
		else if(getName().equals("spellcheck"))
		{
			spellcheck();
		}
		else 
		{
			autosave();
		}
	}
	void typing()
	{
		try
		{
			for(int i=1;i<5;i++)
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
	void spellcheck()
	{
		try
		{
		  for(;;)                                    // daemon threads always be in infinite loop
		   {
			System.out.println("spellcheck is in progress");
			Thread.sleep(2000);
		   }
		}
		catch(Exception r)
		{
			System.out.println(r.getMessage());
		}
	}
	void autosave()
	{
		try
		{
			for(;;)
			{
				System.out.println("autosave is in progress");
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());    //to get what the exception is?
		}
	}
}
public class Ms_word_app 
{
	public static void main(String[] args) 
	{
		Msword m1=new Msword("typing");//daemon thread will active as soon as the main thread active & get deactivated as soon as the main stops.
		Msword m2=new Msword("spellcheck");
		Msword m3=new Msword("autosave");
		m2.setDaemon(true);   //by default it will false so make manually true 
		m3.setDaemon(true);
		m2.setPriority(10);   //priority set of daemon threads should always be high b/w (5-10) so that it can't leads to exception illegal
		m3.setPriority(8);
		m1.start();           //active state of thread class
		m2.start();
		m3.start();
	}

}
