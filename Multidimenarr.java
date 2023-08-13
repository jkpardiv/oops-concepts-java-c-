import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        int y=obj.nextInt();
        int[][] arr=new int[x][y];
        for(int i=0;i<x;++i){
            for(int j=0;j<y;++j){
                arr[i][j]=obj.nextInt();
            }
        }
        System.out.println("elements in array are");
        for(int i=0;i<x;++i){
            for(int j=0;j<y;++j){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}