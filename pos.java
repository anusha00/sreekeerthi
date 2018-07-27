import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input=new Scanner(System.in);

    System.out.print("enter a number:");
    
   int n=input.nextInt();

    if(n==0)
    { 
    	System.out.print("number equal to zero");
    
    }
    else if(n>0)
    { 
    	System.out.print("number is positive");
    }
    else
    { 
    	System.out.print("number is negitive");
    	
    }


	}
}
