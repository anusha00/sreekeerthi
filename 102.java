import java.util.*;
import java.lang.*;
import java.util.ArrayList;
 class Ideone
 {
    public static void main(String aa[]){
    int a;
    int c;
   Scanner s=new Scanner(System.in);
   a=s.nextInt();
   while(a!=1){
       if(a%2!=0){
          c=a;
          break;
       }
       a=a/2;
   }
    System.out.println(a+"\n");          
   }
}
