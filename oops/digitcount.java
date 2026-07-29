public class digitcount
{
    public int countnumber(int n){
        int count=0;
		if(n==0){
		    return 1;
		}
		while(n>0){
		    n=n/10;
		    count++;
		}
		return count;
    }
	public static void main(String[] args) {
		int n=5478;
		digitcount obj=new digitcount();
		System.out.println(obj.countnumber(n));
		
	}
}