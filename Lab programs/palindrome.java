import java.util.*;
public class palindrome
{
	public static void main(String args[])
	{
		String s,s1,rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		s=sc.next();
		int len=s.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println("it is palindrome");
		}
		else
		{
			System.out.println("it is not palindrome");		
		}
	}
}			
