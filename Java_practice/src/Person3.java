public class Person3 {
	String name;
	String age;
    public static void main(String[]args)
	{
		Person3 p[]=new Person3[5];
		p[0]=new Person3();
		p[1]=new Person3();
		p[2]=new Person3();
		p[3]=new Person3();
		p[0].name="raju";
		p[0].age="18";
		p[1].name="vinay";
		p[1].age="24";
		p[2].name="vinod";
		p[2].age="23";
		p[3].name="ramu";
		p[3].age="34";
		int i;
		for(i=0; i<p.length-1; i++)
		{
			System.out.println(p[i].name);
			System.out.println(p[i].age);
		}
	}

}
