public class classandobj {
    public static void main(String[] args) {
    pen p=new pen();
    p.setcolour("blue");
    p.setprice(20);
    System.out.println(p.colour);
    System.out.println(p.price);
    }
}

class pen{
    String colour;
    int price;
    void setcolour(String newcolour){
        colour=newcolour;
    }
    void setprice(int newprice){
        price =newprice;
    }
}