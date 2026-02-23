public class stringcompare {

    public static void main(String[] args) {
        String str1="vishal";
        String str2="vishal";
        String str3=new String("vishal");
        if(str1==str2){
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
        if(str1==str3){
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
        if(str1.equals(str3)){
            System.out.println("equal");
        }
         else {
            System.out.println("not equal");
        }
    }
}
