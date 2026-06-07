
import java.util.Scanner;
public class loop5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n =");
        int n = sc.nextInt();
        sc.close();
        //4,10,16,22.....n
        for(int i=4; i<=6*n-2;i=i+6){
            System.out.print(i+" ");

        }
    }
    
}
