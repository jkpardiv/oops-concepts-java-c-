class Addition{
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int x,int y,int z){
        System.out.println(x+y+z);
    }
    void add(double a,double b){
        System.out.println(a+b);
    }
    void add(int a,double b){
        System.out.println(a+b);
    }
}
class Overload1{
    public static void main(String[] args){
        Addition k=new Addition();
        k.add(4,5);
        k.add(4,5,9);
        k.add(4.2,5.4);
        k.add(4,5.4);
    }
}