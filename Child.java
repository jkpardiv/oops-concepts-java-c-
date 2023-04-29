class Parent{
    public int x=4;
    protected int y=5;
    private int z=3;
}
class Child extends Parent{
    void display(){
        System.out.println("X:"+x);
        System.out.println("Y:"+y);
    }
   public static void main(String[] args) {
        Child k=new Child();
        k.display();
    }
}
