import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class hlyday
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(s.equals("sunday")||s.equals("saturday"))
			System.out.println("yes");
		else
			System.out.println("no");
	}
}