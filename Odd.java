import java.lang.*;
import java.util.Scanner;
public class Odd{
   public static void main(String args[]){
       oddoreven();
   }
   public static void oddoreven(){
   Scanner x=new Scanner(System.in);
   System.out.println("Enter a number ");
   int y;
   y=x.nextInt();
   if(y%2==0)
       System.out.println("it is even");
   else
       System.out.println("it is odd");
   }
}
