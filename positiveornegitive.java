import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = input.nextInt();

    if( number == 0)
    { 
    	System.out.println("zero");
    }
    else if (number > 0)
    { 
    	System.out.println("positive");
    }
    else 
    { 
    	System.out.println("negative"); 
    	
    }


	}
}
