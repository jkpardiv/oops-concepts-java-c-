class Student{
    String fullName,collegename;
    int rollNum,collegecode;
    Student(String x,String y,int z,int a){
        fullName=x;
        collegename=y;
        rollNum=z;
        collegecode=a;
    }
    void display(){
        System.out.println("name is :"+fullName);
        System.out.println("collegename is :"+collegename);
        System.out.println("roll number is:"+rollNum);
        System.out.println("college code is :"+collegecode);
    }
    protected void finalize (){
        System.out.println("it is a destructor");
    }
    public static void main(String[] args){
        System.out.println("------STUDENT DETAILS-----");
        Student s1=new Student("kp","mvgr",570,33);
        s1.display();
        s1=null;
        System.gc();
    }
}