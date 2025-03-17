import java.util.Scanner;
public class MuText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
        
            for (int i=1;i<=10;i++){
                System.out.println(num + " x " + i + " = " + num*i);
            }

            System.out.println("Do you want to exit? (Y/N)");
            char ch = sc.next().charAt(0);
            if (ch == 'Y' || ch == 'y'){
                break;
            }
        }
    }
}