class Animal{
    void eat(){
        System.out.println("Animals can eat");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dogs barks");
    }
}
public class Inheritance{
    public static void main(String[] args) {
        Dog k =new Dog();
        k.eat();
        k.bark();    
    }
}