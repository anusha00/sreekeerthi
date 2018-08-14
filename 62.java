import java.util.*;
import java.lang.*;
import java.io.*;
class binary
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int number=1000;
		boolean isBinary = true;

		int copyOfNumber = number;

		while (copyOfNumber != 0) {
			int temp = copyOfNumber % 10; // Gives last digit of the number

			if (temp > 1) {
				isBinary = false;
				break;
			} else {
				copyOfNumber = copyOfNumber / 10;
			}
		}

		if (isBinary) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}

