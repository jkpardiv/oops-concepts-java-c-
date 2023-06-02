abstract class Student{
    void prepare(){
       System.out.println("Prepare for exams");
    }
    abstract void enjoy();
}
class Sem extends Student{
   void enjoy(){
       System.out.println("No Student enjoy before sem");
   }
}
class Mid extends Student{
   void enjoy(){
       System.out.println("Some Students enjoy for mid");
   }
}
class ParAbstr{
public static void main(String[] args){
   Mid k=new Mid();
   k.prepare();
   k.enjoy();
   Sem a=new Sem();
   a.enjoy();
}
}