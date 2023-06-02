interface Student{
   public void prepare();
}
class Sem implements Student{
        public void prepare(){
       System.out.println("Students prepare for sem");
   }
}
class Mid implements Student{
        public void prepare(){
       System.out.println("Students won't prepare seriously for mid");
   }
}
class Abstr{
public static void main(String[] args){
   Mid k=new Mid();
   k.prepare();
   Sem a=new Sem();
   a.prepare();
   }
}