import java.util.Scanner;
 class composite
 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int count=0;
		for(int i=1;i<=num;i++)
		{  
			if(num%i==0)
			{
				count++;
			}
		}if(count>2)
			{
				System.out.println("yes");
			}else
				System.out.println("no");		
	}
}