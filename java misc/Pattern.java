public class Pattern {
    public static void main(String[] args) {

        for (int i = 1; i <=9; i++) {
            for (int j = 1; j <=13; j++) {
                if ( i==3||i==7||i+j==8|| i-j==2 || j-i==6 || i+j==16) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); 
        }
    }
}
