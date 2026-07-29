public class reverse_number {
    public int reverse_no(int n){
        int reverse_num=0;
        
        while(n>0){
            int number=n%10;
            reverse_num=number+reverse_num*10;
            n=n/10;
        }
        
        return reverse_num;
    }
    public static void main(String[] args) {
        int n=1234;
        reverse_number obj=new reverse_number();
        System.out.println(obj.reverse_no(n));

    }
}
