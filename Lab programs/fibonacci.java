import java.util.*;
public class fibonacci
{
	public static void main(String args[])
	{
		int i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range:");
		int n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			sum=sum+i;
			System.out.println(sum+",");
		}
	}
}			
