//'a' rais to the power 'b'?
import java.util.Scanner;
public class loop14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of a = ");
        int a = sc.nextInt();
        System.out.print("enter the value of b = ");
        int b = sc.nextInt();
        sc.close();
        int power = 1;
        for(int i=1; i<=b;i++){
            power = power*a;

        }
        System.out.println(power);

        }
    
}
