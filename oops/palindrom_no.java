public class palindrom_no {
    public boolean palindrom(int n){
        int number=n;
        int reverse_no=0;
        if(n<0){
            return false;
        }
        while(n!=0){
            int digit=n%10;
            reverse_no=digit+reverse_no*10;
            n=n/10;
        }
        if(reverse_no==number){
                return true;
            }
        return false;
    }
    public static void main(String[] args) {
        int n=121;
        palindrom_no obj=new palindrom_no();
        System.out.println(obj.palindrom(n));

    }
}
