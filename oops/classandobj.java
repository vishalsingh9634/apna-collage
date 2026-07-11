public class classandobj {
    public static void main(String[] args) {
    pen p=new pen();
    p.setcolour("blue");
    p.setprice(20);
    System.out.println(p.getcolour());
    System.out.println(p.getprice());
    p.setcolour("yellow");
    System.out.println(p.getcolour());
    }
}

class pen{
    private String colour;
    private int price;
    String getcolour(){
        return this.colour;
    }
    int getprice(){
        return this.price;
    }
    void setcolour(String newcolour){
        this.colour=newcolour;
    }
    void setprice(int newprice){
        this.price =newprice;
    }
}