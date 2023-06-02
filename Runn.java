import java.util.*;

class Runn implements Runnable{

    public void run(){

        try{

            System.out.println("Enter a number : ");

            Scanner input = new Scanner(System.in);

            int num = input.nextInt();

            multiply(num);

        }

        catch(InputMismatchException obj){

            System.out.println("invalid input! ");

        }

}

    synchronized void multiply(int num){

        for (int i = 0;i<=6;i++){

            try {

                Thread.sleep(1000);

            } catch (InterruptedException e) {

                // TODO Auto-generated catch block

                e.printStackTrace();

            }

            System.out.println(num+ " * " +i+ " = " +num*i);

        }

    }

    public static void main(String[] args)  {

        Runn t1 = new Runn();

        Runn t2 = new Runn();

        t1.run();

        t2.run();

    }

}