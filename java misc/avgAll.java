public class avgAll {
    public static void main(String[] args) {
        int n = 321875;
        int sum = 0;
        int count = 0;
        while(n!=0){
            int d = n%10;
            n=n/10;
            sum+=d;
            count++;
        }
        System.out.println("\nAverage of all digits is " + (sum/count));
    }
}
