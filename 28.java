import java.util.*;
class te {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int arrSize=in.nextInt();
	int arr[]=new int[arrSize];
	int mid=arr.length;
	for(int i=0;i<arr.length;i++) {
		arr[i]=in.nextInt();
	}
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]+" "+i);
	}
}
}
