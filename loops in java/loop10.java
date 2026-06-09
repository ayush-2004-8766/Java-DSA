//Take a number input and print all of its factor?
import java.util.Scanner;
public class loop10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number = ");
        int n = sc.nextInt();
        sc.close();
        for(int i = 1; i <= n/2; i++){
            if(n%i==0){
                System.out.print(i+" ");
                System.out.print(n/i + " ");
            }
        }
    }
}