// take input print sum of digit of a number
import java.util.Scanner;
public class loop13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number = ");
        int n = sc.nextInt();
        sc.close();
         int sum = 0;
        while(n!=0){
            sum += n%10;
            n=n/10;
        }
        System.out.println("sum of the given number =" + sum);
    }
    
}
