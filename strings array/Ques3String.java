// convert integwer to string ?
import java.util.Scanner;
public class Ques3String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any Number :");
        int n = sc.nextInt();
        String s = Integer.toString(n);
        System.out.println("your enter string :"+s);
        sc.close();
    }
    
}
