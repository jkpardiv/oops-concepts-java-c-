class Animal{
    void eat(){
        System.out.println("Animas can eat");
    }
}
//single level//
class Dog extends Animal{
    void bark(){
        System.out.println("Dogs barks");
    }
}
//Multi level //
class Puppy extends Dog{
    void sleep(){
        System.out.println("Puppys can Sleep");
    }
}
//hierarchial inheritance//
class Lion extends Animal{
    void roar(){
        System.out.println("Lions roars");
    }
    public static void main(String[] args) {
        Dog k=new Dog();
        Puppy l=new Puppy();
        Lion m=new Lion();
        System.out.println("---Single level inheritance---");
        k.eat();
        k.bark();
        System.out.println("---Multi level inheritance---");
        l.eat();
        l.bark();
        l.sleep();
        System.out.println("---Hierarchial level inheritance---");
        m.eat();
        m.roar();

    }
}