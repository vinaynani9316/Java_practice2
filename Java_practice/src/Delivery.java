public class Delivery 
{
	private int year;
	private String Team_name;
	private int count;
	public Delivery(int year, String Team_name, int count)
	{
		super();
		this.year=year;
		this.Team_name=Team_name;
		this.count=count;
	}
	public Delivery(int parseInt, int parseInt2, int parseInt3, int parseInt4, int parseInt5, int parseInt6,
			int parseInt7, int parseInt8, int parseInt9, int parseInt10, int parseInt11, int parseInt12, int parseInt13,
			int parseInt14, int parseInt15, int parseInt16) {
		// TODO Auto-generated constructor stub
	}
	public int get_year()
	{
		return year;
	}
	public void set_year(int year)
	{
		this.year=year;
	}
	public String getTeam_name()
	{
		return Team_name;
	}
	public void setTeam_name(String Team_name)
	{
		this.Team_name=Team_name;
	}
	public int getcount()
	{
		return count;
	}
	public void setcount(int count)
	{
		this.count=count;
	}
     public String toString()
	{
		return "Delivery[year=" +year+", Team_name=" +Team_name+", count=" +count+"]";
	}
	public Integer getDATE() {
		// TODO Auto-generated method stub
		return null;
	}

}
