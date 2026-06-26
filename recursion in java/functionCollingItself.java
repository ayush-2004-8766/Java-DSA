// Print n to 1?
import java.util.Scanner;
public class functionCollingItself {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n = sc.nextInt();
        print(n);
        sc.close();
    }
    public static void print(int n) {
        if(n==0)return;
        System.out.println(n);
        print(n-1);
        
    }

    
}
