// Display GP = 1,2,4,8.....n terms
import java.util.Scanner;
public class loop7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n = ");
        int n = sc.nextInt();
        sc.close();
        int a=1;
        int r=2;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a=a*r;
        }
    }

    
}
