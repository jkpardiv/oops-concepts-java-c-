class Student{
     void prepare(){
        System.out.println("Prepare for exams");
     }
}
class Sem extends Student{
    void prepare(){
        System.out.println("Students prepare for sem");
    }
}
class Mid extends Student{
    void prepare(){
        System.out.println("Students won't prepare seriously for mid");
    }
}
class Overriding{
public static void main(String[] args){
    Mid k=new Mid();
    k.prepare();
    Sem a=new Sem();
    a.prepare();
}
}