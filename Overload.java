class Parent{
    void add(int a,int b){
        System.out.println(a+b);
    }
        void add(int a,int b,int c){
            System.out.println(a+b+c);
        }
}
class Child extends Parent{
    void add(double a,double b){
        System.out.println(a+b);
    }
}
class Overload{
    public static void main(String[] args){
        Child k=new Child();
        k.add(4,5);
        k.add(4,5,6);
        k.add(3.4,5.2);  
    }
}