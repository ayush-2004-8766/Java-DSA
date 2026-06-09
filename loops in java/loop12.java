//Take input and count digit of a numbers?
import java.util.Scanner;
public class loop12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number = ");
        int x = sc.nextInt();
        sc.close();
        int count = 0;
        while(x!=0){
            x = x/10;
            count++;
        }
        System.out.println("count of given number is = " + count);
    }
    
}
