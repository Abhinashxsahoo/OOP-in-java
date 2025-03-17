public class FactEach {
    public static void main(String[] args) {
        int n = 321875;
        while(n!=0){
            int d = n%10;
            n=n/10;
            int fact = 1;
            for(int i=1;i<=d;i++){
                fact*=i;
            }
            System.out.println(fact);
        }
    }
    
}
