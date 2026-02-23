public class subsrting {
    public static String print(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr +=str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str="vishal singh";

        // used by function
        System.out.println(str.substring(1,4));
        // without used function
        System.out.println(print(str,1,4));
    }
}
