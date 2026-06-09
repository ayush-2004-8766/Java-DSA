//take input and print factorial of number?
import java.util.Scanner;
public class factorialLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number =");
        int n = sc.nextInt();
        sc.close();
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("factorial of the given number = " + fact);
    }
    
}
