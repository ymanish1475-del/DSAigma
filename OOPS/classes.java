// package OOPS;

public class classes {

    public static void main(String[] args) {
        // PEN p=new PEN();

        // p.setColor("blue");
        // p.setTip(8);

        // System.out.println(p.color);
        // System.out.println(p.tip);

        // Bank b=new Bank();

        // b.userName="manish yadav";
        // // b.password="bhnha";
        // b.setPass("mno");

        // System.out.println(b.password);
        setColor("yellow");
        

    }
    
}


class Bank{

    String userName;
    private String password;

    void setPass(String pwd){
        password=pwd;
    }
}

 class PEN{
    String color;
    int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        color=newColor;
    }

    void setTip(int newTip){
        tip=newTip;
    }
}