class abstimple
{
public static void main(String[] args) {
    horse h= new horse();
    h.eat();
    h.walk();
    System.out.println("next line..");

    cock c=new cock();
    c.eat();
    c.walk();
    
}
}
abstract class animal{
    void eat(){
        System.out.println("eating..");
    }
    abstract void walk();
}
class horse extends animal{
    void walk(){
        System.out.println("running..");
    }
}
class cock extends animal{
    void walk(){
        System.out.println("flying");
    }
}