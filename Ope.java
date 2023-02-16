import java.util.Scanner;
public class Ope {
    public static void main(String[] args)
    {
       
        int x=0;
        Scanner input=new Scanner(System.in);
        System.out.println("enter two numbers :");
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println("enter any operator");
        char ch=input.next().charAt(0);
        if (ch == '+')
        {
            x=a+b;
        }
        else if(ch == '-')
        {
            x=a-b;
        }
       else if(ch == '*')
        {
            x=a*b;
        }
        System.out.println(x);
       
    }
   
}
