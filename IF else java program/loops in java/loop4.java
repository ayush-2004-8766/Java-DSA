//take n input and display this AP = 2,5,8,11....n?
import java.util.Scanner;
public class loop4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n =");
        int n = sc.nextInt();
        sc.close();
        for(int i=2; i<=3*n-1; i=i+3){
            System.out.print(i+" ");
        }

    }
    
}
