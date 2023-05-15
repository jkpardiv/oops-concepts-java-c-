import java.util.*;
class Arraylist4{
    public static void main(String[] args){
        ArrayList<String> items=new  ArrayList<String>();
        items.add("rohit");
        items.add("virat");
        items.add("surya");
        System.out.println(items);
        items.remove("virat");
        System.out.println(items);
    }
}