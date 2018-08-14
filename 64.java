import java.util.Scanner;
 class sum
 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int p;
		p=n+m;
		if(p%2==0)
		{
			System.out.print("even");
		}		
		else
		{
			System.out.print("odd");
		}
	}

}
