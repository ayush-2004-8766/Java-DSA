import java.util.Scanner;
public class reverseloop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number =");
        int n = sc.nextInt();
        sc.close();
        int r = 0;
        while (n!=0) {
            r = r*10;
            r= r+(n%10);
            n = n/10;
        }
        System.out.println("your reverse number = " + r);
    }
    
}
