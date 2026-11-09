// package OOPS;


  public class classes{

    public static void main(String[] args) {
        // Pen p1= new Pen();

        // p1.setColor("red");
        // p1.setTip(6);
        // System.out.println(p1.color);
        // System.out.println(p1.tip);
        // // p1.setColor("redice");
        // p1.color="white";
        // System.out.println(p1.color);

        Bank b=new Bank();

        b.name="wow";
        b.setPassword("heelo");
        // System.out.println(b.password);



    }
  }

  class Bank{
    public String name;
    // private String password;

    public void setPassword(String pwd){
        // password=pwd;
    }

  }

  class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }

  }

  class Student{
    String name;
    int age;
    float cgpa;

    void calcCgpa(int p,int m,int c){
        cgpa= (p+c+m)/3;
    }
  }