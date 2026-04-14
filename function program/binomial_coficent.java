// nCr=!n/ir(n-r)!
public class binomial_coficent {
    public static int fact1(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;        
        }
        return fact;
    }
    public static int binomial_coficent(int n,int r){
        
        int bino_fact= fact1(n)/(fact1(r) * fact1(n-r));
        return bino_fact;
    }
    public static void main(String[] args) {
        System.out.println(binomial_coficent(5, 2));
    }
}
