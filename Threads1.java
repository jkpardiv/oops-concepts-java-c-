import java.util.*;

class Threads1 extends Thread{

    public void run()

    {

        System.out.println("Enter any number: ");

        Scanner in = new Scanner(System.in);

        int n=in.nextInt();

        multiply(n);

    }

   synchronized void multiply(int n){

        for(int i=0;i<=10;i++){

            System.out.println(n +"*"+i+"=" +(n*i));

        }

    }

    public static void main(String[] args){

        Threads obj=new Threads();

        Threads obj1=new Threads();

        obj.start();

        obj1.start();

    }

}