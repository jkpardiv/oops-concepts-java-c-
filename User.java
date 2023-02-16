import java.util.Scanner;
public class User {
   public static void main(String[] args){
       Scanner x=new Scanner(System.in);
       String name;
       System.out.println("enter user name:");
       name=x.nextLine();
       if(String(name)){
       System.out.println("Hello "+name);
       }
   }
   public static boolean String(String str){
       int i;
       for(i=0;i<str.length();i++){
        if((str.charAt(i)>='A'&& str.charAt(i)<='Z')||(str.charAt(i)>='a'&&str.charAt(i)<='z')){
            return true;
        }
    }
    return false;
}
}
