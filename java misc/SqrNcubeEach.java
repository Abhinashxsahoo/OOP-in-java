public class SqrNcubeEach {
    public static void main(String[] args) {
        int n = 321875;
        while(n!=0){
            int d = n%10;
            n=n/10;
            System.out.println("Square of " + d + " is " + d*d);
            System.out.println("Cube of " + d + " is " + d*d*d);
            System.out.println("\n");
        }
    }
}
