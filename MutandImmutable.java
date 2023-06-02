class MutandImmutable{
    private String a;
    MutandImmutable(String k){
        a=k;
    }
    public String get(){
        return a;
    }
    public void set(String l){
        a=l;
    }
    public static void main(String[] args){
        MutandImmutable k=new MutandImmutable("rohit");
        System.out.println(k.get());
        k.set("virat");
        System.out.println(k.get());
    }
}