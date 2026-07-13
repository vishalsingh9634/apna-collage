public class classobj{
    public static void main(String[] args) {
        student s=new student();
        s.name="vishal";
        s.roll_no=10;
        s.marks=45;

        student s1=new student();
        s1.name="anjali";
        s1.roll_no=11;
        s1.marks=75;

        s.displaydetails();
        s1.displaydetails();

        employee e=new employee();
        e.id=1;
        e.name="aryan";
        e.salary=40000;

        employee e1=new employee();
        e1.id=2;
        e1.name="sandhya";
        e1.salary=30000;

        e.display();
        e1.display();
    }
}
class student {
    String name;
    int roll_no;
    int marks;

    void displaydetails(){
        System.out.println("name :"+name);
        System.out.println("roll_no :"+roll_no);
        System.out.println("marks :"+marks);
    }

}
class employee{
    int id;
    String name;
    int salary;
 int annual_salary(){
    return salary*12;
 }
 void display(){
    System.out.println("id :"+id);
    System.out.println("name :"+name);
    System.out.println("salary :"+salary);
    System.out.println("annual_salary :"+annual_salary());
 }
}

