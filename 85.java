import java.util.Arrays;
import java.util.Scanner;
class Set85 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		s=s.toUpperCase();
		String s1[]=s.split("");
		String a="",b="";
		for(int i=0;i<s1.length;i++){
				if(i%2==0)
					a=a+s1[i];
				else
					b=b+s1[i];
		}
		System.out.println(a+" "+b);
	}
}
