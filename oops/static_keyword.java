public class static_keyword {
    public static void main(String[] args) {
        student s=new student();
        s.name="vishal";
        System.out.println(s.name);
    }
}
class student{
    String name;
    int age;
    String schoolname;
    void setname(String name){
        this.name=name;
    }
    String getname(){
        return this.name;
    }
}