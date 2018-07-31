import java.util.*;
import java.lang.*;
import java.io.*;

class Max
{
		static int arr[] = {1 , 2 , 3 };
	
	static int largest()
	{
		int i;
		
	
		int max = arr[0];
		for (i = 1; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];
	
		return max;
	}
		public static void main(String[] args) 
	{
		System.out.println(" "  + largest());
	}
}

