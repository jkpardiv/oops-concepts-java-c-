import java.util.*;
class Arraylist6{
    public static void main(String[] args){
        ArrayList<String> items=new  ArrayList<String>();
        items.add("rohit");
        items.add("virat");
        items.add("surya");
        System.out.println(items);
        System.out.println(items.size());
        items.remove("surya");
        System.out.println(items);
        items.set(1,"kohli");
        System.out.println(items);
        items.clear();
        System.out.println(items);
    }
}