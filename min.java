import java.util.*;
import java.lang.*;
import java.io.*;

class ideone
{
		static int arr[] = {1 , 2 , 3 };
	
	static int smallest()
	{
		int i;
		
	
		int min = arr[0];
		for (i = 1; i < arr.length; i++)
			if (arr[i] < min)
				min = arr[i];
	
		return min;
	}
		public static void main(String[] args) 
	{
		System.out.println(" "  + smallest());
	}
}

