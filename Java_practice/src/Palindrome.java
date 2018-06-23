public class Palindrome 
{
	public static void main(String[] args) 
	{
		String s1="mddam";
		int n=s1.length();
		char org[]= new char[n];
		char rev[]= new char[n];
		int i,j;
		int flag;
		for(i=0;i<=n-1;i++)
		{
			org[i]=s1.charAt(i);
		}
		j=0;
		for(i=n-1;i>=0;i--)
		{
			rev[j]=org[i];
			j++;
		}
		flag=0;
		for(i=0;i<=n-1;i++)
		{
			if(org[i]==rev[i])
			{
				continue;
			}
			else
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
		}
}