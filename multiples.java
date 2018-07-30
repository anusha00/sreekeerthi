import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int multiplesFound = 0; 
		int currentNumber = 1; 
		do {
			if(currentNumber % 5 == 0) {
				multiplesFound++;
				System.out.print( currentNumber);
			}
			currentNumber++;
		} while(multiplesFound<5);
	}
   }
