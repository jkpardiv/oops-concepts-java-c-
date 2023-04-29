class AccessSpecifierDemo{
    private int priVar;
    protected int proVar;
    public int pubVar;
    public void setVar(int priValue,int proValue, int pubValue){
        priVar=priValue;
        proVar=proValue;
        pubVar=pubValue;
    }
    public void getVar(){
        System.out.println("private variable: "+priVar);
        System.out.println("protected variable: "+proVar);
        System.out.println("public variable: "+pubVar);  
    }
    public static void main(String[] args){
        AccessSpecifierDemo k=new AccessSpecifierDemo();
        k.setVar(5,6,7);
        k.getVar();
    }
}