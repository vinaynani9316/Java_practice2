class Dead_lock implements Runnable
{
	String r1="sybase";
	String r2="DB2";
	String r3="oracle";
	Thread t1,t2;
	void start_DB_process()
	{
		t1=new Thread(this);
		t2=new Thread(this);
		t1.setName("rama");
		t2.setName("sita");
		t1.start();
		t2.start();
	}
	public void run()
	{
		if(Thread.currentThread().getName().equals("rama"))
		{
			acquires_rama_resources();
		}
		else
		{
			acquires_sita_resources();
		}
	}
	void acquires_rama_resources()
	{
		synchronized(r1)                            //lock for this particular statement.
		{
			System.out.println("rama has acquired sybase");
			synchronized(r2)
			{
				System.out.println("rama has acquired DB2");
				synchronized(r3)
				{
					System.out.println("rama has acquired oracle");
				}
			}
		}
	}
	void acquires_sita_resources()
	{
		synchronized(r1)
		{
			System.out.println("sita has acquired sybase");
			synchronized(r2)
			{
				System.out.println("sita has acquired DB2");
				synchronized(r3)
				{
					System.out.println("sita has acquired oracle");
				}
			}
		}
	}
}
class Dead_lock_app
{
	public static void main(String[] args) 
	{
		Dead_lock d=new Dead_lock();
		d.start_DB_process();
	}
}