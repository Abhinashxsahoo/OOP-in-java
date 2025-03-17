
public class  SumSingle{
    public static void main(String[] args) {
        int n = 9657;
        int sum = 0, sum1 = 0;
        while(n!=0){
            int d = n%10;
            n=n/10;
            sum+=d;
        }
        if(sum>9){
            while(sum!=0){
                int x = sum%10;
                sum=sum/10;
                sum1+=x;
            }
        }
        System.out.println(sum1);
    }
}