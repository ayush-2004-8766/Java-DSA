// print number from 0 to N?
import java.util.Scanner;
public class Question3 {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        n = sc.nextInt();
        print(1);
        sc.close();
        
    }
    public static void print(int x) {
        if(x>n)return;
        System.out.println(x);
        print(x+1);
        
    }
    
}
