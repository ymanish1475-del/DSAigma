public class constructor {

    public static void main(String[] args) {

        Student s1=new Student();
        // Student s2=new Student(69) ;
        // Student s3=new Student();
        // Student s4=new Student("manish", 71);
        // System.out.println(s1.name);
        // System.out.println(s2.rollNo);
        // System.out.println(s1.name);

        s1.name="manish yadav";
        s1.rollNo=78;
        s1.password="abc";

        Student s2=new Student(s1);

        System.out.println(s2.name);



        
    }
    
}

class Student{
    String name;
    int rollNo;
    String password;

    Student(String name){
        this.name=name;
        // System.out.println("constructor is called");

    }

    Student(){
        System.out.println("constructor is called");
    }
    Student(int roll){
        this.rollNo=roll;
    }
    

}
