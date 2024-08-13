import java.util.*;
class multiply
{
	public static void main(String args[])
	{
		int i,p;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number whose multiplication table is to be printed:");
		int n=sc.nextInt();
		System.out.println("Enter the range:");
		int r=sc.nextInt();
		for(i=1;i<=r;i++)
		{
				p=i*n;
				System.out.println(i+"*"+r+"="+p);
		}
	}
}				
			
