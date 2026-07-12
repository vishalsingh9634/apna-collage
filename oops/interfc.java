public class interfc {
    public static void main(String[] args) {
        king k =new king();
    k.move();
    }
    
}
 /**
  * Innerinterfc
  */
 interface chess {
    void move();
    
 }
  class king implements chess{
    public void move(){
        System.out.println("up,left,right,down");
    }
  }
  class queen implements chess{
    public void move(){
        System.out.println("up,left,right,down,diagonal");

    }
  }