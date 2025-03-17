import java.util.Scanner;
public class EncodeName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        String res= "";
        int diff;
        if(name.length() %2 == 0) {
            for(int i=0,j=name.length()-1;i<j;i++,j--) {
                diff=Math.abs(name.charAt(i)-name.charAt(j));
                res+=diff;
            }
        } else {
            for(int i=0,j=name.length()-1;i<j;i++,j--) {
                diff=Math.abs(name.charAt(i)-name.charAt(j));
                res+=diff;
            }
            int num= name.length()/2;   
            res+=(name.charAt(num)-65)-name.length();
        }
        System.out.println(res);
        sc.close();
    }
}