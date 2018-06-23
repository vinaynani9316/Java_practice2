import java.util.Scanner;
class OneDimension 
{
 public static void main(String[]args)
	{
		int a[];
		a=new int[5];
		Scanner scan = new Scanner(System.in);
		int i;
		for(i=0; i<=a.length-1; i++)
		{
		   System.out.println("enter an elementt");
		   a[i]=scan.nextInt();
		   
		}
		for(i=0; i<=a.length-1; i++)
		{
			System.out.println(a[i]);
		}
		scan.close();
	}
 
}
