import java.util.Arrays;
import java.util.Scanner;
class max
{
public static void main(String args[]){
	int n;
	Scanner arun=new Scanner(System.in);
	n=arun.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++){
		a[i]=arun.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[0]+" "+a[a.length-1]);
	}
	}
