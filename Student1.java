class Student1{
    String collegeName,fullName;
    int collegeCode;
    double sempercentage;
    Student1(){
        collegeName="MVGR";
        collegeCode=33;
    }
    Student1(String x,double y){
        fullName=x;
        sempercentage=y;
    }
    Student1(Student1 k1,Student1 k2){
        collegeName=k1.collegeName;
        collegeCode=k1.collegeCode;
        fullName=k2.fullName;
        sempercentage=k2.sempercentage;
    }
    void display(){
        System.out.println("college name is :"+ collegeName);
        System.out.println("college code is :"+collegeCode);
        System.out.println("full name is :"+ fullName);
        System.out.println("sempercentage is :"+sempercentage);
    }
    public static void main(String[] args){
        Student1 s1=new Student1();
        Student1 s2=new Student1("koushik",86.5);
        Student1 s3=new Student1(s1,s2);
        s3.display();
    }
}