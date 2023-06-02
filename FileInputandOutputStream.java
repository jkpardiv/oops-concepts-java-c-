import java.io.*;
import java.util.Scanner;
class FileInputandOutputStream{
    public static void main(String[] args)throws Exception{
        try
        {
        Scanner input=new Scanner(System.in);
        System.out.println("enter source file");
        String source=input.nextLine();
        System.out.println("enter destination file");
        String dest=input.nextLine();
        File f1=new File(source);
        File f2=new File(dest);
        copyFile(f1,f2);
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
             e.printStackTrace();
        }
 }
public static void copyFile(File f1,File f2)throws Exception{
    FileInputStream input=new FileInputStream(f1);
    FileOutputStream output=new FileOutputStream(f2);
    try{
        int ch=input.read();
        while(ch!=-1){
            output.write(ch);
            ch=input.read();
        }
    }
        finally{
            if(input!=null){
                input.close();
            }
            if(output!=null){
                output.close();
            }
        }
        System.out.println("file copied successfully");
    }
}