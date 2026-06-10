import java.util.Scanner;

public class swapTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        
        System.out.println(a+" "+b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }
    
}
