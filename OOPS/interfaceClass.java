public class interfaceClass {

    public static void main(String [] args){

        queen q= new queen();
        king k=new king();

        k.moves();

        q.moves();

    }
    
}

interface ChessPlayer{
    void moves();
}

class queen implements ChessPlayer{
   public void moves(){
        System.out.println("move up,down ,left ,right,diagonal in all direction");
    }
}

class hook implements ChessPlayer{
   public void moves(){
        System.out.println("move up,down ,left ,right ");
    }
}

class king  implements ChessPlayer{
   public void moves(){
        System.out.println("move up,down ,left ,right (by 1 step)");
    }
}