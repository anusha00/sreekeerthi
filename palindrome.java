import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=131,reversedinteger=0,remainder,originalinteger;
		System.out.println("enter integer:");
		originalinteger=n;
		while(n!=0)
		{
			remainder=n%10;
			reversedinteger=reversedinteger*10+remainder;
			n/=10;
			
		}
		 if (originalinteger==reversedinteger)
		System.out.println("yes");
		else
		System.out.print("no");
	}
}
